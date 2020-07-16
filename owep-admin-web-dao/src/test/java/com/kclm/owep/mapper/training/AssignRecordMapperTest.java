package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.AssignRecord;
import com.kclm.owep.entity.Client;
import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.AssignRecordMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class AssignRecordMapperTest {

    @Autowired
    private AssignRecordMapper assignRecordMapper;


    /**
     * 测试咨询师转出记录
     * 通过咨询师的id
     */
    @Test
    void selectByFormId() {
        List<AssignRecord> byFormId = assignRecordMapper.selectByFormId(1);
        byFormId.forEach(System.out::println);
    }

    /**
     * 测试咨询师接收的记录
     */
    @Test
    void selectByToId() {
        List<AssignRecord> byToId = assignRecordMapper.selectByToId(2);
        byToId.forEach(System.out::println);
    }

    /**
     * 保存咨询师转出记录
     */
    @Test
    void save() {
        AssignRecord assignRecord = new AssignRecord();
        Client client = new Client();
        client.setId(2);
        assignRecord.setClient(client);
        User user = new User();
        user.setId(1);
        assignRecord.setFromUser(user);
        User user1 = new User();
        user1.setId(2);
        assignRecord.setToUser(user1);
        assignRecord.setReason("特殊原因");
        assignRecord.setLastAccessTime(LocalDateTime.now());
        assignRecordMapper.save(assignRecord);

    }

    /**
     * 更新转让记录信息
     */
    @Test
    void update() {
        AssignRecord assignRecord = new AssignRecord();
        assignRecord.setId(5);
        Client client = new Client();
        client.setId(2);
        assignRecord.setClient(client);
        User user = new User();
        user.setId(1);
        assignRecord.setFromUser(user);
        User user1 = new User();
        user1.setId(2);
        assignRecord.setToUser(user1);
        assignRecord.setReason("打王者没有时间");
        assignRecord.setLastAccessTime(LocalDateTime.now());
        assignRecordMapper.update(assignRecord);
    }

    /**
     * 删除多条转让记录
     */
    @Test
    void deleteSelect() {
        List<Serializable> integers = Arrays.asList(3, 4);
        assignRecordMapper.deleteSelect(integers);
    }

    /**
     * 通过记录id查询记录
     */
    @Test
    void selectById() {
        AssignRecord assignRecord = assignRecordMapper.selectById(5);
        System.out.println(assignRecord);
        Client client = assignRecord.getClient();
        System.out.println("-------------->"+client);
    }


}