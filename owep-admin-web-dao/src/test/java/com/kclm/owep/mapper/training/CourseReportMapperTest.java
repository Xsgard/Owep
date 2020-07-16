package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Course;
import com.kclm.owep.entity.CourseReport;
import com.kclm.owep.entity.Student;
import com.kclm.owep.mapper.CourseReportMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class CourseReportMapperTest {

    @Autowired
    private CourseReportMapper courseReportMapper;

    /**
     * 单个学生  单门课程的学习记录
     */
    @Test
    void selectAllByStudentIdAndCourseId() {

        CourseReport courseReports = courseReportMapper.selectAllByStudentIdAndCourseId(1, 1);
        System.out.println(courseReports);
    }

    @Test
    void selectAllByCourseId() {
        List<CourseReport> courseReports = courseReportMapper.selectAllByCourseId(1);
        courseReports.forEach(System.out::println);


    }

    @Test
    void save() {
        CourseReport courseReport = new CourseReport();
        courseReport.setCourseLearnCount(50);
        courseReport.setPracticeCount(20);
        courseReport.setNotesCount(10);
        courseReport.setSignCount(20);
        courseReport.setQuestionCount(10);
        courseReport.setVideoPlayCount(10);
        courseReport.setAnswerCount(15);
        courseReport.setTestCount(2);
        courseReport.setHomeworkCount(3);
        courseReport.setHomeworkFinishedCount(60);
        courseReport.setVideoCount(30);
        courseReport.setVideoFinishedCount(20);
        courseReport.setHomeworkFinishedCount(2);
        Student student = new Student();
        student.setId(1);
        courseReport.setStudent(student);
        courseReport.setLastAccessTime(LocalDateTime.now());
        Course course = new Course();
        course.setId(1);
        courseReport.setCourse(course);
        courseReportMapper.save(courseReport);
    }

    @Test
    void update() {
        CourseReport courseReport = new CourseReport();
        courseReport.setId(1);
        courseReport.setCourseLearnCount(50);
        courseReport.setPracticeCount(20);
        courseReport.setNotesCount(10);
        courseReport.setSignCount(20);
        courseReport.setQuestionCount(10);
        courseReport.setVideoPlayCount(10);
        courseReport.setAnswerCount(15);
        courseReport.setTestCount(2);
        courseReport.setHomeworkCount(3);
        courseReport.setVideoFinishedCount(32);
        courseReport.setHomeworkFinishedCount(60);
        courseReport.setVideoCount(50);
        courseReport.setHomeworkFinishedCount(2);
        Student student = new Student();
        student.setId(1);
        courseReport.setStudent(student);
        courseReport.setLastAccessTime(LocalDateTime.now());
        Course course = new Course();
        course.setId(1);
        courseReport.setCourse(course);
        courseReportMapper.update(courseReport);

    }
}