/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.mapper;

import com.kclm.owep.entity.PollTemplate;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/6 14:07
 *@Description:考评模板持久层接口
 ***/

@Mapper
public interface PollTemplateMapper extends BaseMapper<PollTemplate> {

    /***
     * 统计考评模板数量
     * @return
     */
    int countPollTemplate();

    /***
     * 通过关键字查找考评模板
     * @param keyword
     * @return
     */
    List<PollTemplate> findByKeywords(@Param("keyword") String keyword);

    /***
     * 向t_template_item插入数据
     * @param pollId
     * @param templateId
     * @return
     */
    int saveTemplateItem(@Param("pid") Serializable pollId,@Param("tid") Serializable templateId);

    /***
     * t_template_item删除数据
     * @param pollId
     * @param templateId
     */
    int deleteTemplateItem(@Param("pid") Serializable pollId,@Param("tid") Serializable templateId);

    @Override
    PollTemplate selectById(@Param("id") Serializable id);
}