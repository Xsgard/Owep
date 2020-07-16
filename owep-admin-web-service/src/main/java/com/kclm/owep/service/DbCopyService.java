/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */
package com.kclm.owep.service;

import com.kclm.owep.entity.DbCopy;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/************
 *@Author chenxin
 *@Version v1.0
 *@Create 2020/7/13 17:44
 *@Description 数据库备份接口
 */
public interface DbCopyService {
    /**
     * 查询所有记录
     * @return
     */
    List<DbCopy> findAll();

    /**
     * 根据开始时间和结束时间查询
     * @param start
     * @param end
     * @return
     */
    List<DbCopy> findByTime(LocalDateTime start,LocalDateTime end);

    /**
     * 根据id删除
    * @param id
     * @return
     */
    int deleteById(Serializable id);

    /**
     * 下载选中的记录值
     * @param id
     * @return
     */
    int downloadById(Serializable id);

    /**
     * 删除选中的列
     * @param idList
     * @return
     */
    int deleteSelect(List<Serializable> idList);

    /**
     * 备份数据库
     * @return
     */
    int backup();


}
