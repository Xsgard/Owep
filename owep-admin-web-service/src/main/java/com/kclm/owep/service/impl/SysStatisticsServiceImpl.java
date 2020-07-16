/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.service.impl;

import com.kclm.owep.dto.SysStatisticsDTO;
import com.kclm.owep.entity.SysStatistics;
import com.kclm.owep.mapper.SysStatisticsMapper;
import com.kclm.owep.service.SysStatisticsService;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/******************
 * @Author yejf
 * @Version v1.0
 * @Create 2020-07-13 18:46
 * @Description TODO
 */
@Service
public class SysStatisticsServiceImpl implements SysStatisticsService {

    @Autowired
    private SysStatisticsMapper statisticsMapper;

    @Autowired
    private MapperFactory mapperFactory;

    /*********************
     * 参数值只能来自于本接口中定义的6个常量之一或是它们的组合
     * @param type
     * @return
     */
    @Override
    public List<SysStatisticsDTO> groupByType(String type) {
        System.out.println("statisticsMapper = " + statisticsMapper);
        final List<SysStatistics> sysStatistics = statisticsMapper.groupByType(type);
        //把List<SysStatistics> 转换成 List<SysStatisticsDTO>
        MapperFacade mapperFacade = this.mapperFactory.getMapperFacade();
        final List<SysStatisticsDTO> sysStatisticsDTOS = mapperFacade.mapAsList(sysStatistics, SysStatisticsDTO.class);
        //返回
        return sysStatisticsDTOS;
    }
}
