package com.kclm.owep.service.impl;

import com.kclm.owep.dto.LogTableDTO;
import com.kclm.owep.dto.SystLogDTO;
import com.kclm.owep.entity.SystLog;
import com.kclm.owep.service.BaseServiceTests;
import com.kclm.owep.service.SysLogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: SysLogServiceTest
 * @date 2023/9/4 19:29
 */
public class SysLogServiceTest extends BaseServiceTests {

    @Autowired
    private SysLogService sysLogService;

    @Test
    public void getSysLogsTest() {
        Integer offset = 0;
        Integer limit = 10;
        List<LogTableDTO> sysLogs = sysLogService.getSysLogs(offset, limit);
        sysLogs.forEach(System.out::println);
    }
}
