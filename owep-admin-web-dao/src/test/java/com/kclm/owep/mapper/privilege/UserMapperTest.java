package com.kclm.owep.mapper.privilege;

import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.BaseMapperTest;
import com.kclm.owep.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

public class UserMapperTest extends BaseMapperTest {
    @Resource
    UserMapper userMapper;


    @Test
    void getUserByNameAndRealName(){
        User user=new User();
        user.setUserName("admin");
        user.setRealName("叶加飞");
        List<User> users = userMapper.selectByCond(user);
        System.out.println(users);
    }

    @Test
    void saveTest(){
        User user=new User();
        user.setRealName("徐寺俊");
        user.setUserName("admin2");
        user.setPerfectStatus(0);
        user.setStatus(1);
        int update = userMapper.save(user);
        System.out.println(update);
        System.out.println(user.getId());
    }
}
