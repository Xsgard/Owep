/******************
 *版权所有 CopyRight(c) 快程乐码信息科技有限公司所有，未经授权。不得复制转发
 *
 */
package com.kclm.owep.mapper.resource;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.*;
import com.kclm.owep.mapper.ResourceMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/********
 *@Author WSP
 *@Version v1.0
 *@Create 2020/7/10 0010 10:36
 *@Description 文档管理测试类
 */
@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class ResourceMapperTest {

    @Autowired
    private ResourceMapper resourceMapper;

    @Test
    void selectById(){
        Resource resource = resourceMapper.selectById(1);
        System.out.println(resource);
    }

    @Test
    void findALl(){
        List<Resource> resources = resourceMapper.selectAll();
        resources.forEach(System.out::println);
    }

    @Test
    void save(){
        Resource resource = new Resource();
        resource.setResourceName("springboot学习笔记");
        resource.setResourceDesc("JAVA功夫好呵呵");
        resource.setResourceSuffix(".pdf");
        resource.setResourceSize(6165);
        Section section = new Section();
        section.setId(1);
        resource.setSection(section);
        Chapter chapter = new Chapter();
        chapter.setId(1);
        resource.setChapter(chapter);
        ResourceType resourceType = new ResourceType();
        resourceType.setId(1);
        Course course = new Course();
        course.setId(1);
        resource.setCourse(course);

        resource.setIsDelete(1);
        this.resourceMapper.save(resource);
        System.out.println(resource);
    }
    @Test
    void update(){
        Resource resource = new Resource();
        resource.setId(1);
        resource.setResourceName("测试一下哈哈");
        resourceMapper.update(resource);
    }

    @Test
    void deleteSelect(){
     List<Serializable> idList = Arrays.asList(2,3,4,5);
     resourceMapper.deleteSelect(idList);
    }


    @Test
    void selectAll(){
    List<Resource> all = resourceMapper.selectAll();
    if (all != null){
        all.forEach(System.out::println);
    }
    }
}
