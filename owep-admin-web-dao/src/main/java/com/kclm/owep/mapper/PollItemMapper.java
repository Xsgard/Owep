/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper;

import com.kclm.owep.entity.PollItem;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/6 14:07
 *@Description:考评选项持久层接口
 ***/

@Mapper
public interface PollItemMapper extends BaseMapper<PollItem> {

    /***
     * 通过关键字查找考评选项
     * @param keyword
     * @return
     */
    List<PollItem> findByKeywords(@Param("keyword") String keyword);

    /***
     * 统计考评选项数量
     * @return
     */
    int countPollItem();

    

}
