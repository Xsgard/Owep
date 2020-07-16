package com.kclm.owep.service.impl;

import com.kclm.owep.OwepAdminServiceApplication;
import com.kclm.owep.dto.SysStatisticsDTO;
import com.kclm.owep.service.SysStatisticsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = OwepAdminServiceApplication.class)
public class SysStatisticsServiceImplTest {

    @Autowired
    private SysStatisticsService statisticsService;

    @Test
    void groupByType() {
        System.out.println("statisticsService = " + statisticsService);
        final List<SysStatisticsDTO> sysStatisticsDTOS = statisticsService.groupByType(SysStatisticsService.GROUP_BY_DAY);
        //
        sysStatisticsDTOS.forEach(System.out::println);
    }
}