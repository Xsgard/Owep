/*********************
 * 2018-2021 版权所有 CopyRight（c）
 */
package com.kclm.owep.service.impl;

import com.kclm.owep.OwepAdminServiceApplication;
import com.kclm.owep.dto.ClassDTO;
import com.kclm.owep.dto.TeachingDTO;
import com.kclm.owep.entity.Evaluate;
import com.kclm.owep.entity.Illegal;
import com.kclm.owep.entity.Leave;
import com.kclm.owep.service.TeachingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

/*********************
 * @Auther shentr
 * @Version V1.0
 * @Create 2020/7/14 9:17
 * @Description 授课管理业务层测试
 */
@SpringBootTest(classes = OwepAdminServiceApplication.class)
public class TeachingServiceImplTest {
    @Autowired
    TeachingService teachingService;

    @Test
    void testFindClass(){
        final List<ClassDTO> allClass = teachingService.findAllClass();
        allClass.forEach(System.out::println);
    }

    @Test
    void testTeachingDto(){
        //List<TeachingDTO> teachingDto = teachingService.evaluateTeachingDto(1);
        List<TeachingDTO> teachingDto1 = teachingService.leaveTeachingDto(1);
        //List<TeachingDTO> teachingDto2 = teachingService.illegalTeachingDto(1);
        teachingDto1.forEach(System.out::println);
    }

    @Test
    void testFindQuestionById(){
        TeachingDTO question = teachingService.findQuestionById(5);
        System.out.println(question);
    }

    @Test
    void testFindEvaluateById(){
        TeachingDTO evaluate = teachingService.findEvaluateById(8);
        System.out.println(evaluate);
    }

    @Test
    void testUpdateEvaluate(){
        Evaluate e = new Evaluate();
        e.setId(8);
        e.setEvaluate("加油");
        teachingService.updateEvaluate(e);
    }

    @Test
    void testUpdateApprovalStatus(){
        Leave l = new Leave();
        l.setId(8);
        l.setApprovalStatus(3);
        teachingService.updateApprovalStatus(l);
    }

    @Test
    void testDeleteIllegalById(){
        teachingService.deleteIllegalById(3);
    }

    @Test
    void testSaveIllegal(){
        teachingService.saveIllegal(new Illegal(1,"qian", LocalDateTime.now()));
    }
}
