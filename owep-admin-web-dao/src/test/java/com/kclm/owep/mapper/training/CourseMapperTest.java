package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Course;
import com.kclm.owep.entity.CourseCategory;
import com.kclm.owep.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CourseMapperTest {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    void selectByCourseName() {
        List<Course> courses = courseMapper.selectByCourseName("企业级框架（SpringMVC）");
        courses.forEach(System.out::println);
    }

    @Test
    void save() {
        Course course = new Course();
        course.setCourseName("企业级框架（SpringMVC）");
        course.setCourseImage("aaa.jpg");
        course.setCourseDesc("Spring MVC属于SpringFrameWork的后续产品，已经融合在Spring Web F...");
        course.setCourseNumber("KC_20181204113845");
        course.setCourseOpenStatus(1);
        course.setCoursePeriod(40);
        course.setCourseSendType("此属性有值，代表是从总控平台传送过来的数据");
        course.setCourseStatus(1);
        course.setCourseType("框架");
        course.setStartTime(LocalDateTime.now());
        course.setEndTime(LocalDateTime.now().withDayOfYear(2));
        course.setFree(1);
        course.setListener(true);
        course.setHot(true);
        course.setIsDelete(0);
        CourseCategory courseCategory = new CourseCategory();
        courseCategory.setId(1);
        course.setVideoStatus(1);
        course.setCourseCategory(courseCategory);
        courseMapper.save(course);
    }

    @Test
    void update() {
        Course course = new Course();
        course.setId(1);
        course.setCourseName("企业级框架（SpringBoot）");
        course.setCourseImage("aaa.jpg");
        course.setCourseDesc("Spring Boot是由Pivotal团队提供的全新框架，其设计目的是用来简化新Spring应用的");
        course.setCourseNumber("KC_20181207145339");
        course.setCourseOpenStatus(1);
        course.setCoursePeriod(40);
        course.setCourseSendType("此属性有值，代表是从总控平台传送过来的数据");
        course.setCourseStatus(1);
        course.setCourseType("框架");
        course.setStartTime(LocalDateTime.now());
        course.setEndTime(LocalDateTime.now().withDayOfYear(2));
        course.setFree(1);
        course.setListener(true);
        course.setHot(true);
        course.setIsDelete(0);
        CourseCategory courseCategory = new CourseCategory();
        courseCategory.setId(1);
        course.setCourseCategory(courseCategory);
        courseMapper.update(course);
    }

    @Test
    void deleteById() {
        int i = courseMapper.deleteById(5);

    }

    @Test
    void deleteSelect() {
        List<Serializable> integers = Arrays.asList(3);
        int i = courseMapper.deleteSelect(integers);

    }

    @Test
    void selectById() {
        Course course = courseMapper.selectById(1);
        System.out.println(course);
    }

    @Test
    void selectAll() {
        List<Course> courses = courseMapper.selectAll();
        courses.forEach(System.out::println);
    }
}