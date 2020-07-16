package com.kclm.owep.mapper.clazz;

import com.kclm.owep.entity.Clazz;
import com.kclm.owep.entity.PlanManager;
import com.kclm.owep.entity.Profession;
import com.kclm.owep.entity.Resource;
import com.kclm.owep.mapper.ClazzMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*********************
 * @Author: tanj
 * @Version : v1.0
 * @Create: 2020年7月07日 下午16:10:40
 * @Description 班级测试
 */
@SpringBootTest
class ClazzMapperTest {

    @Autowired
    private ClazzMapper clazzMapper;
    @Test
    void save() {
        Clazz clazz = new Clazz();
        clazz.setClassNumber("JAVAEE20200709");
        clazz.setClassName("java企业级开发");
        clazz.setStartTime(LocalDate.now());
        clazz.setEndTime(LocalDate.now());
        clazz.setClassStatus(1);
        clazz.setInstituteName("萍乡学院");
        clazz.setBranchName("计算机");
        Profession profession = new Profession();
        profession.setId(1);
        clazz.setProfession(profession);
        clazzMapper.save(clazz);
    }

    @Test
    void update() {
        Clazz clazz = new Clazz();
        clazz.setId(2);
        clazz.setClassName("updateClassName");
        clazzMapper.update(clazz);
    }

    @Test
    void deleteById() {
        clazzMapper.deleteById(2);
    }

    @Test
    void deleteSelect() {
        List<Serializable> idList = Arrays.asList(3, 4);
        clazzMapper.deleteSelect(idList);
    }

    @Test
    void selectById() {
        Clazz clazz = clazzMapper.selectById(1);
        System.out.println(clazz);
    }

    @Test
    void selectAll() {
        List<Clazz> clazzes = clazzMapper.selectAll();
        clazzes.forEach(System.out::println);
    }
  /*  @Test
    void selectClazzAndResAndPlan(){
        Clazz clazz = clazzMapper.selectClazzAndRes(1);
        List<Resource> resourceList = clazz.getResourceList();
        System.out.println(clazz);
        resourceList.forEach(System.out::println);
    }
    @Test
    void selectClazzAndPlan(){
        Clazz clazz = clazzMapper.selectClazzAndPlan(1);
        List<PlanManager> planManagerList = clazz.getPlanManagerList();
        planManagerList.forEach(System.out::println);
    }*/
    @Test
    void selectByNum(){
        List<Clazz> clazzes = clazzMapper.selectByNum("2020");
        List<Resource> resourceList = clazzes.get(0).getResourceList();
        clazzes.forEach(System.out::println);
        resourceList.forEach(System.out::println);
    }
    @Test
    void selectByName(){
        List<Clazz> clazzes = clazzMapper.selectByName("企业级");
        clazzes.forEach(System.out::println);
    }
    @Test
    void selectByPro(){
        List<Clazz> clazzes = clazzMapper.selectByPro(1);
        clazzes.forEach(System.out::println);
    }
}