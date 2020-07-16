/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.service;

import com.kclm.owep.entity.Chapter;
import com.kclm.owep.entity.Course;
import com.kclm.owep.entity.Section;
import com.kclm.owep.entity.SectionVideo;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/13 10:16
 *@Description 课程业务接口
 *
 */
public interface CourseService {

    /**
     * 查找所有课程
     * @return
     */
    List<Course> findAllCourse();

    /**
     * 通过课程名查询课程
     */
    List<Course> findCourseByCourseName(String courseName);

    /**
     * 添加课程
     */
    int addCourse(Course course);

    /**
     * 修改课程
     */
    int alterCourse(Course course);

    /**
     * 通过id 删除课程
     */
    int deleteCourseById(Serializable id);

    /**
     * 通过ids 删除多个课程
     * @param id
     * @return
     */
    int deleteCourseByIds(List<Serializable> id);

    /**
     * 通过课程id 查询所有的章
     */
    List<Chapter> findAllChapterByCourseId(Serializable id);

    /**
     * 修改章
     */
    int alterChapter(Chapter chapter);

    /**
     * 通过ChapterId,删除章
     */
    int addChapter(Chapter chapter);

    /**
     * 添加 节
     */
    int addSection(Section section);

    /**
     * 修改节
     */
    int alterSection(Section section);

    /**
     * 通过节id 删除节
     */
    int deleteSection(Serializable id);

    /**
     * 给节 绑定视频
     */
    int addSectionVideo(SectionVideo sectionVideo);

}
