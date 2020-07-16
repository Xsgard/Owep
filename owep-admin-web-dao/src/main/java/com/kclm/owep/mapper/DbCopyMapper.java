package com.kclm.owep.mapper;

import com.kclm.owep.entity.DbCopy;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/************
 *@Author chenxin
 *@Version v1.0
 *@Create 2020/7/616:53
 *@Description 数据库备份接口
 */
@Mapper
public interface DbCopyMapper extends BaseMapper<DbCopy> {


    /***********
     * 根据时间范围查找
     * @param start
     * @param end
     * @return
     */
    List<DbCopy> findByTime(@Param("start") LocalDateTime start,@Param("end") LocalDateTime end);


}