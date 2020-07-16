package com.kclm.owep.mapper.clazz;

import com.kclm.owep.entity.*;
import com.kclm.owep.mapper.HomeworkMapper;
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
 * @Description 班级作业测试
 */
@SpringBootTest
class HomeworkMapperTest {

    @Autowired
    private HomeworkMapper homeworkMapper;
    @Test
    void save() {
        Homework homework = new Homework();
        homework.setWorkTitle("课后作业");
        homework.setWorkContent("本节有三个小题 请完成");
        homework.setCourseName("Java核心技术（一）");
        Course course = new Course();
        course.setId(1);
        homework.setCourse(course);
        Chapter chapter = new Chapter();
        chapter.setId(1);
        homework.setChapter(chapter);
        Section section = new Section();
        section.setId(1);
        homework.setSection(section);
        Clazz clazz = new Clazz();
        clazz.setId(1);
        homework.setClazz(clazz);
        homeworkMapper.save(homework);
    }

    @Test
    void update() {
        Homework homework = new Homework();
        homework.setWorkTitle("update课后作业");
        homework.setId(1);
        homeworkMapper.update(homework);
    }

    @Test
    void deleteById() {
        int i = homeworkMapper.deleteById(2);
        System.out.println(i+"条记录受影响");
    }

    @Test
    void deleteSelect() {
        List<Serializable> idList = Arrays.asList(1, 2);
        homeworkMapper.deleteSelect(idList);
    }

    @Test
    void selectById() {
        Homework homework = homeworkMapper.selectById(1);
        System.out.println(homework);
    }

    @Test
    void selectAll() {
        List<Homework> homework = homeworkMapper.selectAll();
        homework.forEach(System.out::println);
    }
}