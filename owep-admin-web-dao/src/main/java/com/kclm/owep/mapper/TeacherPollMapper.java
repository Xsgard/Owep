package com.kclm.owep.mapper;

import com.kclm.owep.entity.TeacherPoll;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/*******************
 *Author:ZhongLei
 *version:V1.0
 *@Create: 2020/7/6 14:07
 *@Description:教师考评持久层接口
 ***/

@Mapper
public interface TeacherPollMapper extends BaseMapper<TeacherPoll> {

    /***
     * 统计教师考评记录数量
     * @return
     */
    int countTeacherPoll();


}