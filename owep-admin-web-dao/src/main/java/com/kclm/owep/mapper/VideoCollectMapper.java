/*******************
 *版权所有 CopyRight(c) 快程乐码信息科技有限公司所有，未经授权，不得复制转发
 *
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.VideoCollect;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/*********************
 * @Author: ZhongLei
 * @Version : v1.0
 * @Create: 2020年7月08日
 * @Description 视频收藏
 */

@Mapper
public interface VideoCollectMapper extends BaseMapper<VideoCollect> {

    /***
     * 统计视频收藏的数量
     * @return
     */
    int countVideoCollect();

}