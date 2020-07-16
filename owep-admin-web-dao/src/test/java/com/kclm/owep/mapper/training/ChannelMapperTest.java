package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Channel;
import com.kclm.owep.entity.ChannelType;
import com.kclm.owep.mapper.ChannelMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ChannelMapperTest {

    @Autowired
    private ChannelMapper channelMapper;


    /**
     * 通过渠道类型id 查询该类型下的所有渠道
     */
    @Test
    void selectByChannelTypeId() {
        List<Channel> channels = channelMapper.selectByChannelTypeId(1);
        channels.forEach(System.out::println);
    }

    /**
     * 保存渠道
     */
    @Test
    void save() {
        Channel channel = new Channel();
        channel.setChannelName("招聘网站");
        ChannelType channelType = new ChannelType();
        channelType.setId(1);
        channel.setLastAccessTime(LocalDateTime.now());
        channel.setChannelType(channelType);
        channelMapper.save(channel);
    }

    /**
     * 更新渠道
     */
    @Test
    void update() {
        Channel channel = new Channel();
        channel.setId(1);
        channel.setChannelName("英雄联盟");
        ChannelType channelType = new ChannelType();
        channelType.setId(1);
        channel.setLastAccessTime(LocalDateTime.now());
        channel.setChannelType(channelType);
        channelMapper.update(channel);
    }

    /**
     * 删除所选
     */
    @Test
    void deleteSelect() {
        //channel在client中为外键
        List<Serializable> integers = Arrays.asList(3);
        channelMapper.deleteSelect(integers);

    }

    /**
     * 通过渠道id 获取渠道
     */
    @Test
    void selectById() {
        Channel channel = channelMapper.selectById(1);
        System.out.println(channel);
        /*测试外键是否能获取对象*/
        ChannelType channelType = channel.getChannelType();
        System.out.println(channelType+"<<<<<<<<<<<<<<<<<");
    }
}