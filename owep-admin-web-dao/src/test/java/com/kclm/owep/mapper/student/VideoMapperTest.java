package com.kclm.owep.mapper.student;

import com.kclm.owep.entity.Video;
import com.kclm.owep.mapper.VideoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class VideoMapperTest {

    @Autowired
    private VideoMapper videoMapper;
    @Test
    void deleteById() {
    }

    @Test
    void deleteSelect() {
    }

    @Test
    void selectById() {
        Video video = videoMapper.selectById(1);
        System.out.println(video);
    }
}