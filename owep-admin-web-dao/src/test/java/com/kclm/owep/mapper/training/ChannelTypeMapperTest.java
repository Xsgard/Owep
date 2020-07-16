package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Channel;
import com.kclm.owep.entity.ChannelType;
import com.kclm.owep.mapper.ChannelTypeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootTest
class ChannelTypeMapperTest {

    @Autowired
    private ChannelTypeMapper channelTypeMapper;

    @Test
    void save() {
        ChannelType channelType = new ChannelType();
        channelType.setChannelTypeName("其他");
        channelType.setLastAccessTime(LocalDateTime.now());
        channelTypeMapper.save(channelType);


    }

    @Test
    void update() {
        ChannelType channelType = new ChannelType();
        channelType.setId(3);
        channelType.setChannelTypeName("企业");
        channelTypeMapper.update(channelType);
    }

    @Test
    void deleteById() {

        channelTypeMapper.deleteById(5);
    }

    @Test
    void selectById() {
        ChannelType channelType = channelTypeMapper.selectById(1);
        System.out.println(channelType);
        List<Channel> channelList = channelType.getChannelList();
        System.out.println("<--------------------->");
        channelList.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<ChannelType> channelTypes = channelTypeMapper.selectAll();
        channelTypes.forEach(System.out::println);
    }
}