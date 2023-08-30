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
@RequestMapping("/clazz")
public class ClazzController {

    @GetMapping("/major")
    public String toMajorPage() {
        return "clazz/major";
    }

    @GetMapping("/clazzList")
    public String toClazzListPage() {
        return "clazz/clazzList";
    }

    @GetMapping("/question")
    public String toQuestionPage() {
        return "clazz/question";
    }

    @GetMapping("/homework")
    public String toHomeWorkPage() {
        return "clazz/homework";
    }

    @GetMapping("/studyProcess")
    public String toStudyProcessPage() {
        return "clazz/studyProcess";
    }

}
