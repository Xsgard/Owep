package com.kclm.owep.mapper.privilege;

import com.kclm.owep.entity.Group;
import com.kclm.owep.entity.Role;
import com.kclm.owep.mapper.ActionMapperTest;
import com.kclm.owep.mapper.GroupMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @program: owep
 * @package: com.kclm.owep.mapper.privilege
 * @description:
 * @author: qi_kran
 * @create: 2020-07-05 20:16
 **/
class GroupMapperTest extends ActionMapperTest {
@Autowired
private GroupMapper groupMapper;
    @Test
    void count() {
        int count = groupMapper.count();
        System.out.println(count);
    }

    @Test
    void findByAll() {
        List<Group> groups = groupMapper.selectAll();
        groups.forEach(System.out::println);
    }

    @Test
    void findByGroupName() {
        List<Group> byGroupName = groupMapper.findByGroupName("组");
        byGroupName.forEach(System.out::println);
    }

    @Test
    void findByGroupId() {
        Group group = groupMapper.selectById(1);
        System.out.println(group);

    }

    @Test
    void saveGroup() {
        groupMapper.save(new Group("组6", "测试组6", 5));
    }

    @Test
    void updateGroup() {
        Group group = groupMapper.selectById(1);
        group.setLastAccessTime(LocalDateTime.now());
        groupMapper.update(group);
    }

    @Test
    void deleteByIds() {
        List<Serializable> list = Arrays.asList(5, 4, 3);
        groupMapper.deleteSelect(list);
    }

    @Test
    void saveRoleForGroup() {

        groupMapper.assignRoleToGroup(2, 1);
        groupMapper.assignRoleToGroup(2, 2);
        groupMapper.assignRoleToGroup(2, 3);
        groupMapper.assignRoleToGroup(2, 4);
    }

    @Test
    void deleteByGroupId() {
        groupMapper.deleteById(6);
    }

    @Test
    void findRolesByGroupId() {
        List<Group> group = groupMapper.findRolesByGroupId(0);

    }

    @Test
    void countRolesByGroupId() {
        int i = groupMapper.countRolesByGroupId(1);
        System.out.println(i);
    }
    @Test
    void delByGroupIdAndRoleId(){
        groupMapper.deleteByGroupIdInGR(Arrays.asList(1));
    }

    @Test
    void findUserInGroup(){
        List<Group> group = groupMapper.findUserInGroup(0);

    }
}