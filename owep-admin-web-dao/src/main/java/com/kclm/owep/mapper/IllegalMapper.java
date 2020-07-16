/*********************
 * 2018-2021 版权所有 CopyRight（c） 快程乐码信息科技有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.Illegal;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/*********************
 * @Auther shentr
 * @Version V1.0
 * @Create 2020/7/6 18:20
 * @Description 违规处理持久层接口
 */
@Mapper
public interface IllegalMapper extends BaseMapper<Illegal> {
    /**
    *根据班级id查询违纪处理的数据
    */
    List<Illegal> selectByClassId(Serializable classId);

    /**
    * 条件查询
    */
    List<Illegal> selectByCondition(@Param("stuNumber") String stuNumber, @Param("stuName") String stuName,
                                    @Param("startTime") LocalDateTime startTime, @Param("endTime") LocalDateTime endTime);

}