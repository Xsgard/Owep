/*********************
 * 2018-2021 版权所有 CopyRight（c）
 */
package com.kclm.owep.service;

import com.kclm.owep.dto.ClassDTO;
import com.kclm.owep.dto.TeachingDTO;
import com.kclm.owep.entity.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/*********************
 * @Auther shentr
 * @Version V1.0
 * @Create 2020/7/10 16:58
 * @Description 授课管理业务层接口
 */
public interface TeachingService {
    /**
     * 获取班级数据
     */
    List<ClassDTO> findAllClass();

    /**
     * 根据条件，获取班级数据
     */
    List<ClassDTO> findClassByConditions(String classNumber,String className,String instituteName,
                                      String branchName,String profession);

    /**
     * 根据classid获取一个班级的 信息、问题、资源、作业、评价、请假、违规的数据
     */
    List<TeachingDTO> evaluateTeachingDto(Serializable classId);
    List<TeachingDTO> leaveTeachingDto(Serializable classId);
    List<TeachingDTO> illegalTeachingDto(Serializable classId);

    /**
     * 根据资源名称查询资源
     */
    List<TeachingDTO> findResourceByName(String resourceName);

    /**
     * 根据id删除资源
     */
    int deleteResourceById(Serializable resourceId);

    /**
     * 根据选择的id删除资源
     */
    int deleteSelectResource(List<Serializable> resourceIds);

    /**
     * 根据id删除班级问题
     */
    int deleteQuestionById(Serializable questionId);

    /**
     * 根据id获取问题详情
     */
    TeachingDTO findQuestionById(Serializable questionId);

    /**
     * 更新问题
     */
    int updateQuestion(Question question);

    /**
     * 根据id获取作业详情
     */
    TeachingDTO findHomeworkById(Serializable homeworkId);

    /**
     * 更新作业 审批内容
     */
    int updateHomework(Homework homework);

    /**
     * 根据id获取学生评价详情
     */
    TeachingDTO findEvaluateById(Serializable evaluateId);

    /**
     * 更新评价内容
     */
    int updateEvaluate(Evaluate evaluate);

    /**
     *审批请假数据
     */
    int updateApprovalStatus(Leave leave);

    /**
     *  根据条件查找违纪数据
     */
    List<TeachingDTO> findIllegalByConditions(String stuNumber, String stuName, LocalDateTime startTime,LocalDateTime endTime);

    /**
     * 根据id删除违纪数据
     */
    int deleteIllegalById(Serializable illegalId);

    /**
     * 添加违纪数据
     */
    int saveIllegal(Illegal illegal);

    /**
     * 获取课程章节数据
     */
    //List<Chapter> findChapter();


}
