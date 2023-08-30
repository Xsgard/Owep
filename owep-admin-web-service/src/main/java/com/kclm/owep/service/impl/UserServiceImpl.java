package com.kclm.owep.service.impl;

import com.github.pagehelper.PageHelper;
import com.kclm.owep.convert.UserConvert;
import com.kclm.owep.dto.*;
import com.kclm.owep.entity.Group;
import com.kclm.owep.entity.Permission;
import com.kclm.owep.entity.Role;
import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.UserMapper;
import com.kclm.owep.service.GroupService;
import com.kclm.owep.service.PermissionService;
import com.kclm.owep.service.RoleService;
import com.kclm.owep.service.UserService;
import com.kclm.owep.utils.exceptions.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserConvert userConvert;
    @Autowired
    private GroupService groupService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDto selectByName(String name) {
        try {
            User user = userMapper.selectByName(name);
            log.info("user: {}", user);
            UserDto userDto = userConvert.toUserDto(user);
            log.info("userDto: {}", userDto);
            return userDto;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    @Override
    public List<Permission> getPermissionListByUserId(Integer userId) {
        List<Integer> groupIds = userMapper.getGroupId(userId);
        log.debug("用户{}的groupIds是:{}", userId, groupIds);
        Set<Integer> roleIds = new HashSet<>();
        for (Integer groupId : groupIds) {
            GroupRoleDTO groupRoleDTO = groupService.selectRolesByGroupId(groupId);
            List<Integer> roleIds1 = groupRoleDTO.getRoleIds();
            if (roleIds1 != null && !roleIds1.isEmpty()) {
                //从用户组id到角色id
                roleIds.addAll(roleIds1);
            }

        }
        log.debug("-- 用户id{}拥有的角色ID是：{}", userId, roleIds);
        List<Integer> permissionIdList = new ArrayList<Integer>();
        for (Integer roleId : roleIds) {
            RolePermissionDTO rolePermissionDTO = roleService.selectPermissionByRoleId(roleId);
            log.debug("---- 角色拥有的权限有：{}", rolePermissionDTO);
            List<Integer> permissionIds = rolePermissionDTO.getPermissionIds();
            if (permissionIds != null) {
                permissionIdList.addAll(permissionIds);
            }
        }
        //从角色id到权限id
        log.debug("--- persionIdList: {}", permissionIdList);
        List<Permission> permissionList = new ArrayList<Permission>();
        for (Integer permissionId : permissionIdList) {
            PermissionDTO permissionDTO = permissionService.selectById(permissionId);
            permissionList.add(permissionDTO);
        }//由id取权限信息
        log.debug("---- PermissionList: {}", permissionList);
        //返回权限集合
        return permissionList;
    }

    @Override
    public int refreshLoginTime(Integer userId) {

        try {
            //
            User user = userMapper.selectById(userId);
            //
            if (user != null) {
                user.setLastAccessTime(LocalDateTime.now());
                return userMapper.update(user);
            }
            //
            return -1;
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return -2;
    }

    /**
     * 查询所有的User
     *
     * @return
     */
    @Override
    public List<User> getAllAdmin(Integer limit, Integer offset) {
        PageHelper.offsetPage(offset, limit);
        return userMapper.selectAll();
    }

    /**
     * 根据user对象进行精确查询
     *
     * @param user
     * @return
     */
    @Override
    public List<User> selectUserByCond(User user) {
        return userMapper.selectByCond(user);
    }

    @Override
    public boolean saveUser(User user) {
        User select = userMapper.selectByName(user.getUserName());
        if (select != null)
            throw new BusinessException("用户名重复！");
        user.setCreateTime(LocalDateTime.now());
        int i = userMapper.save(user);
        return i > 0;
    }

    //修改用户状态
    @Override
    public void activeUser(Integer userId, Integer status) {
        User user = userMapper.selectById(userId);
        user.setStatus(status);
        int update = userMapper.update(user);
        if (update < 1)
            throw new BusinessException("修改状态失败！");
    }

    //修改用户信息
    @Override
    public void updateUser(User user) {
        int update = userMapper.update(user);
        if (update < 1) {
            throw new BusinessException("更新失败！");
        }
    }

    @Override
    public void deleteById(Integer userId) {
        int i = userMapper.deleteById(userId);
        if (i < 1)
            throw new BusinessException("删除失败！");
    }

    @Override
    public List<NodeDTO> getUserGroup(Integer userId) {
        //所有用户组信息
        List<Group> allUserGroup = userMapper.getAllUserGroup();
        //选中的用户组的Id
        List<Integer> groupIds = userMapper.selectGroupIds(userId);
        List<NodeDTO> collect = allUserGroup.stream().map(item -> {
            //组信息Dto
            NodeDTO dto = new NodeDTO();
            //设置文本信息
            dto.setText(item.getGroupName());
            //设置用户组Id
            dto.setTags(item.getId());
            //查询组对应的角色信息
            List<Role> roles = userMapper.selectGroupRole(item.getId());
            List<NodeDTO> nodes = new ArrayList<>();
            //遍历角色信息
            roles.forEach(r -> {
                //存储角色信息Dto
                NodeDTO node = new NodeDTO();
                //添加角色信息Id
                node.setTags(r.getId());
                //角色信息
                node.setText(r.getRoleName());
                nodes.add(node);
            });
            dto.setNodes(nodes);
            //
            if (groupIds.contains(item.getId())) {
                dto.nodeChecked();
                if (dto.getNodes() != null)
                    dto.getNodes().forEach(NodeDTO::nodeChecked);
            }

            return dto;
        }).collect(Collectors.toList());

        return collect;
    }


}
