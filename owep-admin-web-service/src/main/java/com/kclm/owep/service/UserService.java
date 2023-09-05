package com.kclm.owep.service;

import com.kclm.owep.dto.NodeDTO;
import com.kclm.owep.dto.UserDto;
import com.kclm.owep.entity.Permission;
import com.kclm.owep.entity.User;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**********************************8
 * @author yejf
 * 这里只是提供了一个用来
 */
public interface UserService {

    UserDto selectByName(String name);

    List<Permission> getPermissionListByUserId(Integer userId);

    int refreshLoginTime(Integer userId);

    List<User> getAllAdmin(Integer limit,Integer offset);

    List<User> getAllAdvisor(Integer limit, Integer offset);

    List<User> getAllTeacher(Integer limit, Integer offset);

    List<User> selectUserByCond(User user);

    void saveUser(User user);

    void activeUser(Integer userId, Integer status);

    void updateUser(User user);

    void deleteById(Integer userId);

    List<NodeDTO> getUserGroup(Integer userId);

    void deleteByIds(List<Serializable> ids);

    void exportUserInfo(HttpServletResponse response,String nameForSheet) throws IOException;

    void treeCheckEdit(Integer userId, List<Integer> groupId);
}
