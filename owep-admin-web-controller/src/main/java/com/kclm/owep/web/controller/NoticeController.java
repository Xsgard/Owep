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
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping("/noticeList")
    public String toNoticeListPage() {
        return "notice/noticeList";
    }

    //TODO 
    @GetMapping("/newsList")
    public String toNewsListPage() {
        return "notice/newsList";
    }
}
