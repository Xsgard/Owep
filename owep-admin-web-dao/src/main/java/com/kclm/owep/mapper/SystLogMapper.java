package com.kclm.owep.mapper;

import com.kclm.owep.entity.SystLog;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

/************
 *@Author chenxin
 *@Version v1.0
 *@Create 2020/7/616:53
 *@Description 系统日志接口
 */
@Mapper
public interface SystLogMapper extends BaseMapper<SystLog> {

    /*********
     * 根据时间或用户名查找日志记录
     * @param login_user_name
     * @param start
     * @param end
     * @return
     */
    List<SystLog> findByTime(@Param("login_user_name") String login_user_name,
                             @Param("start")LocalDateTime start,
                             @Param("end")LocalDateTime end);



}