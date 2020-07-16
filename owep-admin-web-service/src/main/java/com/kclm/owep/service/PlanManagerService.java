/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.service;

import com.kclm.owep.entity.PlanManager;
import com.kclm.owep.entity.PlanManagerCourse;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/13 9:17
 *@Description 方案业务接口
 *
 */
public interface PlanManagerService {

    /**
     * 查询所有的方案
     */
    List<PlanManager> findAllPlanManager();

    /**
     * 通过方案名称或编号查询方案
     */
    List<PlanManager> findPlanManagerByField(PlanManager planManager);

    /**
     * 修改方案
     */
    int alterPlanManager(PlanManager planManager);

    /**
     * 通过ids 删除多个方案
     */
    int deletePlanManagerByIds(List<Serializable> ids);

    /**
     * 通过id 删除单个方案
     */
    int deletePlanManagerById(Serializable id);

    /**
     * 对方案添加课程
     */
    int addPlanManagerCourse(PlanManagerCourse planManagerCourse);

    /**
     * 删除方案中的课程
     */
    int deltePlanManagerCourseById(Serializable id);

    /**
     * 对方案中的课程排序 上移 下移
     */
    int shiftCellsUpOrDown(Serializable upId, Serializable downId);

    /**
     * 通过方案id,查询方案中的所有课程
     */
    List<PlanManagerCourse> findAllPlanManagerCourse(Serializable id);



}
