/*********************
 * 2018-2021 版权所有 CopyRight（c） 快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.Leave;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/*********************
 * @Auther shentr
 * @Version V1.0
 * @Create 2020/7/6 18:20
 * @Description 请假处理持久层接口
 */
@Mapper
public interface LeaveMapper extends BaseMapper<Leave> {

    /**
     *通过班级id查找请假处理的数据
     */
    List<Leave> selectByClassId(Serializable classId);

    /**
    * 请假审批
    */
    //int leaveApproveById(@Param("id") Integer id,@Param("approvalStatus") Integer approvalStatus);
}