/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.SectionVideo;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/6 14:04
 *@Description 持久层接口SectionVideoMapperQ
 *
 */
@Mapper
public interface SectionVideoMapper extends BaseMapper<SectionVideo> {

    /**
     * 通过节id查询
     *
     * @param id
     * @return
     */
    List<SectionVideo> selectAllById(Serializable id);


    @Override
    int save(SectionVideo entity);

    @Override
    int deleteById(Serializable id);
}