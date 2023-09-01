package com.kclm.owep.mapper;

import com.kclm.owep.entity.Profession;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: ProfessionMapper
 * @date 2023/9/1 13:37
 */
@Mapper
public interface ProfessionMapper extends BaseMapper<Profession> {
    @Select("select id,prof_name,institute_name from t_profession where is_delete=1 " +
            "and prof_status=1 and institute_name=#{instituteName} and institute_branch_name=#{branchName} ;")
    List<Profession> getProfessionByInstName(@Param("instituteName") String instituteName,@Param("branchName") String branchName);
}
