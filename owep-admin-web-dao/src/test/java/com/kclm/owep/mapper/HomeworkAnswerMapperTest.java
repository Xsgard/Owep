/*********************
 * 2018-2021 版权所有 CopyRight（c）
 */
package com.kclm.owep.mapper;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.HomeworkAnswer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*********************
 * @Auther shentr
 * @Version V1.0
 * @Create 2020/7/13 9:33
 * @Description TODO
 */
@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class HomeworkAnswerMapperTest {
    @Autowired
    HomeworkAnswerMapper homeworkAnswerMapper;
    @Test
    void test1(){
        for(int i=0;i<5;i++){
            homeworkAnswerMapper.save(new HomeworkAnswer(1,"1",1));
        }
    }

    @Test
    void test2(){
        List<HomeworkAnswer> list = homeworkAnswerMapper.selectAll();
        System.out.println(list.get(0));
    }

    @Test
    void test3(){
        HomeworkAnswer homeworkAnswer = homeworkAnswerMapper.selectById(3);
        System.out.println(homeworkAnswer);
    }

    @Test
    void test4(){
        HomeworkAnswer homeworkAnswer = new HomeworkAnswer();
        homeworkAnswer.setAuditContent("aaaaa");
        homeworkAnswer.setId(5);
        int i = homeworkAnswerMapper.update(homeworkAnswer);
        System.out.println(i);
    }

    @Test
    void test5(){
        int i = homeworkAnswerMapper.deleteById(2);
        System.out.println(i);
    }

    @Test
    void test6(){
        List<Serializable> l = new ArrayList<>();
        l.add(3);
        l.add(4);
        int i = homeworkAnswerMapper.deleteSelect(l);
        System.out.println(i);
    }

}
