package com.kclm.owep.mapper;

import com.kclm.owep.entity.SystemConfig;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: TODO
 * @date 2023/9/4 13:06
 */
@Mapper
public interface SystemConfigMapper extends BaseMapper<SystemConfig> {

    @Select("select * from t_system_config;")
    SystemConfig getSystemConfig();
}
