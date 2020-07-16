/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */


package com.kclm.owep.mapper;

import com.kclm.owep.entity.Clazz;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/*********************
 * @Author: tanj
 * @Version : v1.0
 * @Create: 2020年7月06日 下午16:10:40
 * @Description 班级
 */
@Mapper
public interface ClazzMapper extends BaseMapper<Clazz> {
    /***
     * 增
     * @param entity
     * @return
     */
    @Override
    int save(Clazz entity);

    /**
     * 更新
     * @param entity
     * @return
     */
    @Override
    int update(Clazz entity);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Override
    int deleteById(@Param("id") Serializable id);

    /***
     * 删除多个
     * @param idList
     * @return
     */
    @Override
    int deleteSelect(@Param("idList") List<Serializable> idList);

    /***
     *根据id查询
     * @param id
     * @return
     */
    @Override
    Clazz selectById(@Param("id") Serializable id);

    /**
     * 查询所有
     * @return
     */
    @Override
    List<Clazz> selectAll();

   /* *//**
     * 多表查询 根据clazzid来查询clazz和对应的resource
     * @param cid
     * @return
     *//*
    Clazz selectClazzAndRes(@Param("cid") Serializable cid);

    *//***
     * 多表查询 查询所有的clazz并对应的planManage
     * @return
     *//*
    Clazz selectClazzAndPlan(@Param("cid") Serializable cid);
*/
    /***
     * 向t_class_resource 中间表中插入数据
     * @param cid
     * @param rid
     * @return
     */
    int saveClazzResource(@Param("cid") Serializable cid,@Param("rid") Serializable rid);

    /***
     * 删除班级-资源中间表
     * @param cid
     * @return
     */
    int deleteClazzResource(@Param("cid") Serializable cid,@Param("rid") Serializable rid);
    /***
     * 向t_class_planmanage 中间表中插入数据
     * @param cid
     * @param pid
     * @return
     */
    int saveClazzPlanmanage(@Param("cid") Serializable cid,@Param("pid") Serializable pid);

    /***
     * 根据班级id来删除班级方案中间表
     * @param cid
     * @return
     */
    int deleteClazzPlanmanage(@Param("cid") Serializable cid);

    /***
     * 根据班级编号查询
     * @param classNum
     * @return
     */
    List<Clazz> selectByNum(String classNum);

    /***
     * 更加班级名称来查询
     * @param className
     * @return
     */
    List<Clazz> selectByName(String className);

    /***
     * 根据专业方向来查询
     * @param pid
     * @return
     */
    List<Clazz> selectByPro(int pid);

}