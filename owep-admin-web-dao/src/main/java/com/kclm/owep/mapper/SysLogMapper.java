package com.kclm.owep.mapper;

import com.kclm.owep.entity.SystLog;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: SysLogMapper
 * @date 2023/9/4 19:02
 */
@Mapper
public interface SysLogMapper extends BaseMapper<SystLog> {
    @Select("select * from t_syslog ")
    List<SystLog> getAllStsLogs();

    @Delete("delete from t_syslog where id=#{id};")
    int deleteById(Integer id);

    @Select("select * from t_syslog where login_user_name=#{username} and" +
            " (create_time between #{start} and #{end})")
    List<SystLog> search(String username, LocalDate start, LocalDate end);
}
