package com.kclm.owep.mapper.system;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.DbCopy;
import com.kclm.owep.entity.SystLog;
import com.kclm.owep.mapper.DbCopyMapper;
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
 *@Create 2020/7/13 9:57
 *@Description 数据库备份测试类
 */

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
class DbCopyMapperTest {

    @Autowired
    private DbCopyMapper dbCopyMapper;

    @Test
    public void save(){
        DbCopy dbCopy=new DbCopy();

        //dbCopy.setCreateTime(LocalDateTime.now());
        dbCopy.setFileName("数据库测试1");
        dbCopy.setFilePath("hello/hello");
        dbCopy.setLastAccessTime(LocalDateTime.now());
        dbCopy.setStatus(true);
        //dbCopy.setVersion(1);
        this.dbCopyMapper.save(dbCopy);
        System.out.println(dbCopyMapper);
        System.out.println(dbCopy);
    }

    @Test
    public void update(){
        DbCopy dbCopy=new DbCopy();
        dbCopy.setId(1001);
        dbCopy.setFileName("new1_update");
        //dbCopy.setVersion(2);
        dbCopy.setStatus(true);
        //dbCopy.setLastAccessTime(LocalDateTime.now());
        //dbCopy.setCreateTime(LocalDateTime.now());
        this.dbCopyMapper.update(dbCopy);
        System.out.println(dbCopy);

    }
    @Test
    public void deleteById(){
        System.out.println(this.dbCopyMapper.deleteById(3));
    }

    @Test
    public void deleteSelect(){
        final List<Serializable> idList = Arrays.asList(2, 3);
        System.out.println(dbCopyMapper.deleteSelect(idList));
    }

    @Test
    public void selectById(){
        System.out.println("DbCopyMapper"+dbCopyMapper);
        final DbCopy dbCopy=this.dbCopyMapper.selectById(1);
        System.out.println(dbCopy);

    }

    @Test
    public void SelectAll(){
        final List<DbCopy> all=dbCopyMapper.selectAll();
        //
        if (all != null){
            all.forEach(System.out::println);
        }
    }
    @Test
    void findByTime(){
        //LocalDateTime start= LocalDateTime.of(2020,7,8,0,0,0);
        LocalDateTime end=LocalDateTime.of(2020,7,9,0,0,0);
        LocalDateTime start=null;
        //LocalDateTime end=null;
        this.dbCopyMapper.findByTime(start,end);

    }
}