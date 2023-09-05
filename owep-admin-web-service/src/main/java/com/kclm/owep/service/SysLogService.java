package com.kclm.owep.service;

import com.kclm.owep.dto.LogTableDTO;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: SysLogService
 * @date 2023/9/4 19:24
 */
public interface SysLogService {

    List<LogTableDTO> getSysLogs(Integer offset, Integer limit);

    void deleteById(Integer id);

    List<LogTableDTO> search(String username, LocalDate start,LocalDate end);
}
