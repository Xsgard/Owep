package com.kclm.owep.mapper.user;

import com.kclm.owep.entity.Message;
import com.kclm.owep.entity.Student;
import com.kclm.owep.mapper.MessageMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/******************
 * @Author ZhangShaowei
 * @Create 2020/7/15 14:15
 * @Description 消息记录DAO层测试类
 */
@SpringBootTest
class MessageMapperTest {

    @Autowired
    public MessageMapper messageMapper;

    @Test
    void save() {
        Message message = new Message();
        message.setTitle("java如何遍历三维数组？");
        message.setContent("大哥教教我呗，我请你吃糖...");
        message.setRead(0);
        message.setCreateTime(LocalDateTime.now());
        message.setLastAccessTime(LocalDateTime.now());
        message.setFromUserName("张三");
        message.setToUserName("李四");

        Student student = new Student();
        student.setId(4);
        student.setStuName("17376084");
        student.setStuName("张三");
        student.setStuType("应届生");
        student.setPerfectStatus(0);

        Student student1 = new Student();
        student1.setId(2);
        student1.setStuName("17376085");
        student1.setStuName("李四");
        student1.setStuType("应届生");
        student1.setPerfectStatus(0);
        student1.setCreateTime(LocalDateTime.now());

        message.setFkFromStudent(student);
        message.setToFromStudent(student1);

        messageMapper.save(message);
    }

    @Test
    void update() {
        Message message = new Message();
        message.setTitle("我是来测试更新的");
        message.setId(1);
        Student student = new Student();
        student.setId(1);
        message.setFkFromStudent(student);
        messageMapper.update(message);
    }

    @Test
    void deleteById() {
        messageMapper.deleteById(8);
    }

    @Test
    void deleteSelect() {
        List<Serializable> idList = Arrays.asList(3, 4);
        messageMapper.deleteSelect(idList);
    }

    @Test
    void selectById() {
        messageMapper.selectById(8);
    }

    @Test
    void selectAll() {
        messageMapper.selectAll();
    }
}