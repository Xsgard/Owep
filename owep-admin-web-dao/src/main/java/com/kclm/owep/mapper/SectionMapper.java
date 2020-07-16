/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.Section;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/6 14:04
 *@Description 持久层接口SectionMapper
 *
 */
@Mapper
public interface SectionMapper extends BaseMapper<Section> {

    /**
     * 通过章id，查询所有的节
     * @return
     */
    List<Section> selectAllById(Serializable id);

    @Override
    int save(Section entity);

    @Override
    int update(Section entity);

    @Override
    Section selectById(Serializable id);
}