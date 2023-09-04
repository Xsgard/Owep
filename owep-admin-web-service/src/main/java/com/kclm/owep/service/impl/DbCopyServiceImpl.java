package com.kclm.owep.service.impl;

import com.github.pagehelper.PageHelper;
import com.kclm.owep.entity.DbCopy;
import com.kclm.owep.mapper.DbCopyMapper;
import com.kclm.owep.service.DbCopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: DbCopyServiceImpl
 * @date 2023/9/4 17:20
 */
@Service
public class DbCopyServiceImpl implements DbCopyService {
    @Autowired
    private DbCopyMapper dbCopyMapper;

    @Override
    public List<DbCopy> getAllDbCody(Integer offset, Integer limit) {
        PageHelper.offsetPage(offset, limit);
        return dbCopyMapper.getAllDbCopy();
    }
}
