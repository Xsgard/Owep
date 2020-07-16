/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper.evaluation;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.PollRecord;
import com.kclm.owep.mapper.PollRecordMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/8 15:52
 *@Description: 考评记录测试类
 ***/

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class PollRecordMapperTest {

    @Autowired
    private PollRecordMapper pollRecordMapper;

    @Test
    void testSave(){
        final PollRecord pollRecord1 = new PollRecord("192.168.127.11", 8.90, 12, LocalDateTime.now(), 5);
        final PollRecord pollRecord2 = new PollRecord("192.168.127.12", 8.90, 20, LocalDateTime.now(), 5);
        final int i = pollRecordMapper.save(pollRecord1);
        System.out.println("成功添加了"+i+"条记录");
        final int i1 = pollRecordMapper.save(pollRecord2);
        System.out.println("成功添加了"+i1+"条记录");
    }

    @Test
    void testUpdate(){
        final PollRecord pollRecord = pollRecordMapper.selectById(3);
        pollRecord.setPollCount(100);
        pollRecordMapper.update(pollRecord);
    }

    @Test
    void testSelectById(){

    }

    @Test
    void testAll(){
        final List<PollRecord> list = pollRecordMapper.selectAll();
        System.out.println("=========>"+list);
    }

    @Test
    void deleteById(){
        pollRecordMapper.deleteById(5);
    }

    @Test
    void deleteSelect() {
        List list = new ArrayList();
        list.add(3);
        list.add(4);
        pollRecordMapper.deleteSelect(list);
    }

   @Test
    void testFindByKeywords(){
        //not exist
    }

    @Test
    void testCountPollItem(){
        final int i = pollRecordMapper.countPollRecord();
        System.out.println("共有"+i+"条记录");
    }
}
