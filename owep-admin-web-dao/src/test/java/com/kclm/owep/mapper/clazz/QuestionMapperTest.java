package com.kclm.owep.mapper.clazz;

import com.kclm.owep.entity.Clazz;
import com.kclm.owep.entity.Question;
import com.kclm.owep.entity.Student;
import com.kclm.owep.entity.Video;
import com.kclm.owep.mapper.QuestionMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/*********************
 * @Author: tanj
 * @Version : v1.0
 * @Create: 2020年7月07日 下午16:10:40
 * @Description 视频问答测试
 */
@SpringBootTest
class QuestionMapperTest {

    private static final Logger LOGGER= LoggerFactory.getLogger(QuestionMapperTest.class);
    @Autowired
    private QuestionMapper questionMapper;
    @Test
    void save() {
        Question question = new Question();
        question.setQuestionContent("文件大小字母读写");
        Video video = new Video();
        video.setId(1);
        question.setVideo(video);
        Student student = new Student();
        student.setId(1);
        Clazz clazz = new Clazz();
        clazz.setId(1);
        question.setStudent(student);
        question.setClazz(clazz);
        int save = questionMapper.save(question);
        LOGGER.info("{}行记录受影响",save);
    }

    @Test
    void update() {
        Question question = new Question();
        question.setQuestionAuthor("tanj");
        question.setId(2);
        int update = questionMapper.update(question);
        LOGGER.info("{}行记录受影响",update);
    }

    @Test
    void deleteById() {
        int i = questionMapper.deleteById(2);
        LOGGER.info("{}行记录受影响",i);
    }

    @Test
    void deleteSelect() {
        List<Serializable> idList = Arrays.asList(3, 4);
        int i = questionMapper.deleteSelect(idList);
        LOGGER.info("{}行记录受影响",i);
    }

    @Test
    void selectById() {
        Question question = questionMapper.selectById(1);
        System.out.println(question);
    }

    @Test
    void selectAll() {
        List<Question> questions = questionMapper.selectAll();
        questions.forEach(System.out::println);
    }
}