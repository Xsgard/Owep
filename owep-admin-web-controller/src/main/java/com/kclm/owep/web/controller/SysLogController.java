package com.kclm.owep.web.controller;

import com.kclm.owep.dto.LogTableDTO;
import com.kclm.owep.dto.SystLogDTO;
import com.kclm.owep.entity.SystLog;
import com.kclm.owep.service.SysLogService;
import com.kclm.owep.utils.exceptions.BusinessException;
import com.kclm.owep.utils.exceptions.ParameterWrongException;
import com.kclm.owep.utils.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: SysLogController
 * @date 2023/9/4 19:01
 */
@Controller
@RequestMapping("/log")
@Slf4j
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @GetMapping("/list")
    public String toLogListPage(){
        return "log/list";
    }

    @GetMapping("/sysLogs")
    @ResponseBody
    public R getLogs(Integer offset, Integer limit) {
        List<LogTableDTO> sysLogs = sysLogService.getSysLogs(offset, limit);
        return R.ok().put("data", sysLogs);
    }

    @GetMapping("/delete")
    @ResponseBody
    public R deleteById(Integer id) {
        try {
            sysLogService.deleteById(id);
        } catch (ParameterWrongException e) {
            return R.error(e.getMsg());
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("删除成功！");
    }
}
