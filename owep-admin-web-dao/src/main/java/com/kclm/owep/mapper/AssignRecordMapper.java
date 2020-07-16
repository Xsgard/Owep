/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.AssignRecord;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/6 14:04
 *@Description 持久层接口AssignRecordMapper
 *
 */
@Mapper
public interface AssignRecordMapper extends BaseMapper<AssignRecord> {

    /**
     * 查询咨询师转出的记录
     * @param id
     * @return
     */
    List<AssignRecord> selectByFormId(Serializable id);

    /**
     * 查询咨询师接收的记录
     * @param id
     * @return
     */
    List<AssignRecord> selectByToId(Serializable id);




}