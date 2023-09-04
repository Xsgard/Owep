package com.kclm.owep.service;

import com.kclm.owep.entity.DbCopy;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: DbCopyService
 * @date 2023/9/4 17:17
 */
public interface DbCopyService {
    List<DbCopy> getAllDbCody(Integer offset,Integer limit);
}
