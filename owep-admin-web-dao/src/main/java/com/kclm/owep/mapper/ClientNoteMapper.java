/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.ClientNote;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/6 14:04
 *@Description 持久层接口ClientNoteMapper
 *
 */
@Mapper
public interface ClientNoteMapper extends BaseMapper<ClientNote> {

    /**
     * 通过客户id 查询客户的跟踪记录
     * @param id
     * @return
     */
    List<ClientNote> selectAllById(Serializable id);

    @Override
    int save(ClientNote entity);

    @Override
    int update(ClientNote entity);

    @Override
    int deleteById(Serializable id);

}