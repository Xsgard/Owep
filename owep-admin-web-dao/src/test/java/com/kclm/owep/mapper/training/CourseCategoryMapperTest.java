package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.CourseCategory;
import com.kclm.owep.mapper.CourseCategoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
class CourseCategoryMapperTest {

    @Autowired
    private CourseCategoryMapper courseCategoryMapper;

    @Test
    void selectSubAll() {

        List<CourseCategory> courseCategories = courseCategoryMapper.selectSubAll(2);
        courseCategories.forEach(System.out::println);


    }

    @Test
    void selectByCategoryName() {
        /*只能查询父类的*/
        CourseCategory redis = courseCategoryMapper.selectByCategoryName("redis");
        System.out.println(redis);


    }

    @Test
    void save() {
        CourseCategory courseCategory = new CourseCategory();
        courseCategory.setCategoryName("java基础知识");
        courseCategory.setCategoryDesc("企业级开发框架");
        courseCategory.setIsDelete(1);
        CourseCategory courseCategory1 = new CourseCategory();
        courseCategory1.setId(2);
        courseCategory.setCourseCategory(courseCategory1);
        courseCategory.setLastAccessTime(LocalDateTime.now());
        courseCategoryMapper.save(courseCategory);

    }

    @Test
    void update() {
        CourseCategory courseCategory = new CourseCategory();
        courseCategory.setId(1);
        courseCategory.setCategoryName("redis");
        courseCategory.setCategoryDesc("noSql");
        courseCategory.setIsDelete(1);
        courseCategory.setCourseCategory(new CourseCategory());
        courseCategory.setLastAccessTime(LocalDateTime.now());
        courseCategoryMapper.update(courseCategory);

    }

    @Test
    void deleteById() {
        courseCategoryMapper.deleteById(3);
    }

    @Test
    void deleteSelect() {
        List<Serializable> integers = Arrays.asList(6);
        courseCategoryMapper.deleteSelect(integers);

    }

    @Test
    void selectAll() {
        List<CourseCategory> courseCategories = courseCategoryMapper.selectAll();
        courseCategories.forEach(System.out::println);
    }

    @Test
    void selectById(){
        CourseCategory courseCategory = courseCategoryMapper.selectById(1);
        System.out.println(courseCategory);
    }
}