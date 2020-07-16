/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper.evaluation;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.StudyRecord;
import com.kclm.owep.mapper.StudyRecordMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/9 9:45
 *@Description: 学习记录测试类
 ***/

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class StudyRecordMapperTest {

    @Autowired
    private StudyRecordMapper studyRecordMapper;

    @Test
    void testSave(){
        StudyRecord studyRecord = new StudyRecord(1,1,"Html网页设计");
        studyRecordMapper.save(studyRecord);
    }

    @Test
    void testUpdate(){
        final StudyRecord studyRecord = studyRecordMapper.selectById(1);
        studyRecord.setCourseName("Java从入门到精通");
        studyRecordMapper.update(studyRecord);
    }

    @Test
    void testSelectById(){

    }

    @Test
    void testAll(){
        final List<StudyRecord> list = studyRecordMapper.selectAll();
        System.out.println(list);
    }

    @Test
    void deleteById(){
        studyRecordMapper.deleteById(1);
    }

    @Test
    void deleteSelect() {
        final ArrayList<Serializable> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        studyRecordMapper.deleteSelect(list);
    }

    @Test
    void testFindByKeywords(){
        //TODO
    }

    @Test
    void testCountPollItem(){
        final int i = studyRecordMapper.countStudyRecord();
        System.out.println("一共有"+i+"条记录");
    }
}
