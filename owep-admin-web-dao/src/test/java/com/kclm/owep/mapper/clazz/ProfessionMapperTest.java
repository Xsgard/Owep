package com.kclm.owep.mapper.clazz;

import com.kclm.owep.entity.Profession;
import com.kclm.owep.mapper.ProfessionMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*********************
 * @Author: tanj
 * @Version : v1.0
 * @Create: 2020年7月07日 下午16:10:40
 * @Description 专业方向测试
 */
@SpringBootTest
class ProfessionMapperTest {

    @Autowired
    private ProfessionMapper professionMapper;
    @Test
    void save() {
        Profession profession = new Profession();
        profession.setProfName("专业2");
        profession.setProfDesc("专业内容2");
        profession.setProfStatus(1);
        profession.setInstituteName("萍乡学院");
        profession.setInstituteBranchName("计算机");
        int save = professionMapper.save(profession);
        System.out.println(save+"条记录影像");
    }

    @Test
    void update() {
        Profession profession = new Profession();
        profession.setProfName("update专业2");
        profession.setId(2);
        int update = professionMapper.update(profession);
        System.out.println(update+"条记录更新");
    }

    @Test
    void deleteById() {
        int i = professionMapper.deleteById(2);
        System.out.println(i+"条记录删除 ");
    }

    @Test
    void deleteSelect() {
        List<Serializable> asList = Arrays.asList(2, 3);
        int i = professionMapper.deleteSelect(asList);
        System.out.println(i+"条记录删除");
    }

    @Test
    void selectById() {
        Profession profession = professionMapper.selectById(1);
        System.out.println(profession);
    }

    @Test
    void selectAll() {
        List<Profession> professions = professionMapper.selectAll();
        professions.forEach(System.out::println);
    }

    @Test
    void selectByProName() {
        List<Profession> professions = professionMapper.selectByProName("专业");
        professions.forEach(System.out::println);
    }

    @Test
    void selectByBranchName() {
        List<Profession> professions = professionMapper.selectByBranchName("计算机");
        professions.forEach(System.out::println);
    }
}