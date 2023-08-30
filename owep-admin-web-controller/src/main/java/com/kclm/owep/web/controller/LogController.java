package com.kclm.owep.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Asgard
 * @version 1.0
 * @description: TODO
 * @date 2023/8/30 16:13
 */
@Controller
@RequestMapping("/log")
public class LogController {
    @GetMapping("/list")
    public String toLogListPage(){
        return "log/list";
    }
}
