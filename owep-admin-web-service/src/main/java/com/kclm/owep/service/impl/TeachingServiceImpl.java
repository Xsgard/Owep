/*********************
 * 2018-2021 版权所有 CopyRight（c）
 */
package com.kclm.owep.service.impl;

import com.github.pagehelper.PageHelper;
import com.kclm.owep.dto.ClassDTO;
import com.kclm.owep.dto.TeachingDTO;
import com.kclm.owep.entity.*;
import com.kclm.owep.mapper.*;
import com.kclm.owep.service.TeachingService;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*********************
 * @Auther shentr
 * @Version V1.0
 * @Create 2020/7/14 9:05
 * @Description 授课管理业务层接口
 */
@Service
public class TeachingServiceImpl implements TeachingService {
    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private EvaluateMapper evaluateMapper;
    @Autowired
    private LeaveMapper leaveMapper;
    @Autowired
    private IllegalMapper illegalMapper;
    @Autowired
    private ResourceMapper resourceMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private HomeworkMapper homeworkMapper;
    @Autowired
    private MapperFactory mapperFactory;

    /**
     * 获取班级数据
     */
    @Override
    public List<ClassDTO> findAllClass() {
        //PageHelper.startPage(1,5);
        List<Clazz> clazzList = clazzMapper.selectAll();
        MapperFacade mapperFacade = this.mapperFactory.getMapperFacade();
        List<ClassDTO> classDTOS = mapperFacade.mapAsList(clazzList, ClassDTO.class);
        return classDTOS;
    }

    /**
     * 根据条件，获取班级数据
     */
    @Override
    public List<ClassDTO> findClassByConditions(String classNumber, String className, String instituteName, String branchName, String profession) {
        return null;
    }

    /**
     * 根据classid获取一个班级的 信息、问题、资源、作业、评价、请假、违规的数据
     */
    @Override
    public List<TeachingDTO> evaluateTeachingDto(Serializable classId) {
        List<Evaluate> evaluateList = evaluateMapper.selectByClassId(classId);
        MapperFacade mapperFacade = this.mapperFactory.getMapperFacade();
        List<TeachingDTO> teachingEvaluate = mapperFacade.mapAsList(evaluateList, TeachingDTO.class);
        mapperFacade.mapAsList(evaluateList,TeachingDTO.class);
        return teachingEvaluate;


        //Clazz clazz = clazzMapper.selectById(classId);
        //List<Illegal> illegalList = illegalMapper.selectByClassId(classId);
        //List<Leave> leaveList = leaveMapper.selectByClassId(classId);

        //List<Clazz> clazzes = Arrays.asList(clazz);
        //List<TeachingDTO> teachingClass = mapperFacade.mapAsList(clazzes, TeachingDTO.class);
        //List<TeachingDTO> teachingLeave = mapperFacade.mapAsList(leaveList, TeachingDTO.class);
        //List<TeachingDTO> teachingIllegal = mapperFacade.mapAsList(illegalList, TeachingDTO.class);
        //teachingClass.addAll(teachingEvaluate);
        //teachingClass.addAll(teachingLeave);
        //teachingClass.addAll(teachingIllegal);
    }

    @Override
    public List<TeachingDTO> leaveTeachingDto(Serializable classId) {
        List<Leave> leaveList = leaveMapper.selectByClassId(classId);
        MapperFacade mapperFacade = this.mapperFactory.getMapperFacade();
        List<TeachingDTO> teachingLeave = mapperFacade.mapAsList(leaveList, TeachingDTO.class);
        return teachingLeave;
    }

    @Override
    public List<TeachingDTO> illegalTeachingDto(Serializable classId) {
        List<Illegal> illegalList = illegalMapper.selectByClassId(classId);
        MapperFacade mapperFacade = this.mapperFactory.getMapperFacade();
        List<TeachingDTO> teachingIllegal = mapperFacade.mapAsList(illegalList, TeachingDTO.class);
        return teachingIllegal;
    }

    @Override
    public List<TeachingDTO> findResourceByName(String resourceName) {
        return null;
    }

    /**
     * 根据id删除资源
     */
    @Override
    public int deleteResourceById(Serializable resourceId) { return resourceMapper.deleteById(resourceId); }

    /**
     * 根据选择的id删除资源
     */
    @Override
    public int deleteSelectResource(List<Serializable> resourceIds) { return resourceMapper.deleteSelect(resourceIds); }

    /**
     * 根据id删除班级问题
     */
    @Override
    public int deleteQuestionById(Serializable questionId) {
        return questionMapper.deleteById(questionId);
    }

    /**
     * 根据id获取问题详情
     */
    @Override
    public TeachingDTO findQuestionById(Serializable questionId) {
        Question question = questionMapper.selectById(questionId);
        MapperFacade mapperFacade = this.mapperFactory.getMapperFacade();
        return mapperFacade.map(Question.class,TeachingDTO.class);
    }

    /**
     * 更新问题
     */
    @Override
    public int updateQuestion(Question question) { return questionMapper.update(question); }

    /**
     * 根据id获取作业详情
     */
    @Override
    public TeachingDTO findHomeworkById(Serializable homeworkId) {
        Homework homework = homeworkMapper.selectById(homeworkId);
        MapperFacade mapperFacade = this.mapperFactory.getMapperFacade();
        return mapperFacade.map(homework,TeachingDTO.class);
    }

    /**
     * 更新作业 审批内容
     */
    @Override
    public int updateHomework(Homework homework) {
        return homeworkMapper.update(homework);
    }

    /**
     * 根据id获取学生评价详情
     */
    @Override
    public TeachingDTO findEvaluateById(Serializable evaluateId) {
        Evaluate evaluate = evaluateMapper.selectById(evaluateId);
        MapperFacade mapperFacade = this.mapperFactory.getMapperFacade();
        return mapperFacade.map(evaluate,TeachingDTO.class);
    }

    /**
     * 更新评价内容
     */
    @Override
    public int updateEvaluate(Evaluate evaluate) {
        return evaluateMapper.update(evaluate);
    }

    /**
     *审批请假数据
     */
    @Override
    public int updateApprovalStatus(Leave leave) {
        return leaveMapper.update(leave);
    }

    /**
     *  根据条件查找违纪数据
     */
    @Override
    public List<TeachingDTO> findIllegalByConditions(String stuNumber, String stuName, LocalDateTime startTime, LocalDateTime endTime) {
        List<Illegal> illegals = illegalMapper.selectByCondition(stuNumber, stuName, startTime, endTime);
        MapperFacade mapperFacade = this.mapperFactory.getMapperFacade();
        return mapperFacade.mapAsList(illegals, TeachingDTO.class);
    }

    /**
     * 根据id删除违纪数据
     */
    @Override
    public int deleteIllegalById(Serializable illegalId) {
        return illegalMapper.deleteById(illegalId);
    }

    /**
     * 添加违纪数据
     */
    @Override
    public int saveIllegal(Illegal illegal) {
        return illegalMapper.save(illegal);
    }
}
