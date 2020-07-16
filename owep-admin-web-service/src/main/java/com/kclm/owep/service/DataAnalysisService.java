/******************
 * 2018-2020 版权所有 Copyright(c)  快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */

package com.kclm.owep.service;

import com.kclm.owep.entity.Student;
import com.kclm.owep.entity.StudentReport;
import com.kclm.owep.entity.VideoWatchRecord;

import java.io.Serializable;
import java.util.List;

/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/13 11:29
 *@Description:数据分析模块业务层接口
 ***/
public interface DataAnalysisService {

    /***
     * 获取所有的班级
     * @return
     */
    List<Class> findAllClass();

    /***
     * 通过class_id获取一个班级中所有的学生
     * @return
     */
    List<Student> findAllStudent(Serializable classId);

    /***
     * 根据学员id查询出学员学习报告
     * @param studentId
     * @return
     */
    StudentReport findStudentReport(Serializable studentId);

    /***
     * 通过搜索框条件查询出相应的班级
     * @return
     */
    List<Class> findByConfition();

    /***
     * 通过id获取相应班级的信息
     * @param id
     * @return
     */
    Class findById(Serializable id);

    /***
     * 通过关键字查找相应的学员观看记录
     * @param keyword
     * @return
     */
    VideoWatchRecord findByKeywords(String keyword);

    /***
     * 查询所有的学员观看记录
     * @return
     */
    VideoWatchRecord findAllVideoWatchRecord();
}
