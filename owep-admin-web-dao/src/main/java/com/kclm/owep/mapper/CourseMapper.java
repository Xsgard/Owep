/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.Chapter;
import com.kclm.owep.entity.Course;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/6 14:04
 *@Description 持久层接口CourseMapper
 *
 */
@Mapper
public interface CourseMapper extends BaseMapper<Course> {


    /**
     * 通过课程名称查询课程
     * @param CourseName
     * @return
     */
    List<Course> selectByCourseName(String CourseName);



    @Override
    int save(Course entity);

    @Override
    int update(Course entity);

    @Override
    int deleteById(Serializable id);

    @Override
    int deleteSelect(List<Serializable> idList);

    @Override
    Course selectById(Serializable id);


    Course findByCourseName(String name);

    @Override
    List<Course> selectAll();

    //通过课程id查询所有章节
    List<Chapter> findChaptersByCourseId(Serializable id);

}