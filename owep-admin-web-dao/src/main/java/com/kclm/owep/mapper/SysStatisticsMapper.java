/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.mapper;

import com.kclm.owep.entity.SysStatistics;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/******************
 * @Author yejf
 * @Version v1.0
 * @Create 2020-07-07 23:23
 * @Description 系统数据 统计操作的接口
 */
@Mapper
public interface SysStatisticsMapper extends BaseMapper<SysStatistics> {

    /*********************
     * 按照时间类型进行分组统计，可以按年、月、日、时、分、秒进行统计
     * @param type
     * @return
     */
    List<SysStatistics> groupByType(@Param("time_type") String type);

}
