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
@RequestMapping("/organization")
public class OrganizationController {

    @GetMapping("/orgList")
    public String toOrgListPage() {
        return "organization/orgList";
    }

    @GetMapping("/branchList")
    public String toBranchListPage() {
        return "organization/branchList";
    }
}
