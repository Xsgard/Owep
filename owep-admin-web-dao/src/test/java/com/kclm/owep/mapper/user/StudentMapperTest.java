package com.kclm.owep.mapper.user;

import com.kclm.owep.entity.Clazz;
import com.kclm.owep.entity.Student;
import com.kclm.owep.mapper.ClazzMapper;
import com.kclm.owep.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/******************
 * @Author ZhangShaowei
 * @Create 2020/7/15 15:45
 * @Description 学员记录DAO层测试类
 */
@SpringBootTest
class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ClazzMapper clazzMapper;

    @Test
    void save() {
        Student student = new Student();
        student.setStuName("测试学生-2");
        student.setStuNumber("17376001");
        student.setStuType("应届生");
        student.setPerfectStatus(0);
        student.setCreateTime(LocalDateTime.now());
        student.setClazz(clazzMapper.selectById(1));
        studentMapper.save(student);
    }

    @Test
    void update() {
        Student student = studentMapper.selectById(2);
        student.setStuName("测试学生-4");
        studentMapper.update(student);
    }

    @Test
    void deleteById() {
        studentMapper.deleteById(1);
    }

    @Test
    void deleteSelect() {
        List<Serializable> idList = Arrays.asList(2, 3);
        studentMapper.deleteSelect(idList);
    }

    @Test
    void selectById() {
        studentMapper.selectById(2);
    }

    @Test
    void selectAll() {
        studentMapper.selectAll();
    }
}