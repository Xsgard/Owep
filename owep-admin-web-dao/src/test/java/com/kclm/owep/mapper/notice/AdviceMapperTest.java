package com.kclm.owep.mapper.notice;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.Advice;
import com.kclm.owep.mapper.AdviceMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
class AdviceMapperTest {

    @Autowired
    private AdviceMapper mapper;

    @Test
    void deleteSelect() {
        List<Integer> asList = Arrays.asList(2,3);
        int i = mapper.deleteSelect(asList);
        System.out.println(asList.toString());

    }

    @Test
    void deleteById() {
        Advice advice = new Advice();
        int byId = mapper.deleteById(1);
        System.out.println("删除结果：" + byId);
    }

    @Test
    void save() {
        int i = mapper.save(new Advice(4,"68350680@ofgjk.com","这个好约课的app做的不错",
                "秦始皇",LocalDateTime.now(),LocalDateTime.now(),1));
        int i1 = mapper.save(new Advice(5,"13487@gg.com","不知道真正使用起来怎么样",
                "汉武帝",LocalDateTime.now(),LocalDateTime.now(),1));
        int i2 = mapper.save(new Advice(6,"huizong@huicong.com","app名好听。。。",
                "唐太宗",LocalDateTime.now(),LocalDateTime.now(),1));
        int i3 = mapper.save(new Advice(7,"9853045@jir.com","总体来说用户体验还可以接受，望再接再厉。。。",
                "明太祖",LocalDateTime.now(),LocalDateTime.now(),1));
        int i4 = mapper.save(new Advice(8,"sss@ofgjk.com","许多页面不能直接找到，只能按图索骥一步步点击去。。。",
                "明成祖",LocalDateTime.now(),LocalDateTime.now(),1));
        System.out.println("输出结果：" + i);

    }

    @Test
    void selectAll() {
        List<Advice> advice = mapper.selectAll();
        advice.forEach(System.out::println);
    }

    @Test
    void selectById() {
        Advice advice = mapper.selectById(1);
        System.out.println(advice);
    }

    @Test
    void update() {
        int update_record = mapper.update(new Advice());
        System.out.println("输出更新记录：" + update_record);
    }
}