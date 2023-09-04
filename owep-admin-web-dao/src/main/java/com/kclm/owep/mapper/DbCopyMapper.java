package com.kclm.owep.mapper;

import com.kclm.owep.entity.DbCopy;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: DbCopyMapper
 * @date 2023/9/4 17:16
 */
@Mapper
public interface DbCopyMapper extends BaseMapper<DbCopyMapper> {

    @Select("select * from t_db_copy ")
    List<DbCopy> getAllDbCopy();
}
