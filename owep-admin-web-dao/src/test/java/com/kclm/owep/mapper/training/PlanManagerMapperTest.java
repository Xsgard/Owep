package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.PlanManager;
import com.kclm.owep.mapper.PlanManagerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class PlanManagerMapperTest {

    @Autowired
    private PlanManagerMapper planManagerMapper;

    @Test
    void selectByField() {
        PlanManager planManager = new PlanManager();
        planManager.setPlanName("Android");
        planManager.setPlanNumber("FA_20200612143616");
        List<PlanManager> planManagers = planManagerMapper.selectByField(planManager);
        System.out.println(planManagers);
    }

    @Test
    void rowTotal() {

        Long aLong = planManagerMapper.rowTotal();
        System.out.println(aLong);

    }


    @Test
    void deleteById() {

        planManagerMapper.deleteById(2);


    }

    @Test
    void deleteSelect() {
        List<Serializable> integers = Arrays.asList(3);
        planManagerMapper.deleteSelect(integers);

    }

    @Test
    void selectAll() {
        List<PlanManager> planManagers = planManagerMapper.selectAll();
        planManagers.forEach(System.out::println);
    }
    
    @Test
    void update() {
        PlanManager planManager = new PlanManager();
        planManager.setId(2);
        planManager.setLastAccessTime(LocalDateTime.now());
        planManager.setPlanDesc("JAVAEE企业全栈开发描述");
        planManager.setPlanName("JAVAEE企业全栈开发");
        planManager.setPlanStatus(1);
        planManager.setPlanNumber("FA_20200327153221");
        planManagerMapper.update(planManager);
    }
}