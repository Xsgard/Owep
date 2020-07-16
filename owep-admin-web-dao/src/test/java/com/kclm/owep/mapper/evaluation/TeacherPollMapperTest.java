/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper.evaluation;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.TeacherPoll;
import com.kclm.owep.mapper.TeacherPollMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/8 15:52
 *@Description: 教师管理测试类
 ***/

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class TeacherPollMapperTest {

    @Autowired
    private TeacherPollMapper teacherPollMapper;

    @Test
    void testSave(){
        final TeacherPoll teacherPoll = new TeacherPoll();
        teacherPoll.setTeacherName("zang");
        teacherPoll.setClassName("snidan");
        teacherPoll.setPollAddress("djkajda");
        teacherPoll.setPollGrade("sdjakjod");
        teacherPoll.setPollCount(1);
        teacherPoll.setPollSuggest("张三");
        teacherPoll.setFkTemplateId(4);
        teacherPoll.setFkUserId(1);
        teacherPoll.setFkClassId(1);
        teacherPoll.setAllowIp("hdjkahjkdkja");
        teacherPoll.setStartTime(LocalDateTime.now());
        teacherPoll.setEndTime(LocalDateTime.now());
        teacherPollMapper.save(teacherPoll);
    }

    @Test
    void testUpdate(){
        TeacherPoll teacherPoll = teacherPollMapper.selectById(8);
        teacherPoll.setTeacherName("张无忌");
        teacherPoll.setClassName("web前端开发");
        teacherPollMapper.update(teacherPoll);
        System.out.println("===========>"+teacherPoll);
    }

    @Test
    void testSelectById(){

    }

    @Test
    void testAll(){
        final List<TeacherPoll> teacherPolls = teacherPollMapper.selectAll();
        System.out.println("=============>"+teacherPolls);
    }

    @Test
    void deleteById(){
        teacherPollMapper.deleteById(1);
    }

    @Test
    void deleteSelect() {
        final ArrayList<Serializable> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        teacherPollMapper.deleteSelect(list);
    }

/*   @Test
    void testFindByKeywords(){
       final List<TeacherPoll> byKeywords = teacherPollMapper.findByKeywords(5);
       System.out.println("============>"+byKeywords);
   }*/

    @Test
    void testCountPollItem(){
        final int i = teacherPollMapper.countTeacherPoll();
        System.out.println("有"+i+"条记录");
    }
}
