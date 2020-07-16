package com.kclm.owep.mapper;

import com.kclm.owep.entity.Video;

import java.io.Serializable;
import java.util.List;

import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/*********************
 * @Author: tanj
 * @Version : v1.0
 * @Create: 2020年7月09日 下午18:10:40
 * @Description 视频
 */
@Mapper
public interface VideoMapper extends BaseMapper<Video> {
    @Override
    int deleteById(@Param("id") Serializable id);

    @Override
    int deleteSelect(@Param("idList") List<Serializable> idList);

    @Override
    Video selectById(@Param("id") Serializable id);
}