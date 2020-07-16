package com.kclm.owep.mapper.user;

import com.kclm.owep.entity.StudentReport;
import com.kclm.owep.entity.StudentReport;
import com.kclm.owep.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/******************
 * @Author ZhangShaowei
 * @Create 2020/7/15 17:48
 * @Description 学员学习进度报告记录DAO层测试类
 */
@SpringBootTest
class StudentReportMapperTest {

    @Autowired
    private StudentReportMapper studentReportMapper;
    @Autowired
    private StudentMapper studentMapper;

    @Test
    void save() {
        StudentReport studentReport = new StudentReport();
        studentReport.setFkStudent(studentMapper.selectById(1));
        studentReport.setCreateTime(LocalDateTime.now());
        studentReport.setCourseName("测试课程名-1");
        studentReportMapper.save(studentReport);
    }

    @Test
    void update() {
        StudentReport studentReport = studentReportMapper.selectById(1);
        studentReport.setChapterName("测试章节名称-1");
        studentReportMapper.update(studentReport);
    }

    @Test
    void deleteById() {
        studentReportMapper.deleteById(1);
    }

    @Test
    void deleteSelect() {
        studentReportMapper.deleteSelect(Arrays.asList(2,3));
    }

    @Test
    void selectById() {
        studentReportMapper.selectById(3);
    }

    @Test
    void selectAll() {
        studentReportMapper.selectAll();
    }

}