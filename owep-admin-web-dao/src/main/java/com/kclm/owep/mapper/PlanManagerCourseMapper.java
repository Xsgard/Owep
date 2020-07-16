/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.PlanManagerCourse;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/6 14:04
 *@Description 持久层接口PlanManagerCourseMapper
 *
 */
@Mapper
public interface PlanManagerCourseMapper extends BaseMapper<PlanManagerCourse> {

    /**
     * 通过方案id查询设置的课程
     * @return
     */
    List<PlanManagerCourse> selectAllById(Serializable id);


    @Override
    int save(PlanManagerCourse entity);

    @Override
    int update(PlanManagerCourse entity);

    @Override
    int deleteById(Serializable id);

}