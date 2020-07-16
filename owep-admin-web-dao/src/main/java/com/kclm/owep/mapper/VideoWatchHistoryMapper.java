/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper;

import com.kclm.owep.entity.VideoWatchHistory;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/6 14:07
 *@Description:视频观看历史持久层接口
 ***/

@Mapper
public interface VideoWatchHistoryMapper extends BaseMapper<VideoWatchHistory> {

    /***
     * 统计视频观看历史数量
     * @return
     */
    int countVideoWatchHistory();

}