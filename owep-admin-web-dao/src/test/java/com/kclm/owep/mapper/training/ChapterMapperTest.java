package com.kclm.owep.mapper.training;

import com.kclm.owep.entity.Chapter;
import com.kclm.owep.entity.Course;
import com.kclm.owep.mapper.ChapterMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
class ChapterMapperTest {

    @Autowired
    private ChapterMapper chapterMapper;

    /**
     * 测试总记录数
     */
    @Test
    void rowTotal() {
        long total = chapterMapper.rowTotal();
        System.out.println(total);
    }

    /**
     * 添加章
     */
    @Test
    void save() {
        Chapter chapter = new Chapter();
        chapter.setChapterNumber("1");
        chapter.setChapterName("oracle基础知识");
        chapter.setChapterImageUrl("https://sedn9.jpg");
        chapter.setChapterStatus(1);
        chapter.setChapterDesc("oracle基础知识");
        chapter.setVideoStatus(1);
        Course course = new Course();
        course.setId(1);
        course.setIsDelete(1);
        course.setLastAccessTime(LocalDateTime.now());
        chapter.setCourse(course);
        chapterMapper.save(chapter);
    }

    /**
     * 更新章
     */
    @Test
    void update() {
        Chapter chapter = new Chapter();
        chapter.setId(1);
        chapter.setChapterNumber("1");
        chapter.setChapterName("oracle基础知识");
        chapter.setChapterImageUrl("https/b409.jpg");
        chapter.setChapterStatus(1);
        chapter.setChapterDesc("oracle基础知识");
        chapter.setVideoStatus(1);
        Course course = new Course();
        course.setId(1);
        course.setIsDelete(1);
        course.setLastAccessTime(LocalDateTime.now());
        chapter.setCourse(course);
        chapterMapper.update(chapter);
    }

    @Test
    void deleteById() {
        chapterMapper.deleteById(1);
    }

    @Test
    void deleteSelect() {
        List<Serializable> integers = Arrays.asList(1);
        chapterMapper.deleteSelect(integers);
    }

    @Test
    void selectById() {
        Chapter chapter = chapterMapper.selectById(2);
        System.out.println(chapter);
    }

    @Test
    void selectAll() {
        List<Chapter> chapters = chapterMapper.selectAll();
        chapters.forEach(System.out::println);
    }
}