/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.mapper;

import com.kclm.owep.entity.Clazz;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

/*****************
 *
 * @author tanj
 * @date 2020/7/7 9:42
 * @version v1.0
 * @description
 *
 */
@SpringBootTest
public class ClassDaoTest {
    @Autowired
    private ClazzMapper clazzMapper;
/*
    @Test
    void test(){
        Clazz clazz = clazzMapper.selectByPrimaryKey(1);
        System.out.println(clazz);
    }*/


}
