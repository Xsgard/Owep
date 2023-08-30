package com.kclm.owep.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Asgard
 * @version 1.0
 * @description: TODO
 * @date 2023/8/30 16:12
 */
@Controller
@RequestMapping("/system")
public class SystemController {
    @GetMapping("/paraminfo")
    public String toParamInfoPage() {
        return "system/paramInfo";
    }

    @GetMapping("/config")
    public String toConfigPage() {
        return "system/config";
    }

    @GetMapping("/backup")
    public String toBackUpPage() {
        return "system/backup";
    }
}
