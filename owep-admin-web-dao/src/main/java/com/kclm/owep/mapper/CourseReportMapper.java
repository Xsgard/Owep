/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.CourseReport;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/6 14:04
 *@Description 持久层接口CourseReportMapper
 *
 */
@Mapper
public interface CourseReportMapper extends BaseMapper<CourseReport> {


    /**
     * 查询单个学生对单个课程的学习记录
     * @return
     */
    CourseReport selectAllByStudentIdAndCourseId(Serializable studentId, Serializable courseId);


    /**
     * 查询单个课程所有学生的学习记录
     * @param courseId
     * @return
     */
    List<CourseReport> selectAllByCourseId(Serializable courseId);

    @Override
    int save(CourseReport entity);

    @Override
    int update(CourseReport entity);

}