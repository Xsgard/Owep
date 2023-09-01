package com.kclm.owep.service.impl;

import com.github.pagehelper.PageHelper;
import com.kclm.owep.convert.StudentConvert;
import com.kclm.owep.dto.StudentDTO;
import com.kclm.owep.entity.Student;
import com.kclm.owep.mapper.StudentMapper;
import com.kclm.owep.service.StudentService;
import com.kclm.owep.utils.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Asgard
 * @version 1.0
 * @description: TODO
 * @date 2023/8/31 15:01
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentConvert studentConvert;

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
        int save = studentMapper.save(student);
        if (save < 1)
            throw new BusinessException("保存学生信息失败！");
    }

}
