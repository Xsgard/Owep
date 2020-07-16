package com.kclm.owep.mapper.student;

import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    void deleteById() {
    }

    @Test
    void deleteSelect() {
    }

    @Test
    void selectById() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }
}