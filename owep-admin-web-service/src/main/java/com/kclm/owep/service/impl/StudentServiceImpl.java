package com.kclm.owep.service.impl;

import com.github.pagehelper.PageHelper;
import com.kclm.owep.convert.StudentConvert;
import com.kclm.owep.convert.StudentSuggestConvert;
import com.kclm.owep.dto.NodeDTO;
import com.kclm.owep.dto.StudentDTO;
import com.kclm.owep.dto.StudentSuggestDTO;
import com.kclm.owep.entity.*;
import com.kclm.owep.mapper.*;
import com.kclm.owep.service.StudentService;
import com.kclm.owep.utils.exceptions.BusinessException;
import com.kclm.owep.utils.exceptions.ParameterWrongException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static com.kclm.owep.utils.constant.Constant.NULL_PARAM;

/**
 * @author Asgard
 * @version 1.0
 * @description: StudentServiceImpl
 * @date 2023/8/31 15:01
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private OrgInstituteMapper orgInstituteMapper;
    @Autowired
    private BranchInstituteMapper branchInstituteMapper;
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private ProfessionMapper professionMapper;

    @Autowired
    private StudentSuggestConvert studentSuggestConvert;
    @Autowired
    private StudentConvert studentConvert;

    /**
     * 获取全部学生信息
     *
     * @param order  排序关键字
     * @param limit  每页条数
     * @param offset 偏移量
     * @return 学生DTO集合
     */
    @Override
    public List<StudentDTO> getStudentInfo(String order, Integer limit, Integer offset) {
        PageHelper.offsetPage(offset, limit);
        List<Student> allStudent = studentMapper.getAllStudent(order);
        return allStudent.stream()
                .map(s -> {
                    StudentDTO dto = studentConvert.toDto(s);
                    dto.setGenderText(s.getGender() == null ? "" :
                            s.getGender() == 1 ? "男" : s.getGender() == 0 ? "女" : "未知");
//                    dto.setStuPwd(s.getStuPwd());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    /**
     * 添加学生
     *
     * @param student 学生实体信息
     */
    @Override
    public void addStudent(Student student) {
        if (student.getStuNumber() == null)
            throw new BusinessException("学号不应为空！");
        Integer byStuNum = studentMapper.getByStuNum(student.getStuNumber());
        if (byStuNum > 0)
            throw new BusinessException("学号重复，请检查输入！");
        student.setCreateTime(LocalDateTime.now());
        int save = studentMapper.save(student);
        if (save < 1)
            throw new BusinessException("保存学生信息失败！");
    }

    /**
     * 修改学生信息
     *
     * @param student 学生信息
     */
    @Override
    public void updateStudent(Student student) {
        int update = studentMapper.update(student);
        if (update < 1)
            throw new BusinessException("修改失败！");
    }

    /**
     * 激活、禁用
     *
     * @param id     学生Id
     * @param status 状态
     */
    @Override
    public void stuSwitch(Integer id, Integer status) {
        Student student = studentMapper.getById(id);
        student.setStatus(status);
        studentMapper.update(student);
    }

    /**
     * 获取BsSuggest数据
     *
     * @return StudentSuggestDTO集合
     */
    @Override
    public List<StudentSuggestDTO> getStudentSuggestInfo() {
        List<Student> studentSuggest = studentMapper.getStudentSuggest();
        return studentSuggest.stream().map(item -> {
            StudentSuggestDTO suggestDto = studentSuggestConvert.toSuggestDto(item);
            Integer classId = studentMapper.getStudentClassId(item.getId());
            String className = classMapper.getClassNameById(classId);
            suggestDto.setClassName(className);
            return suggestDto;
        }).collect(Collectors.toList());
    }

    /**
     * 删除学生信息
     *
     * @param id 学生Id
     */
    @Override
    public void deleteById(Serializable id) {
        if (id == null)
            throw new ParameterWrongException(NULL_PARAM, "id为空！");
        int i = studentMapper.deleteById(id);
        if (i < 1)
            throw new BusinessException("删除失败！");
    }

    /**
     * 批量删除
     *
     * @param ids 选中的Id
     */
    @Override
    @Transactional
    public void deleteByIds(List<Serializable> ids) {
        if (ids.isEmpty())
            throw new ParameterWrongException(NULL_PARAM, "ids为空！");
        int i = studentMapper.deleteSelect(ids);
        if (i < 1)
            throw new BusinessException("删除失败！");
    }

    /**
     * @return 节点数据
     */
    @Override
    public List<NodeDTO> getClazzTreeCheck(Integer studentId) {
        Integer classId = studentMapper.getStudentClassId(studentId);
        //获取所有组织机构
        List<OrgInstitute> allOrgInstitute = orgInstituteMapper.getAllOrgInstitute();
        //遍历组织机构 --节点 第一层数据（组织机构）
        return allOrgInstitute.stream().map(org -> {
            //组织机构层节点
            NodeDTO nodeForOrg = new NodeDTO();
            //给节点设置组织机构名
            nodeForOrg.setText(org.getInstituteName());
            //给节点设置组织机构Id
            nodeForOrg.setTags(org.getId());
            //根据组织机构Id查询对应的分支
            List<BranchInstitute> branch = branchInstituteMapper.getByOrgId(org.getId());
            //遍历分支集合 --节点 第二层数据（分支）
            List<NodeDTO> nodes = branch.stream().map(b -> {
                //分支节点
                NodeDTO nodeForBranch = new NodeDTO();
                //设置分支名
                nodeForBranch.setTags(b.getId());
                //设置分支Id
                nodeForBranch.setText(b.getBranchName());
                //根据组织机构名和分支名查询专业
                List<Profession> profession = professionMapper
                        .getProfessionByInstName(org.getInstituteName(), b.getBranchName());
                //遍历分支 --节点 第三层数据（专业）
                List<NodeDTO> proNodes = profession.stream().map(p -> {
                    //专业节点
                    NodeDTO nodeForProf = new NodeDTO();
                    //设置专业名
                    nodeForProf.setText(p.getProfName());
                    //设置专业Id
                    nodeForProf.setTags(p.getId());
                    //根据专业Id查询班级表
                    List<Clazz> clazz = classMapper.getClazzInfo(p.getId());
                    List<NodeDTO> clazzNodes = clazz.stream().map(c -> {
                        //班级层节点
                        NodeDTO nodeForClazz = new NodeDTO();
                        //设置班级名
                        nodeForClazz.setText(c.getClassName());
                        //设置班级Id
                        nodeForClazz.setTags(c.getId());
                        //班级Id相同
                        if (c.getId().equals(classId))
                            //设置选中
                            nodeForClazz.nodeChecked();
                        return nodeForClazz;
                    }).collect(Collectors.toList());
                    //设置 班级层节点到专业层节点的Nodes
                    nodeForProf.setNodes(clazzNodes);
                    //返回专业层节点
                    return nodeForProf;
                }).collect(Collectors.toList());
                //设置专业层节点到分支节点的Nodes
                nodeForBranch.setNodes(proNodes);
                //返回分支节点数据
                return nodeForBranch;
            }).collect(Collectors.toList());
            //设置分支层节点数据到组织机构的Nodes
            nodeForOrg.setNodes(nodes);
            //返回组织机构节点数据
            return nodeForOrg;
        }).collect(Collectors.toList());
    }

}
