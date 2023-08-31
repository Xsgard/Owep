package com.kclm.owep.web.controller;

import com.kclm.owep.dto.NodeDTO;
import com.kclm.owep.entity.User;
import com.kclm.owep.service.UserService;
import com.kclm.owep.utils.exceptions.BusinessException;
import com.kclm.owep.utils.util.BeanValidationUtils;
import com.kclm.owep.utils.util.R;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/adminList")
    public String toAdminList() {
        return "user/adminList";
    }

    @GetMapping("/stuList")
    public String toStuList() {
        return "user/stuList";
    }

    @ResponseBody
    @GetMapping("/adminList/getTable")
    public R getAdminList(Integer limit, Integer offset) {
        return R.ok().put("data", userService.getAllAdmin(limit, offset));
    }

    @ResponseBody
    @GetMapping("/adminList/search")
    public R getUserByNameAndRealName(User user) {
        return R.ok().put("data", userService.selectUserByCond(user));
    }

    @GetMapping("/stuList/getTable")
    @ResponseBody
    public R getStudentList() {

        return null;
    }

    @GetMapping("/adminList/switch")
    @ResponseBody
    public R activeUser(Integer userId, Integer status) {
        try {
            userService.activeUser(userId, status);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("状态修改成功！");
    }

    @PostMapping("/adminList/addAdmin")
    @ResponseBody
    public R addUser(@RequestBody User user) {
        try {
            userService.saveUser(user);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("添加成功！");

    }

    @PostMapping("/adminList/edit")
    @ResponseBody
    public R editUser(@RequestBody User user) {
        try {
            userService.updateUser(user);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("修改成功！");
    }

    @GetMapping("/adminList/delete")
    @ResponseBody
    public R deleteById(Integer id) {
        try {
            userService.deleteById(id);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("修改成功！");
    }

    @GetMapping("/adminList/treeCheck")
    @ResponseBody
    public R getUserGroup(Integer id) {
        List<NodeDTO> userGroup = userService.getUserGroup(id);
        return R.ok().put("data", userGroup);
    }

    @PostMapping("/adminList/deleteByGroup")
    @ResponseBody
    public R deleteByIds(@RequestBody List<Serializable> ids) {
        try {
            userService.deleteByIds(ids);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("删除成功！");
    }

    @GetMapping("/adminList/exportUserInfo")
    @ResponseBody
    public R exportUserInfo(HttpServletResponse response) {
        try {
            userService.exportUserInfo(response);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
