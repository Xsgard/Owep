/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tanj
 * @version v1.0
 * @date 2020/6/28 21:15
 * @description 描述班级模块跳转到指定页面
 */
@Controller
@RequestMapping("clazz")
public class ClazzController {


    /***
     * 跳转到专业方向页面
     * @return
     */
    @GetMapping("major")
    public String toClazzMajor(){
        return "clazz/major";
    }

    /***
     * 跳转到班级列表页面
     * @return
     */
    @GetMapping("clazzList")
    public String toClazzList(){
        return "clazz/clazzList";
    }

    /***
     * 跳转到班级作业页面
     * @return
     */
    @GetMapping("homework")
    public String toHomework(){
        return "clazz/homework";
    }

    /***
     * 跳转到布置作业页面
     * @return
     */
    @GetMapping("question")
    public String toQuestion(){
        return "clazz/question";
    }

    /***
     * 跳转到学习进度页面
     * @return
     */
    @GetMapping("studyProcess")
    public String toStudyProcess(){
        return "clazz/studyProcess";
    }
}
