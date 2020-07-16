package com.kclm.owep.mapper.log;

import com.kclm.owep.entity.SystLog;
import com.kclm.owep.mapper.SystLogMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/************
 *@Author chenxin
 *@Version v1.0
 *@Create 2020/7/13 9:59
 *@Description 系统日志测试类
 */
@SpringBootTest
class SystLogMapperTest {

    @Autowired
    private SystLogMapper systLogMapper;

    @Test
    void findByTime() {
       // String username="admin";
        String username="tomcat";
        LocalDateTime start=LocalDateTime.of(2020,7,9,0,0,0);
        //LocalDateTime start=null;
        LocalDateTime end=LocalDateTime.of(2020,7,10,0,0,0);
        //LocalDateTime end=null;
        // 2020-07-09 11:26:30
        this.systLogMapper.findByTime(username,start,end);
    }

    @Test
    void  save(){
        SystLog systLog=new SystLog();
        systLog.setTitle("日志");
        systLog.setIpAddr("192.168.0.0.1");
        systLog.setCreateTime(LocalDateTime.now());
        this.systLogMapper.save(systLog);
        System.out.println(systLog);
    }
    @Test
    void update(){
        SystLog systLog=new SystLog();
        systLog.setLoginUserName("测试update");
        systLog.setId(1);
        this.systLogMapper.update(systLog);
        System.out.println(systLog);
    }
    @Test
    void  deleteById(){
        System.out.println(this.systLogMapper.deleteById(9));
    }
    @Test
    void  deleteSelect(){
        final List<Serializable> idList= Arrays.asList(7,8);
        System.out.println(this.systLogMapper.deleteSelect(idList));
    }
    @Test
    void  selectById(){
        final SystLog systLog=systLogMapper.selectById(1);
        System.out.println(systLog);

    }
    @Test
    void  SelectAll(){
        final List<SystLog> all=systLogMapper.selectAll();
        if (all != null){
            all.forEach(System.out::println);
        }

    }
}