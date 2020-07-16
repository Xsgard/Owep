/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.Profession;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
/*********************
 * @Author: tanj
 * @Version : v1.0
 * @Create: 2020年7月06日 上午17:30:40
 * @Description 专业方向
 */
@Mapper
public interface ProfessionMapper extends BaseMapper<Profession> {
    /***
     * 保存一条记录
     * @param entity
     * @return
     */
    @Override
    int save(Profession entity);

    /***
     * 更新一条记录
     * @param entity
     * @return
     */
    @Override
    int update(Profession entity);

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
     * 查询一条记录
     * @param id
     * @return
     */
    @Override
    Profession selectById(@Param("id") Serializable id);

    /***
     * 查询所有的记录
     * @return
     */
    @Override
    List<Profession> selectAll();

    /***
     * 根据专业名称来查询
     * @return
     */
    List<Profession> selectByProName(String proName);

    /***
     * 根据分支类查询
     * @return
     */
    List<Profession> selectByBranchName(String branName);
}