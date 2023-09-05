package com.kclm.owep.service.impl;

import com.kclm.owep.convert.UserConvert;
import com.kclm.owep.dto.*;
import com.kclm.owep.entity.Group;
import com.kclm.owep.entity.Permission;
import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.GroupMapper;
import com.kclm.owep.mapper.StudentMapper;
import com.kclm.owep.mapper.UserMapper;
import com.kclm.owep.service.GroupService;
import com.kclm.owep.service.PermissionService;
import com.kclm.owep.service.RoleService;
import com.kclm.owep.service.UserService;
import com.kclm.owep.utils.exceptions.BusinessException;
import com.kclm.owep.utils.exceptions.DeleteFailureException;
import com.kclm.owep.utils.exceptions.ParameterWrongException;
import com.kclm.owep.utils.export.ExcelExportUtil;
import com.kclm.owep.utils.util.ExportExcelUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private GroupMapper groupMapper;
    @Autowired
    private StudentMapper studentMapper;
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
     * 查询所有的管理员
     * userType=1
     *
     * @return
     */
    @Override
    public List<User> getAllAdmin(Integer limit, Integer offset) {
//        PageHelper.offsetPage(offset, limit);
        return userMapper.selectAll()
                .stream()
                .filter(item -> item.getUserType() != null && item.getUserType() == 1)
                .collect(Collectors.toList());
    }

    /**
     * 获取老师信息
     *
     * @param limit  每页条数
     * @param offset 偏移量
     * @return 老师信息集合
     */
    @Override
    public List<User> getAllTeacher(Integer limit, Integer offset) {
//        PageHelper.offsetPage(offset, limit);
        return userMapper.selectAll()
                .stream()
                .filter(item -> item.getUserType() != null && item.getUserType() == 2)
                .collect(Collectors.toList());
    }

    /**
     * 获取咨询师信息
     *
     * @param limit  每页条数
     * @param offset 偏移量
     * @return 咨询师信息集合
     */
    @Override
    public List<User> getAllAdvisor(Integer limit, Integer offset) {
        //        PageHelper.offsetPage(offset, limit);
        return userMapper.selectAll()
                .stream()
                .filter(item -> item.getUserType() != null && item.getUserType() == 3)
                .collect(Collectors.toList());
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
    public void saveUser(User user) {
        User select = userMapper.selectByName(user.getUserName());
        if (select != null)
            throw new BusinessException("用户名重复！");
        user.setCreateTime(LocalDateTime.now());
        userMapper.save(user);
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

    /**
     * 获取用户组信息
     *
     * @param userId 用户Id
     * @return 用户组节点信息集合
     */
    @Override
    public List<NodeDTO> getUserGroup(Integer userId) {
        //所有用户组信息
        List<Group> allUserGroup = groupMapper.getAllUserGroup();
        //选中的用户组的Id
        List<Integer> groupIds = groupMapper.selectGroupIds(userId);

        return allUserGroup.stream().map(item -> {
            //组信息Dto
            NodeDTO dto = new NodeDTO();
            //设置文本信息
            dto.setText(item.getGroupName());
            //设置用户组Id
            dto.setTags(item.getId());
            if (groupIds.contains(item.getId()))
                dto.nodeChecked();
            return dto;
        }).collect(Collectors.toList());
    }

    /**
     * 批量删除管理员信息
     *
     * @param ids 管理员Id
     */
    @Override
    public void deleteByIds(List<Serializable> ids) {
        if (!ids.isEmpty()) {
            int i = userMapper.deleteSelect(ids);
            if (i < 1) {
                throw new DeleteFailureException();
            }
        } else
            throw new BusinessException("未选中用户Id");
    }

    /**
     * 导出管理员信息
     *
     * @param response 响应
     * @throws IOException 异常
     */
    @Override
    public void exportUserInfo(HttpServletResponse response, String nameForSheet, Integer userType) throws IOException {
        List<User> userInfo = userMapper.getExportUserInfo().stream()
                .filter(user -> user.getUserType() != null && Objects.equals(user.getUserType(), userType))
                .collect(Collectors.toList());
        if (userInfo.isEmpty())
            throw new BusinessException("暂无数据，或出现异常！");
        List<Map<String, Object>> collect = new ArrayList<>();
        Map<String, Object> sheetName = new HashMap<>();
        sheetName.put("sheetName", nameForSheet);
        collect.add(sheetName);
        for (User item : userInfo) {
            Map<String, Object> map = getStringObjectMap(item);

            collect.add(map);
        }
        String[] keys = collect.get(1).keySet().toArray(String[]::new);
        String[] columns = {
                "用户名",
                "用户手机号",
                "真实姓名",
                "邮箱地址",
                "性别",
                "截止有效期",
                "状态",
                "职位",
                "最后登录时间",
                "描述",
                "是否删除",
        };
        Workbook workBook = ExportExcelUtils.createWorkBook(collect, keys, columns);
        ExcelExportUtil.exportAdminList(workBook, response, nameForSheet);
        log.info("导出成功！");


    }

    /**
     * 修改用户组绑定
     *
     * @param userId   用户Id
     * @param groupIds 用户组Id
     */
    @Transactional
    @Override
    public void treeCheckEdit(Integer userId, List<Integer> groupIds) {
        //判断传入的userId不为空
        if (userId == null)
            throw new ParameterWrongException(502, "用户Id为空");
        //获取与userId绑定的groupId
        List<Integer> ids = groupMapper.selectGroupIds(userId);
        //用户组Id集合不为空则删除该记录
        if (!ids.isEmpty()) {
            //删除记录
            int i = groupMapper.deleteByGroupId(userId);
            if (i < 1)
                throw new BusinessException("删除绑定记录失败！");
        }
        //添加用户Id与用户组Id绑定记录
        groupIds.forEach(gId -> {
            int i = groupMapper.saveUserGroup(userId, gId);
            if (i < 1)
                throw new BusinessException("添加绑定记录失败！");
        });
    }


    /**
     * 处理用户信息
     *
     * @param user 用户信息
     * @return map
     */
    private static Map<String, Object> getStringObjectMap(User user) {
        Map<String, Object> map = new LinkedHashMap<>();
        //添加三目运算处理空数据
        map.put("userName", user.getUserName() == null ? "" : user.getUserName());
        map.put("userPhone", user.getUserPhone() == null ? "" : user.getUserPhone());
        map.put("realName", user.getRealName() == null ? "" : user.getRealName());
        map.put("userEmail", user.getUserEmail() == null ? "" : user.getUserEmail());
        map.put("gender", user.getGender() == null ? "" : user.getGender() == 1 ? "男" : "女");
        //处理有效期日期格式
        map.put("effectiveDate", user.getEffectiveDate() == null ? "" :
                String.format(user.getEffectiveDate().toString(), "yyyy-MM-dd")
                        .replace("T", ""));
        map.put("status", (user.getStatus() == null ? "禁用" : user.getStatus() == 1 ? "启用" : "禁用"));
        map.put("title", user.getTitle() == null ? "" : user.getTitle());
        //处理最后登录时间格式
        map.put("lastAccessTime", user.getLastAccessTime() == null ? "" :
                String.format(user.getLastAccessTime().toString(), "yyyy-MM-dd HH:mm:ss")
                        .replace("T", " "));
        map.put("description", user.getDescription() == null ? "" : user.getDescription());
        map.put("isDelete", user.getIsDelete() == 0 ? "已删除" : "未删除");
        //返回map
        return map;
    }


    //TODO 反射重写 <T> 内的空属性未 ""
    public static <T> List<T> listNullFunction(List<T> list) {
        Iterator<T> iterator = list.iterator();
        List<T> result = new ArrayList<>();
        while (iterator.hasNext()) {
            T next = iterator.next();
            Class<?> cls = next.getClass();
            try {
                Object o = cls.getDeclaredConstructor().newInstance();
                Field[] declaredFields = cls.getDeclaredFields();
                for (Field declaredField : declaredFields) {
                    declaredField.setAccessible(true);
//                declaredField.set();
                }

            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                return null;
            }
        }
        return result;
    }


}
