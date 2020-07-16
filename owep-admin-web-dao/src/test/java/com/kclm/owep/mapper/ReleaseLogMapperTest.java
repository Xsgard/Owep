package com.kclm.owep.mapper;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.Release;
import com.kclm.owep.entity.ReleaseLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
class ReleaseLogMapperTest {

    @Autowired
    private ReleaseLogMapper releaseLogMapper;

    @Test
    public void testSave() {
        //
        //ReleaseLog log = new ReleaseLog("Bug", "修复了访问量多大时加载缓慢的bug", 1);
        ReleaseLog log = new ReleaseLog("新增", "添加了动态加载的功能", 2);
        Release r = new Release();
        r.setId(5);
        //
        log.setRelease(r);
        //
        releaseLogMapper.save(log);
    }

    @Test
    public void testDeleteById() {
        System.out.println(releaseLogMapper.deleteById(1));
    }

    @Test
    public void testSelectById() {
        final ReleaseLog releaseLog = releaseLogMapper.selectById(2);
        System.out.println("releaseLog = " + releaseLog);
        //
        final Release release = releaseLog.getRelease();
        System.out.println("release = " + release);
    }
    @Test
    public void testSelectAll() {
        final List<ReleaseLog> releaseLogs = releaseLogMapper.selectAll();
        //
        if(releaseLogs != null) {
            releaseLogs.forEach(System.out::println);
        }
    }

    @Test
    public void testUpdate() {
        final ReleaseLog releaseLog = releaseLogMapper.selectById(2);
        releaseLog.setContent("修复了并发时造成的死锁问题");
        //
        System.out.println(releaseLogMapper.update(releaseLog));
    }

    @Test
    public void testDeleteSelect() {
        //

    }
}