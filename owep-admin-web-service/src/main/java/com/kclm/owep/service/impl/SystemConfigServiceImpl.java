package com.kclm.owep.service.impl;

import com.kclm.owep.entity.SystemConfig;
import com.kclm.owep.mapper.SystemConfigMapper;
import com.kclm.owep.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Asgard
 * @version 1.0
 * @description: SystemServiceImpl
 * @date 2023/9/4 13:09
 */
@Service
public class SystemConfigServiceImpl implements SystemConfigService {

    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Override
    public SystemConfig getServiceConfigInfo() {
        return systemConfigMapper.getSystemConfig();
    }
}
