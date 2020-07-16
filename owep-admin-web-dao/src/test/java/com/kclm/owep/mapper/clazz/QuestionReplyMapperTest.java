package com.kclm.owep.mapper.clazz;

import com.kclm.owep.entity.Question;
import com.kclm.owep.entity.QuestionReply;
import com.kclm.owep.mapper.QuestionReplyMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*********************
 * @Author: tanj
 * @Version : v1.0
 * @Create: 2020年7月07日 下午16:10:40
 * @Description 视频问答回复测试
 */
@SpringBootTest
class QuestionReplyMapperTest {

    private static final Logger LOGGER= LoggerFactory.getLogger(QuestionReplyMapperTest.class);
    @Autowired
    private QuestionReplyMapper questionReplyMapper;
    @Test
    void save() {
        QuestionReply questionReply = new QuestionReply();
        Question question = new Question();
        question.setId(1);
        questionReply.setQuestion(question);
        questionReply.setReplyContent("在多看几遍视频2 ");
        questionReply.setReplyAuthor("yuyan");
        int save = questionReplyMapper.save(questionReply);
        LOGGER.info("{}条记录受影响",save);

    }

    @Test
    void update() {
        QuestionReply questionReply = new QuestionReply();
        questionReply.setId(2);
        questionReply.setReplyContent("update");
        questionReplyMapper.update(questionReply);
    }

    @Test
    void deleteById() {
        int i = questionReplyMapper.deleteById(2);
    }

    @Test
    void deleteSelect() {
        List<Serializable> idList = Arrays.asList(2, 3);
        questionReplyMapper.deleteSelect(idList);
    }

    @Test
    void selectById() {
        QuestionReply questionReply = questionReplyMapper.selectById(1);
        LOGGER.info("{}",questionReply);
    }

    @Test
    void selectAll() {
        List<QuestionReply> questionReplies = questionReplyMapper.selectAll();
        questionReplies.forEach(System.out::println);
    }
}