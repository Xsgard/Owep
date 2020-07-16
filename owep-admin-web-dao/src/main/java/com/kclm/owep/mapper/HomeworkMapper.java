/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper;

import com.kclm.owep.entity.Homework;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/*********************
 * @Author: tanj
 * @Version : v1.0
 * @Create: 2020年7月06日 上午17:40:40
 * @Description 班级作业
 */
@Mapper
public interface HomeworkMapper extends BaseMapper<Homework> {
    /***
     * 保存一条记录
     * @param entity
     * @return
     */
    @Override
    int save(Homework entity);

    /***
     * 更新一条记录
     * @param entity
     * @return
     */
    @Override
    int update(Homework entity);

    /***
     * 根据id来删除一条记录
     * @param id
     * @return
     */
    @Override
    int deleteById(@Param("id") Serializable id);

    /***
     * 删除多条记录
     * @param idList
     * @return
     */
    @Override
    int deleteSelect(@Param("idList") List<Serializable> idList);

    /***
     * 根据id来查询一条记录
     * @param id
     * @return
     */
    @Override
    Homework selectById(@Param("id") Serializable id);

    /***
     * 查询所有的记录
     * @return
     */
    @Override
    List<Homework> selectAll();

    /***
     * 根据课程名查询
     * @param courseName
     * @return
     *//*
    List<Homework> selectByCourseName(String courseName);*/
}