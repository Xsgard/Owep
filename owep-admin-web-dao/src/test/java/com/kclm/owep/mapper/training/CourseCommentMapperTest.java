package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Course;
import com.kclm.owep.entity.CourseComment;
import com.kclm.owep.entity.Student;
import com.kclm.owep.mapper.CourseCommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootTest
class CourseCommentMapperTest {

    @Autowired
    private CourseCommentMapper courseCommentMapper;

    @Test
    void selectByStuIdAndCourseId() {

        List<CourseComment> courseComments = courseCommentMapper.selectByStuIdAndCourseId(1, 1);
        courseComments.forEach(System.out::println);

    }

    /**
     * 查询该学生的多有评价
     */
    @Test
    void selectByStudentId() {

        List<CourseComment> courseComments = courseCommentMapper.selectByStudentId(1);
        System.out.println(courseComments);
    }

    /**
     * 单个课程的所有评价
     */
    @Test
    void selectByCourseId() {

        List<CourseComment> courseComments = courseCommentMapper.selectByCourseId(1);
        courseComments.forEach(System.out::println);

    }

    @Test
    void save() {
        CourseComment courseComment = new CourseComment();
        Course course = new Course();
        course.setId(1);
        courseComment.setCourse(course);
        courseComment.setCommentContent("xxx学生的评价内容");
        Student student = new Student();
        student.setId(1);
        courseComment.setStudent(student);
        courseComment.setLastAccessTime(LocalDateTime.now());
        courseCommentMapper.save(courseComment);
    }
}