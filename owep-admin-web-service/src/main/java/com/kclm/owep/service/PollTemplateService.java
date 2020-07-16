/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.service;

import com.kclm.owep.dto.PollTemplateDTO;
import com.kclm.owep.entity.PollTemplate;

import java.io.Serializable;
import java.util.List;

/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/13 10:10
 *@Description:考评模板业务层接口
 ***/
public interface PollTemplateService {

    /***
     * 根据关键字查询考评模板
     * @param keyword
     * @return
     */
    PollTemplateDTO findByKeywords(String keyword);

    /***
     * 获取所有的考评模板
     * @return
     */
    PollTemplateDTO findAllPollTemplates();

    /***
     * 根据id获取考评模板信息
     * @param id
     * @return
     */
    PollTemplateDTO findById(Serializable id);

    /***
     * 添加考评模板
     * @param pollTemplate
     * @return
     */
    int addPollTemplate(PollTemplate pollTemplate);

    /***
     * 批量删除考评模板
     * @param idList
     * @return
     */
    int deleteSelectPollTemplate(List<Serializable> idList);

    /***
     * 修改考评模板
     * @param pollTemplate
     * @return
     */
    int updatePollTemplate(PollTemplate pollTemplate);

    /***
     * 根据id删除考评模板
     * @param id
     * @return
     */
    int deletePollTemplate(Serializable id);
}
