package com.kclm.owep.service.impl;

import com.kclm.owep.dto.StudentDTO;
import com.kclm.owep.service.BaseServiceTests;
import com.kclm.owep.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: StudentServiceTest
 * @date 2023/8/31 16:18
 */
public class StudentServiceTest extends BaseServiceTests {

    @Autowired
    private StudentService studentService;

    @Test
    public void getStudentInfoTest() {
        String order = "DESC";
        Integer offset = 0;
        Integer limit = 10;
        List<StudentDTO> studentInfo = studentService.getStudentInfo(order, offset, limit);
        studentInfo.forEach(System.out::println);
    }
}
