/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.service;

import com.kclm.owep.dto.TeacherPollDTO;
import com.kclm.owep.entity.TeacherPoll;

import java.io.Serializable;
import java.util.List;

/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/13 10:51
 *@Description: 教师考评业务层接口
 ***/
public interface TeacherPollService {

    /***
     * 多条件查询
     * @param className
     * @param profName
     * @param teacherName
     * @return
     */
    List<TeacherPollDTO> findByCondition(String className,String profName,String teacherName,int page,int pageSize);

    /***
     * 获取所有的教师考评记录
     * @param page
     * @param pageSize
     * @return
     */
    List<TeacherPollDTO> findAllTeacherPoll(int page,int pageSize);

    /***
     * 根据id获取教师考评记录
     * @param id
     * @return
     */
    TeacherPollDTO findById(Serializable id);

    /***
     * 修改教师考评记录
     * @param teacherPoll
     * @return
     */
    int update(TeacherPoll teacherPoll);

    /***
     * 批量删除教师考评记录
     * @param idList
     * @return
     */
    int deleteSelectTeacherPoll(List<Serializable> idList);

    /***
     * 根据id删除教师考评记录
     * @param id
     * @return
     */
    int deleteTeacherPoll(Serializable id);

    /***
     * 添加教师考评
     * @param teacherPoll
     * @return
     */
    int addTeacherPoll(TeacherPoll teacherPoll);
}
