/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.service;

import com.kclm.owep.entity.CourseCategory;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/13 11:08
 *@Description 课程分类业务层接口
 *
 */
public interface CategoryService {

    /**
     * 通过分类名查询分类
     */
    CourseCategory findByCourseCategoryName(String courseCategoryName);

    /**
     *  查询所有的上级课程分类
     */
    List<CourseCategory> findAllCourseCategory();

    /**
     * 修改分类课程
     */
    int alterCourseCategory(CourseCategory courseCategory);

    /**
     *  通过分类id 删除
     */
    int deleteCourseCategory(Serializable id);

}
