package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Course;
import com.kclm.owep.entity.PlanManager;
import com.kclm.owep.entity.PlanManagerCourse;
import com.kclm.owep.mapper.PlanManagerCourseMapper;
import com.kclm.owep.mapper.PlanManagerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class PlanManagerCourseMapperTest {

    @Autowired
    private PlanManagerCourseMapper planManagerCourseMapper;

    @Test
    void selectAllById() {
        List<PlanManagerCourse> planManagerCourses = planManagerCourseMapper.selectAllById(1);
        planManagerCourses.forEach(System.out::println);
    }


    @Test
    void save() {
        PlanManagerCourse planManagerCourse = new PlanManagerCourse();
        Course course = new Course();
        course.setId(1);
        PlanManager planManager = new PlanManager();
        planManager.setId(1);
        planManagerCourse.setPlanManager(planManager);
        planManagerCourse.setCourse(course);
        planManagerCourse.setCourseOrder(1);
        planManagerCourse.setStageNum(1);
        planManagerCourse.setIsDelete(1);
        planManagerCourse.setStageName(1);
        planManagerCourseMapper.save(planManagerCourse);
    }

    @Test
    void update(){
        PlanManagerCourse planManagerCourse = new PlanManagerCourse();
        Course course = new Course();
        course.setId(1);
        planManagerCourse.setId(2);
        PlanManager planManager = new PlanManager();
        planManager.setId(1);
        planManagerCourse.setPlanManager(planManager);
        planManagerCourse.setCourse(course);
        planManagerCourse.setCourseOrder(1);
        planManagerCourse.setStageNum(2);
        planManagerCourse.setIsDelete(1);
        planManagerCourse.setStageName(1);
        planManagerCourseMapper.update(planManagerCourse);
    }


    @Test
    void deleteById() {
        planManagerCourseMapper.deleteById(1);
    }
}