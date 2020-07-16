package com.kclm.owep.mapper.privilege;

import com.kclm.owep.entity.Role;
import com.kclm.owep.mapper.ActionMapperTest;
import com.kclm.owep.mapper.RoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * @package: com.kclm.owep.mapper
 * @author: qi_kran
 * @create: 2020-07-06 11:22
 * @description: 角色测试类
 **/
class RoleMapperTest extends ActionMapperTest {
    @Autowired
    private RoleMapper roleMapper;

   /* @Test
    void saveRole() {
<<<<<<< HEAD
        Role role=new Role("工程师", "工程操作者", LocalDateTime.now(), LocalDateTime.now(), 1, null);
        roleMapper.saveRole(role);
=======
>>>>>>> 4d8b0531d6b19011932fe62c6edce26e621f3d16
        roleMapper.save(new Role("角色1", "测试角色1"));
        roleMapper.save(new Role("角色2", "测试角色2"));
        roleMapper.save(new Role("角色3", "测试角色3"));
        roleMapper.save(new Role("角色4", "测试角色4"));
        roleMapper.save(new Role("角色5", "测试角色5"));
//        Role role=new Role("工程师", "工程操作者", LocalDateTime.now(), LocalDateTime.now(), 1, null);
//        roleMapper.saveRole(role);
    }
<<<<<<< HEAD
*/
    @Test
    void updateRole() {
        Role role3 = roleMapper.selectById(3);
        Role role4 = roleMapper.selectById(4);
        Role role1 = roleMapper.selectById(1);
        role3.setParent(role1);
        role4.setParent(role1);
        /*更新父亲角色*/
        //roleMapper.update(role3);
        roleMapper.update(role4);

    }
    @Test
    void update(){
        Role role = roleMapper.selectById(1);
        roleMapper.update(role);
    }

    @Test
    void delRoleById() {
        roleMapper.deleteById(5);
    }

    @Test
    void findAll() {
        List<Role> roles = roleMapper.selectAll();
        roles.forEach(System.out::println);
    }

    @Test
    void findById() {
        Role role = roleMapper.selectById(1);
        System.out.println(role);
    }

    @Test
    void findByName() {
        Role byName = roleMapper.selectByName("1");
        System.out.println(byName);
    }

    @Test
    void findChilds() {
        List<Role> role = roleMapper.selectChild(0);
    }

    @Test
    void findParent() {
        List<Role> parent = roleMapper.selectParent(0);

    }

    @Test
    void findGroupsByRoleId() {
        List<Role> groups = roleMapper.selectGroupsByRoleId(1);

    }

    @Test
    void findPermissionInRole() {
        List<Role> role = roleMapper.selectPermissionInRole(2);
    }

    @Test
    void saveRoleForPermission() {
        roleMapper.assignPermissionToRole(1, 1);
        roleMapper.assignPermissionToRole(1, 2);
        roleMapper.assignPermissionToRole(2, 2);
        roleMapper.assignPermissionToRole(2, 1);
    }

    @Test
    void delPermissionByRoleId() {
        roleMapper.deletePermissionByRoleId(Arrays.asList(1));
    }

    @Test
    void delPermissionByPerIdAndRoleId() {
        roleMapper.deletePermissionByPerIdAndRoleId(2, 2);
    }

    @Test
    void countPermissionByRoleId() {
        int i = roleMapper.countPermissionByRoleId(1);
        System.out.println(i);
    }

    @Test
    void count() {
        int count = roleMapper.count();
        System.out.println(count);
    }
}