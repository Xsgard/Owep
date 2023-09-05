package com.kclm.owep.web.controller;

import com.kclm.owep.dto.NodeDTO;
import com.kclm.owep.dto.StudentDTO;
import com.kclm.owep.dto.StudentSuggestDTO;
import com.kclm.owep.entity.Student;
import com.kclm.owep.entity.User;
import com.kclm.owep.service.StudentService;
import com.kclm.owep.service.UserService;
import com.kclm.owep.utils.exceptions.BusinessException;
import com.kclm.owep.utils.exceptions.ParameterWrongException;
import com.kclm.owep.utils.util.R;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @Autowired
    private StudentService studentService;

    //跳转至管理员管理页面
    @GetMapping("/adminList")
    public String toAdminList() {
        return "user/adminList";
    }

    //跳转至学生管理页面
    @GetMapping("/stuList")
    public String toStuList() {
        return "user/stuList";
    }

    //跳转至老师管理页面
    @GetMapping("/teacherList")
    public String toTeacherList() {
        return "user/teacherList";
    }

    //管理员-获取全部信息
    @ResponseBody
    @GetMapping("/adminList/getTable")
    public R getAdminList(Integer limit, Integer offset) {
        return R.ok().put("data", userService.getAllAdmin(limit, offset));
    }

    //老师-获取老师信息
    @GetMapping("/teacherList/getTable")
    @ResponseBody
    public R getTeacherList(Integer limit, Integer offset) {
        List<User> allTeacher = userService.getAllTeacher(limit, offset);
        return R.ok().put("data", allTeacher);
    }

    //老师-添加
    @PostMapping("/teacherList/addTeacher")
    @ResponseBody
    public R addTeacher(User user) {
        try {
            user.setUserType(2);
            userService.saveUser(user);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok();
    }

    //老师-修改状态
    @GetMapping("/teacherList/switch")
    @ResponseBody
    public R activeTeacher(Integer userId, Integer status) {
        try {
            userService.activeUser(userId, status);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("状态修改成功！");
    }

    //老师-修改
    @PostMapping("/adminList/edit")
    @ResponseBody
    public R editTeacher(@RequestBody User user) {
        try {
            user.setUserType(2);
            userService.updateUser(user);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("修改成功！");
    }

    //老师-删除
    @GetMapping("/teacherList/delete")
    @ResponseBody
    public R deleteTeacherById(Integer id) {
        try {
            userService.deleteById(id);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("修改成功！");
    }

    //老师-批量删除老师
    @PostMapping("/teacherList/deleteByGroup")
    @ResponseBody
    public R deleteTeacherByIds(@RequestBody List<Serializable> ids) {
        try {
            userService.deleteByIds(ids);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("删除成功！");
    }

    //管理员-搜索
    @PostMapping("/adminList/search")
    @ResponseBody
    public R getUserByNameAndRealName(User user) {
        return R.ok().put("data", userService.selectUserByCond(user));
    }

    //学生-获取全部信息
    @GetMapping("/stuList/getTable")
    @ResponseBody
    public R getStudentList(String order, Integer limit, Integer offset) {
        List<StudentDTO> studentInfo = studentService.getStudentInfo(order, limit, offset);
        return R.ok().put("data", studentInfo);
    }

    //学生-添加
    @PostMapping("/stuList/addStudent")
    @ResponseBody
    public R addStudent(@RequestBody Student student) {
        try {
            studentService.addStudent(student);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("添加成功！");
    }

    //学生-删除
    @GetMapping("/stuList/delete")
    @ResponseBody
    public R deleteStudent(@RequestParam("id") Serializable id) {
        try {
            studentService.deleteById(id);
        } catch (ParameterWrongException e) {
            //捕获参数异常
            log.error(e.getMessage());
            return R.error(e.getMsg());
        } catch (BusinessException exception) {
            //捕获业务异常
            return R.error(exception.getMessage());
        }
        return R.ok("删除成功！");
    }

    @PostMapping("/stuList/deleteByGroup")
    @ResponseBody
    public R deleteStuByIds(@RequestBody List<Serializable> ids) {
        try {
            studentService.deleteByIds(ids);
        } catch (ParameterWrongException e) {
            //捕获参数异常
            log.error(e.getMessage());
            return R.error(e.getMsg());
        } catch (BusinessException exception) {
            //捕获业务异常
            return R.error(exception.getMessage());
        }
        return R.ok("删除成功！");
    }

    //学生-修改
    @PostMapping("/stuList/edit")
    @ResponseBody
    public R editStudent(@RequestBody Student student) {
        try {
            studentService.updateStudent(student);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("修改成功！");
    }

    //学生-状态修改
    @GetMapping("/stuList/switch")
    @ResponseBody
    public R stuSwitch(@Param("id") Integer id, @Param("status") Integer status) {
        studentService.stuSwitch(id, status);
        return R.ok("修改成功！");
    }

    //学生-学生班级树
    @GetMapping("/stuList/classTreeCheck")
    @ResponseBody
    public R getClassTreeCheck(Integer id) {
        List<NodeDTO> clazzTreeCheck = studentService.getClazzTreeCheck(id);
        return R.ok().put("data", clazzTreeCheck);
    }

    //学生-bsSuggest请求
    @GetMapping("/stuList/suggest")
    @ResponseBody
    public R studentSuggestInfo() {
        List<StudentSuggestDTO> studentSuggestInfo = studentService.getStudentSuggestInfo();
        return R.ok().put("value", studentSuggestInfo);
    }

    //管理员-修改状态
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

    //管理员-添加
    @PostMapping("/adminList/addAdmin")
    @ResponseBody
    public R addUser(@RequestBody User user) {
        try {
            user.setUserType(1);
            userService.saveUser(user);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("添加成功！");
    }

    //管理员-修改
    @PostMapping("/adminList/edit")
    @ResponseBody
    public R editUser(@RequestBody User user) {
        try {
            user.setUserType(1);
            userService.updateUser(user);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("修改成功！");
    }

    //管理员-删除
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

    //管理员-管理员用户组信息
    @GetMapping("/adminList/treeCheck")
    @ResponseBody
    public R getUserGroup(Integer id) {
        List<NodeDTO> userGroup = userService.getUserGroup(id);
        return R.ok().put("data", userGroup);
    }

    //管理员-批量删除管理员
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

    //管理员-导出管理员信息
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
