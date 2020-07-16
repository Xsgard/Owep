/*********************
 * 2018-2021 版权所有 CopyRight（c） 快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.Evaluate;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/*********************
 * @Auther shentr
 * @Version V1.0
 * @Create 2020/7/6 18:20
 * @Description 学员评价持久层接口
 */
@Mapper
public interface EvaluateMapper extends BaseMapper<Evaluate> {

    /**
    *通过班级id查找学生评价的数据
    */
    List<Evaluate> selectByClassId(Serializable classId);

}