package com.kclm.owep.mapper.system;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.SystemConfig;
import com.kclm.owep.mapper.SystemConfigMapper;
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
 *@Create 2020/7/13 10:02
 *@Description 系统信息测试类
 */

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
class SystemConfigMapperTest {

    @Autowired
    private SystemConfigMapper systemConfigMapper;

    @Test
    public void  save(){
        SystemConfig systemConfig=new SystemConfig();
        systemConfig.setCopyName("苏州青英培训学校（乐码学院）");
        systemConfig.setSystemName("苏州青英培训学校（乐码学院）");
        systemConfig.setLoginPageLogo("img/copy");
        systemConfig.setSystemPageLogo("img/system");
        this.systemConfigMapper.save(systemConfig);
        System.out.println(systemConfig);
    }

    @Test
    public  void update(){
        SystemConfig systemConfig=new SystemConfig();
        systemConfig.setId(1);
        this.systemConfigMapper.update(systemConfig);
        System.out.println(systemConfig);
    }

    @Test
    public void deleteById(){
        System.out.println(this.systemConfigMapper.deleteById(1));
    }

    @Test
    public  void deleteSelect(){
        final List<Serializable> idList= Arrays.asList(2,3);
        System.out.println(systemConfigMapper.deleteSelect(idList));

    }

    @Test
    public  void selectById(){
        final  SystemConfig systemConfig=systemConfigMapper.selectById(2);
        System.out.println("systemConfig"+systemConfig);

    }

    @Test
    public  void selectAll(){
        final List<SystemConfig> all=systemConfigMapper.selectAll();
        if (all != null){
            all.forEach(System.out::println);
        }

    }

}