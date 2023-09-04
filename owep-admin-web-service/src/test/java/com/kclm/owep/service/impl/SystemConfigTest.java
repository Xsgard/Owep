package com.kclm.owep.service.impl;

import com.kclm.owep.entity.SystemConfig;
import com.kclm.owep.service.BaseServiceTests;
import com.kclm.owep.service.SystemConfigService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Asgard
 * @version 1.0
 * @description: SystemConfigTest
 * @date 2023/9/4 14:41
 */
public class SystemConfigTest extends BaseServiceTests {

    @Autowired
    private SystemConfigService systemConfigService;

    @Test
    public void getSystemConfigTest() {
        SystemConfig serviceConfigInfo = systemConfigService.getServiceConfigInfo();
        System.out.println(serviceConfigInfo);
    }
}
