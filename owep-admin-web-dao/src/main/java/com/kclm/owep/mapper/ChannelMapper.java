/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.Channel;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/6 14:04
 *@Description 持久层接口ChannelMapper
 *
 */
@Mapper
public interface ChannelMapper extends BaseMapper<Channel> {

    /**
     * 通过渠道类型的id获取,获取相应的渠道
     * @return
     */
    List<Channel> selectByChannelTypeId(Serializable id);

    @Override
    int save(Channel entity);

    @Override
    int update(Channel entity);

    @Override
    int deleteSelect(List<Serializable> idList);

    @Override
    Channel selectById(Serializable id);

}