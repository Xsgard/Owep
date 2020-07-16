/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper.evaluation;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.VideoCollect;
import com.kclm.owep.mapper.VideoCollectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/9 9:50
 *@Description: 视频收藏测试类
 ***/

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class VideoCollectMapperTest {

    @Autowired
    private VideoCollectMapper videoCollectMapper;

    @Test
    void testSave(){
        final VideoCollect videoCollect = new VideoCollect();
        videoCollectMapper.save(videoCollect);
    }

    @Test
    void testUpdate(){
        final VideoCollect videoCollect = videoCollectMapper.selectById(3);
        videoCollect.setCourseName("mysql从入门到精通");
        videoCollectMapper.update(videoCollect);
    }

    @Test
    void testSelectById(){

    }

    @Test
    void testSelectAll(){
        final List<VideoCollect> list = videoCollectMapper.selectAll();
        System.out.println("=============>"+list);
    }

    @Test
    void TestdeleteById(){
        videoCollectMapper.deleteById(2);
    }

    @Test
    void TestdeleteSelect() {
        List<Serializable> list = new ArrayList<>();
        list.add(1);
        videoCollectMapper.deleteSelect(list);
    }

    @Test
    void testFindByKeywords(){
        //TODO
    }

    @Test
    void testCountPollItem(){
        final int i = videoCollectMapper.countVideoCollect();
        System.out.printf("一共有%d条记录",i);
    }
}
