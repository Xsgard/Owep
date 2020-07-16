/******************
 *版权所有 CopyRight(c) 快程乐码信息科技有限公司所有，未经授权。不得复制转发
 *
 */
package com.kclm.owep.mapper.resource;
import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.ResourceType;
import com.kclm.owep.mapper.ResourceTypeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/********
 *@Author WSP
 *@Version v1.0
 *@Create 2020/7/9 0009 10:50
 *@Description 资源类型测试类
 */
@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class ResourceTypeMapperTest {

    @Autowired
    private ResourceTypeMapper resourceTypeMapper;

    @Test
    void save(){
        ResourceType resourceType = new ResourceType();
        resourceType.setTypeName("课程资源");
        resourceType.setTypeDesc("公开的资源哈哈");
        resourceType.setIsDelete(1);
        resourceType.setCreateTime(LocalDateTime.now());
        this.resourceTypeMapper.save(resourceType);
        System.out.println(resourceType);

    }
    @Test
    void update(){
        ResourceType resourceType = new ResourceType();
        resourceType.setId(1);
        resourceType.setTypeName("hahaha");
        resourceTypeMapper.update(resourceType);
    }

    @Test
    void deleteById(){
        resourceTypeMapper.deleteById(2);
    }

    @Test
    void deleteSelect(){
        List<Serializable> idList = Arrays.asList(2,3,4);
        resourceTypeMapper.deleteSelect(idList);
    }

    @Test
    void selectByte(){
       ResourceType resourceType = (ResourceType) resourceTypeMapper.selectById(1);
       System.out.println(resourceType);

    }
    @Test
    void selectAll(){
       List<ResourceType> all = resourceTypeMapper.selectAll();
        if (all != null){
            all.forEach(System.out::println);
        }
    }
}
