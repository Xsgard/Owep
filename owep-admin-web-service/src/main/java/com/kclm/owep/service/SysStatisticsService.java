/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.service;

import com.kclm.owep.dto.SysStatisticsDTO;

import java.util.List;

/******************
 * @Author yejf
 * @Version v1.0
 * @Create 2020-07-13 16:58
 * @Description 系统统计业务层接口
 */
public interface SysStatisticsService {

    String GROUP_BY_YEAR = "%Y";

    String GROUP_BY_MONTH = "%m";

    String GROUP_BY_DAY = "%d";

    String GROUP_BY_HOUR = "%H";

    String GROUP_BY_MINUTE = "%i";

    String GROUP_BY_SECOND = "%S";

    /*********
     * 按类型进行分组，主要有如下类型：
     * 年, 按年统计
     * 月， 按月统计
     * 日， 按日统计
     * 时， 按时统计
     * 分， 按分统计
     * @param type
     * @return
     */
    List<SysStatisticsDTO> groupByType(String type);
}
