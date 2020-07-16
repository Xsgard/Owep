package com.kclm.owep.mapper;

import com.kclm.owep.OwepAdminWebDaoApplication;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class ActionMapperTest {

    @Autowired
    private ActionMapper actionMapper;

    @Test
    void insert() {
        System.out.println("actionMapper = " + actionMapper);
    }

    @Test
    public void testCount() {
        int count = actionMapper.count();
        assertEquals(6, count);
        System.out.println("count = " + count);
    }
}