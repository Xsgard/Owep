/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.CourseCategory;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/6 14:04
 *@Description 持久层接口CourseCategoryMapper
 *
 */
@Mapper
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {


    /**
     * 通过上级课程分类id查询所有的下级课程分类id
     * @return
     */
    List<CourseCategory> selectSubAll(Serializable id);

    /**
     * 通过课程分类名称查询
     * @param categoryName
     * @return
     */
    CourseCategory selectByCategoryName(String categoryName);

    @Override
    int save(CourseCategory entity);

    @Override
    int update(CourseCategory entity);

    @Override
    int deleteById(Serializable id);

    @Override
    int deleteSelect(List<Serializable> idList);

    @Override
    CourseCategory selectById(Serializable id);

    @Override
    List<CourseCategory> selectAll();
}