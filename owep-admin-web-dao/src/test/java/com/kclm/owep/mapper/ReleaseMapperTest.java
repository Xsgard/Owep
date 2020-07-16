package com.kclm.owep.mapper;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.Release;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
class ReleaseMapperTest {

    @Autowired
    private ReleaseMapper releaseMapper;

    @Test
    public void testSave() {
        System.out.println("releaseMapper = " + releaseMapper);
        //
        Release release = new Release("Ver 1.1", "学海无涯版");
        //
        releaseMapper.save(release);
    }

    @Test
    public void testUpdate() {
        Release r = new Release();
        r.setId(1);
        r.setDescription("此版本是初始版本");
        r.setVer("Ver 1.0");
        //
        System.out.println(releaseMapper.update(r));
    }

    @Test
    public void testSelectById() {
        final Release release = releaseMapper.selectById(5);
        System.out.println("release = " + release);
    }

    @Test
    public void testSelectAll() {
        final List<Release> releases = releaseMapper.selectAll();
        //
        releases.forEach(System.out::println);
    }

    @Test
    public void testDeleteById() {
        //
        System.out.println(releaseMapper.deleteById(1));
    }

    @Test
    public void testDeleteSelect() {
        //模拟
        final List<Serializable> idList = Arrays.asList(2, 3);
        //
        System.out.println(releaseMapper.deleteSelect(idList));
    }
}