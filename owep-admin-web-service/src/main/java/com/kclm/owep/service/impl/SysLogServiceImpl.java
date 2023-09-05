package com.kclm.owep.service.impl;

import com.github.pagehelper.PageHelper;
import com.kclm.owep.convert.LogTableConvert;
import com.kclm.owep.dto.LogTableDTO;
import com.kclm.owep.entity.SystLog;
import com.kclm.owep.mapper.SysLogMapper;
import com.kclm.owep.service.SysLogService;
import com.kclm.owep.utils.exceptions.BusinessException;
import com.kclm.owep.utils.exceptions.ParameterWrongException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Asgard
 * @version 1.0
 * @description: SysLogServiceImpl
 * @date 2023/9/4 19:24
 */
@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private LogTableConvert logTableConvert;

    @Autowired
    private SysLogMapper sysLogMapper;

    /**
     * 获取系统日志 分页
     *
     * @param offset 偏移量
     * @param limit  条数
     * @return 系统日志信息集合
     */
    @Override
    public List<LogTableDTO> getSysLogs(Integer offset, Integer limit) {
        PageHelper.offsetPage(offset, limit);
        List<SystLog> allStsLogs = sysLogMapper.getAllStsLogs();
        return allStsLogs.stream()
                .map(log -> logTableConvert.toDto(log))
                .collect(Collectors.toList());
    }

    /**
     * 删除日志
     *
     * @param id 日志Id
     */
    @Transactional
    @Override
    public void deleteById(Integer id) {
        if (id == null)
            throw new ParameterWrongException(502, "传入的Id为空！");
        int i = sysLogMapper.deleteById(id);
        if (i < 1)
            throw new BusinessException("删除失败！");
    }
}
