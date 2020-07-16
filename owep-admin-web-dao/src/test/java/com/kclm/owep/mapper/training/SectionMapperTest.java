package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Chapter;
import com.kclm.owep.entity.Section;
import com.kclm.owep.mapper.SectionMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SectionMapperTest {

    @Autowired
    private SectionMapper sectionMapper;

    /**
     * 通过章id ，查询所有的节
     */
    @Test
    void selectAllById() {
        List<Section> sections =sectionMapper.selectAllById(1);
        sections.forEach(System.out::println);
    }

    /**
     * 添加节
     */
    @Test
    void save() {
        Section section = new Section();
        section.setSectionName("Oracle简单介绍");
        section.setSectionDesc("Oracle简单介绍");
        section.setSectionNumber("2");
        Chapter chapter = new Chapter();
        chapter.setId(1);
        section.setChapter(chapter);
        section.setExperiment(1);
        section.setExperimentDucumentFile("节点文档路径");
        section.setVideoStatus(1);
        section.setIsDelete(1);
        section.setExperimentInstrusction("实验简介");
        section.setLookVideoStatus(1);
        section.setExperimentEnvironmentAddr("实验环境地址为放入服务器硬盘上的虚拟机文件地址");
        this.sectionMapper.save(section);

    }

    /**
     * 更新节
     */
    @Test
    void update() {
        Section section = new Section();
        section.setId(1);
        section.setSectionName("Oracle简单介绍");
        section.setSectionDesc("Oracle简单介绍");
        section.setSectionNumber("2");
        Chapter chapter = new Chapter();
        chapter.setId(1);
        section.setChapter(chapter);
        section.setExperiment(1);
        section.setExperimentDucumentFile("节点文档路径");
        section.setVideoStatus(1);
        section.setIsDelete(1);
        section.setExperimentInstrusction("实验简介");
        section.setLookVideoStatus(1);
        section.setExperimentEnvironmentAddr("实验环境地址为放入服务器硬盘上的虚拟机文件地址");
        this.sectionMapper.update(section);
    }

    /**
     * 删除节
     */
    @Test
    void deleteById() {
        sectionMapper.deleteById(1);
    }
}