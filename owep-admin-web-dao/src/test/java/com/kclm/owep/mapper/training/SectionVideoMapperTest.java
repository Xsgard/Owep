package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Section;
import com.kclm.owep.entity.SectionVideo;
import com.kclm.owep.entity.Video;
import com.kclm.owep.mapper.SectionVideoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SectionVideoMapperTest {

    @Autowired
    private SectionVideoMapper sectionVideoMapper;

    @Test
    void selectAllById() {
        List<SectionVideo> sectionVideos = sectionVideoMapper.selectAllById(1);
        sectionVideos.forEach(System.out::println);

    }

    @Test
    void save() {
        SectionVideo sectionVideo = new SectionVideo();
        Section section = new Section();
        section.setId(1);
        sectionVideo.setSection(section);
        sectionVideo.setLastAccessTime(LocalDateTime.now());
        Video video = new Video();
        video.setId(1);
        sectionVideo.setVideo(video);
        sectionVideoMapper.save(sectionVideo);
    }

    @Test
    void deleteById() {

        int i = sectionVideoMapper.deleteById(2);
    }
}