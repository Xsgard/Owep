/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */
package com.kclm.owep.service;

import com.kclm.owep.entity.SystemConfig;

import java.util.List;

/************
 *@Author chenxin
 *@Version v1.0
 *@Create 2020/7/13 16:19
 *@Description 配置资料业务层接口
 */
public interface SystemConfigService {
    /**
     * 查询基本信息
     * @return
     */
    List<SystemConfig> findAll();

    /**
     * 保存基本信息
     * @return
     */
    int save();




}
