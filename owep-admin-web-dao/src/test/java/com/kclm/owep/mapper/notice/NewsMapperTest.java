package com.kclm.owep.mapper.notice;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.News;
import com.kclm.owep.mapper.NewsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
class NewsMapperTest {

    @Autowired
    private NewsMapper mapper;

    @Test
    void deleteSelect() {
        List<Integer> integers = Arrays.asList(2, 3);
        int i = mapper.deleteSelect(integers);
        System.out.println("删除的多条记录："+i);
    }

    @Test
    void deleteById() {
        int i = mapper.deleteById(1);
        System.out.println("删除的记录：" + i);
    }

    @Test
    void save() {
        int save = mapper.save(new News(1,"新闻标题","高考内容",1,"发起人",
                LocalDateTime.now(),1,LocalDateTime.now(),"www.baidu.com",1));
        int save2 = mapper.save(new News(2,"贵州公交车坠湖","随着7月7日安顺市公交车坠湖事件进展持续进行时，该消息已引发社会极其关注。。。",1,"发起人",
                LocalDateTime.now(),1,LocalDateTime.now(),"www.baidu.com",1));
        int save3 = mapper.save(new News(3,"地震瞬间昆弥学生1秒爆头避震","8日上午，昆明东川区4.2级地震。监控显示，汤丹中学正在上课，" +
                "感知到地震后同学们不约而同迅速钻到课桌",1,"发起人",
                LocalDateTime.now(),1,LocalDateTime.now(),"www.baidu.com",1));
        int save4 = mapper.save(new News(4,"高考生坐澡盆被民警护送进考场","8日上午，昆明东川区4.2级地震。监控显示，汤丹中学正在上课，" +
                "感知到地震后同学们不约而同迅速钻到课桌",1,"发起人",
                LocalDateTime.now(),1,LocalDateTime.now(),"www.baidu.com",6876450));
        int save5 = mapper.save(new News(5,"开考5分钟父亲取回准考证后大哭","8日上午，昆明东川区4.2级地震。监控显示，汤丹中学正在上课，" +
                "感知到地震后同学们不约而同迅速钻到课桌",1,"发起人",
                LocalDateTime.now(),1,LocalDateTime.now(),"www.baidu.com",200000));
        int save6 = mapper.save(new News(6,"社区书记凌晨嘶吼喊话救3200人","8日上午，昆明东川区4.2级地震。监控显示，汤丹中学正在上课，" +
                "感知到地震后同学们不约而同迅速钻到课桌",1,"发起人",
                LocalDateTime.now(),1,LocalDateTime.now(),"www.baidu.com",100000));
//        System.out.println(save+save2+save3);
        System.out.println(save4);
        System.out.println(save5);
        System.out.println(save6);
    }

    @Test
    void selectById() {
        News news = mapper.selectById(6);
        System.out.println("查找记录："+news);
    }

    @Test
    void selectAll() {
        List<News> news = mapper.selectAll();
        news.forEach(System.out::println);
//        System.out.println("查找news中的所有记录："+news);
    }

    @Test
    void update() {
        int update = mapper.update(new News(6,"中国气象局连发三个预警","7月8日18点，中国气象局连续发布地质灾害气象风险预警、暴雨橙色预警、山洪灾害气象预警三个预警" ,
                1,"发起人", LocalDateTime.now(),1,LocalDateTime.now(),"www.baidu.com",4890000));
        System.out.println("更新后数据：" + update);
    }
}