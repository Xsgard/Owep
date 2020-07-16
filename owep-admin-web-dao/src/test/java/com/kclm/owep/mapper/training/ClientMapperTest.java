package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Channel;
import com.kclm.owep.entity.Client;
import com.kclm.owep.entity.Profession;
import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.ClientMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
class ClientMapperTest {

    @Autowired
    private ClientMapper clientMapper;

    @Test
    void findByField() {
        //sign_time需要改成timestamp
        User user = new User();
        user.setId(1);
        Client client = new Client();
        client.setUser(user);
        clientMapper.findByField(client);
    }

    @Test
    void rowTotal() {
        long total = clientMapper.rowTotal();
        System.out.println(total);
    }

    @Test
    void save() {
        Client client = new Client();
        client.setClientName("张二丰");
        client.setClientPhone("18812345655");
        client.setAdvancePay(3000d);
        client.setGender(1);
        client.setClientExperience("你为何如此优秀");
        client.setSalsemanDescribe("此人很优秀");
        client.setTotalPay(30000d);
        client.setMonthPay(6000d);
        client.setPayMent(6000);
        client.setIsAssignClass(1);
        client.setClientEmail("413127846@qq.com");
        client.setClientState(1);
        client.setLoan(30000d);
        client.setLoanStatus(1);
        client.setInterviewTimeStart(LocalDateTime.now());
        client.setInterviewTimeEnd(LocalDateTime.of(2022,9,11,9,11));
        client.setClientState(2);
        Profession profession = new Profession();
        profession.setId(1);
        client.setProfession(profession);
        client.setMajor("软件技术");
        client.setSignTime(LocalDateTime.now());
        client.setIsDelete(1);
        Channel channel = new Channel();
        channel.setId(1);
        client.setChannel(channel);
        client.setLastAccessTime(LocalDateTime.now());
        User user = new User();
        user.setId(1);
        client.setUser(user);
        clientMapper.save(client);
    }

    @Test
    void update() {
        Client client = new Client();
        client.setId(3);
        client.setClientName("张山丰");
        client.setClientPhone("18812345655");
        client.setAdvancePay(3000d);
        client.setGender(1);
        client.setClientExperience("你为何如此优秀");
        client.setSalsemanDescribe("此人很优秀");
        client.setTotalPay(30000d);
        client.setMonthPay(6000d);
        client.setPayMent(6000);
        client.setIsAssignClass(1);
        client.setClientEmail("413127846@qq.com");
        client.setClientState(1);
        client.setLoan(30000d);
        client.setLoanStatus(1);
        client.setInterviewTimeStart(LocalDateTime.now());
        client.setInterviewTimeEnd(LocalDateTime.of(2022,9,11,9,11));
        client.setClientState(2);
        Profession profession = new Profession();
        profession.setId(1);
        client.setProfession(profession);
        client.setMajor("软件技术");
        client.setSignTime(LocalDateTime.now());
        client.setIsDelete(1);
        Channel channel = new Channel();
        channel.setId(1);
        client.setChannel(channel);
        client.setLastAccessTime(LocalDateTime.now());
        User user = new User();
        user.setId(1);
        client.setUser(user);
        clientMapper.update(client);
    }

    @Test
    void deleteById() {
        clientMapper.deleteById(2);
    }

    @Test
    void deleteSelect() {
        List<Serializable> integers = Arrays.asList(2);
        clientMapper.deleteSelect(integers);
    }

    @Test
    void selectById() {
        Client client = clientMapper.selectById(1);
        System.out.println(client);
    }

    @Test
    void selectAll() {
        List<Client> clients = clientMapper.selectAll();
        clients.forEach(System.out::println);
    }
}