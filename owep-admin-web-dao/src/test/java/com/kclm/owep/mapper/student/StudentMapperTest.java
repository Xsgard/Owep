package com.kclm.owep.mapper.student;

import com.kclm.owep.entity.Student;
import com.kclm.owep.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;
    @Test
    void deleteById() {
    }

    @Test
    void deleteSelect() {
    }

    @Test
    void selectById() {
        Student student = studentMapper.selectById(1);
        System.out.println(student);
    }
}