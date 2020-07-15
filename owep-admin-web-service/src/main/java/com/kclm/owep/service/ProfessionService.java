/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.service;

import com.kclm.owep.dto.ProfessionDTO;
import com.kclm.owep.entity.Profession;
import java.io.Serializable;
import java.util.List;

/*****************
 *
 * @author tanj
 * @date 2020/7/13 10:17
 * @version v1.0
 * @description 专业
 *
 */
public interface ProfessionService {

    /***
     * 保存一条记录
     * @param entity
     * @return
     */
    int save(Profession entity);

    /***
     * 更新一条记录
     * @param entity
     * @return
     */
    int update(Profession entity);

    /***
     * 根据id来删除一条记录
     * @param id
     * @return
     */
    int deleteById(Serializable id);

    /***
     * 删除多条记录
     * @param idList
     * @return
     */
    int deleteSelect(List<Serializable> idList);

    /***
     * 查询一条记录
     * @param id
     * @return
     */
    ProfessionDTO selectById(Serializable id);

    /***
     * 查询所有的记录
     * @return
     */
    List<ProfessionDTO> selectAll();

    /***
     * 根据专业名称来查询
     * @return
     */
    List<ProfessionDTO> selectByProName(String proName);

    /***
     * 根据分支类查询
     * @return
     */
    List<ProfessionDTO> selectByBranchName(String branName);
}
