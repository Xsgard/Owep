package com.kclm.owep.mapper.notice;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.Notice;
import com.kclm.owep.mapper.NoticeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
class NoticeMapperTest {

    @Autowired
    private NoticeMapper mapper;

    @Test
    void deleteBySelect() {
        List<Integer> integers = Arrays.asList(3, 4);
        int i = mapper.deleteBySelect(integers);
        System.out.println(i);
    }

    @Test
    void deleteById() {
        int i = mapper.deleteById(6);
        System.out.println("删除成功"+i);
    }

    @Test
    void save() {
        Notice notice = new Notice();
        int save = mapper.save(new Notice(5,"今日公告","张某与7月8日被xxx公司录取成功，7000/月","teacher",
                LocalDateTime.now(),1,LocalDateTime.now(),1));

        int save1 = mapper.save(new Notice(6,"高考福利大赠送","高考即将结束，暑假即将来临...","teacher",
                LocalDateTime.now(),1,LocalDateTime.now(),1));

        System.out.println("notice测试：" + save );
        System.out.println("notice测试2：" + save1);
    }

    @Test
    void selectAll() {
        List<Notice> notices = mapper.selectAll();
        notices.forEach(System.out::println);
    }

    @Test
    void selectById() {
        Notice notice = mapper.selectById(2);
        System.out.println(notice);
    }

    @Test
    void update() {
        int update = mapper.update(new Notice(3,"好约课暑假福利发赠送","好约课暑假福利大赠送，会员8折，学费全部九折...","张老师",
                LocalDateTime.now(),1,LocalDateTime.now(),0));
        System.out.println(update);
    }
}