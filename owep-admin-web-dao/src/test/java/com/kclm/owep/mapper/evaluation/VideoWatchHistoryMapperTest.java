/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper.evaluation;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.VideoWatchHistory;
import com.kclm.owep.mapper.VideoWatchHistoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/9 9:52
 *@Description: 视频观看历史测试类
 ***/

@SpringBootApplication
@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class VideoWatchHistoryMapperTest {

    @Autowired
    private VideoWatchHistoryMapper videoWatchHistoryMapper;

    @Test
    void testSave(){
        final VideoWatchHistory videoWatchHistory = new VideoWatchHistory();
        videoWatchHistoryMapper.save(videoWatchHistory);
    }

    @Test
    void testUpdate(){
        final VideoWatchHistory videoWatchHistory = videoWatchHistoryMapper.selectById(1);
        videoWatchHistory.setWatchPosition(11.00);
        videoWatchHistoryMapper.update(videoWatchHistory);
    }

    @Test
    void testSelectById(){

    }

    @Test
    void testAll(){
        final List<VideoWatchHistory> videoWatchHistories = videoWatchHistoryMapper.selectAll();
        System.out.println(videoWatchHistories);
    }

    @Test
    void deleteById(){
       videoWatchHistoryMapper.deleteById(2);
    }

    @Test
    void deleteSelect() {
        List<Serializable> list = new ArrayList<>();
        list.add(1);
        videoWatchHistoryMapper.deleteSelect(list);
    }

    @Test
    void testFindByKeywords(){
        //TODO
    }

    @Test
    void testCountPollItem(){
        final int i = videoWatchHistoryMapper.countVideoWatchHistory();
        System.out.printf("一共有%s条记录",i);
    }
}
