/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper.evaluation;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.PollTemplate;
import com.kclm.owep.mapper.PollTemplateMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/8 15:52
 *@Description: 考评模板测试类
 ***/

@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class PollTemplateMapperTest {

    @Autowired
    private PollTemplateMapper pollTemplateMapper;

    @Test
    void testSave(){
        final PollTemplate pollTemplate1 = new PollTemplate("测试模板内容1", "测试考评模板1", "1", 0);
        final int i = pollTemplateMapper.save(pollTemplate1);
        System.out.println("成功执行了"+i+"条方法");
    }

    @Test
    void testUpdate(){
        final PollTemplate pollTemplate = pollTemplateMapper.selectById(1);
        pollTemplate.setTemplateContent("修改后的测试模板内容");
        pollTemplateMapper.update(pollTemplate);
    }

    @Test
    void testSelectById(){

    }

    @Test
    void testselectAll(){
        final List<PollTemplate> pollTemplates = pollTemplateMapper.selectAll();
        System.out.println("===============>"+pollTemplates);
    }

    @Test
    void deleteById(){
        pollTemplateMapper.deleteById(1);
    }

    @Test
    void deleteSelect() {
        final ArrayList<Serializable> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        pollTemplateMapper.deleteSelect(list);
    }

   @Test
    void testFindByKeywords(){
       final List<PollTemplate> result = pollTemplateMapper.findByKeywords("测试");
       System.out.println("===========>"+result);
   }

    @Test
    void testCountPollItem(){
        final int i = pollTemplateMapper.countPollTemplate();
        System.out.println("共有"+i+"条模板");
    }

    @Test
    void findbyId(){
        PollTemplate pollTemplate = pollTemplateMapper.selectById(4);
        System.out.println(pollTemplate);
        pollTemplate.getPollItemList().forEach(System.out::println);
    }
}
