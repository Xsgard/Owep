/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */
package com.kclm.owep.service;

import com.kclm.owep.entity.SystLog;

import java.time.LocalDateTime;
import java.util.List;

/************
 *@Author chenxin
 *@Version v1.0
 *@Create 2020/7/13 19:16
 *@Description 系统日志DTO
 */
public interface SystLogService {

    /**
     * 查询所有记录
     * @return
     */
    List<SystLog> findAll();

    /**
     * 根据用户名和时间查询记录
     * @param username
     * @param start
     * @param end
     * @return
     */
    List<SystLog> findByTime(String username,
                             LocalDateTime start,
                             LocalDateTime end);


}
