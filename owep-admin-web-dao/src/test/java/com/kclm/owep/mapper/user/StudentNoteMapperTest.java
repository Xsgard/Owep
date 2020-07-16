package com.kclm.owep.mapper.user;

import com.kclm.owep.entity.Course;
import com.kclm.owep.entity.Student;
import com.kclm.owep.entity.StudentNote;
import com.kclm.owep.mapper.CourseMapper;
import com.kclm.owep.mapper.StudentMapper;
import com.kclm.owep.mapper.StudentNoteMapper;
import com.kclm.owep.mapper.VideoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/******************
 * @Author ZhangShaowei
 * @Create 2020/7/15 17:47
 * @Description 学员笔记记录DAO层测试类
 */
@SpringBootTest
class StudentNoteMapperTest {

    @Autowired
    private StudentNoteMapper studentNoteMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private VideoMapper videoMapper;

    @Test
    void save() {
        StudentNote studentNote = new StudentNote();
        studentNote.setFkStudent(studentMapper.selectById(1));
        studentNote.setFkCourse(courseMapper.selectById(1));
        studentNote.setFkVideo(videoMapper.selectById(1));
        studentNote.setNoteTitle("测试笔记标题-1");
        studentNoteMapper.save(studentNote);
    }

    @Test
    void update() {
        StudentNote studentNote = studentNoteMapper.selectById(1);
        studentNote.setNoteContent("测试笔记内容-1");
        studentNoteMapper.update(studentNote);
    }

    @Test
    void deleteById() {
        studentNoteMapper.deleteById(1);
    }

    @Test
    void deleteSelect() {
        studentNoteMapper.deleteSelect(Arrays.asList(2,3));
    }

    @Test
    void selectById() {
        studentNoteMapper.selectById(3);
    }

    @Test
    void selectAll() {
        studentNoteMapper.selectAll();
    }
}