package com.kclm.owep.mapper.user;

import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/******************
 * @Author ZhangShaowei
 * @Create 2020/7/15 17:32
 * @Description 用户记录DAO层测试类
 */
@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void save() {
        User user = new User();
        user.setRealName("测试真实姓名-1");
        user.setTitle("测试职位-1");
        user.setPerfectStatus(0);
        user.setIsDelete(0);
        userMapper.save(user);
    }

    @Test
    void update() {
        User user = userMapper.selectById(3);
        user.setUserName("测试用户姓名-1");
        userMapper.update(user);
    }

    @Test
    void deleteById() {
        userMapper.deleteById(3);
    }

    @Test
    void deleteSelect() {
        List<Serializable> idList = Arrays.asList(3,4);
        userMapper.deleteSelect(idList);
    }

    @Test
    void selectById() {
        userMapper.selectById(1);
    }

    @Test
    void selectAll() {
        userMapper.selectAll();
    }
}