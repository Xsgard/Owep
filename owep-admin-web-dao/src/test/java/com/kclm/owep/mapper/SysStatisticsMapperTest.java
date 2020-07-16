package com.kclm.owep.mapper;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.SysStatistics;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class SysStatisticsMapperTest {

    @Autowired
    private SysStatisticsMapper statisticsMapper;

    @Test
    public void testSave() {
        //
        LocalDateTime t1 = LocalDateTime.of(2020,6,4,19,35,10);
        SysStatistics s1 = new SysStatistics(t1,34,108,4,25,3,22,108,56,1,5);
        //
        statisticsMapper.save(s1);
    }

    @Test
    public void testSelectAll() {
        final List<SysStatistics> sysStatistics = statisticsMapper.selectAll();
        //
        sysStatistics.forEach(System.out::println);
    }


    @Test
    public void testGroupByType() {
        //
        final List<SysStatistics> sysStatistics = statisticsMapper.groupByType("%Y%d");
        //
        sysStatistics.forEach(System.out::println);
    }

}