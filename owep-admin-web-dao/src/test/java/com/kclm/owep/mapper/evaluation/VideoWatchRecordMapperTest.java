/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper.evaluation;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.VideoWatchRecord;
import com.kclm.owep.mapper.VideoWatchRecordMapper;
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
 *@Create: 2020/7/9 9:57
 *@Description: 视频观看记录测试类
 ***/

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class VideoWatchRecordMapperTest {

    @Autowired
    private VideoWatchRecordMapper videoWatchRecordMapper;

    @Test
    void testSave(){
        VideoWatchRecord videoWatchRecord = new VideoWatchRecord(LocalDateTime.now(),"第一章第一节",
                LocalDateTime.now(),"第二章第一节",1);
        videoWatchRecordMapper.save(videoWatchRecord);

    }

    @Test
    void testUpdate(){
        final VideoWatchRecord videoWatchRecord = videoWatchRecordMapper.selectById(1);
        videoWatchRecord.setEndTime(LocalDateTime.now());
        videoWatchRecordMapper.update(videoWatchRecord);
    }

    @Test
    void testSelectById(){

    }

    @Test
    void testSelectAll(){
        final List<VideoWatchRecord> list = videoWatchRecordMapper.selectAll();
        System.out.println("=============>"+list);
    }

    @Test
    void deleteById(){
        videoWatchRecordMapper.deleteById(2);
    }

    @Test
    void deleteSelect() {
        List<Serializable> list = new ArrayList<>();
        list.add(1);
        videoWatchRecordMapper.deleteSelect(list);
    }

    @Test
    void testFindByKeywords(){
        //TODO
    }

    @Test
    void testCountPollItem(){
        final int i = videoWatchRecordMapper.countVideoWatchRecord();
        System.out.printf("一共有%d条记录",i);
    }
}
