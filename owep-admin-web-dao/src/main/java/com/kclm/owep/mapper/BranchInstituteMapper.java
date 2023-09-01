package com.kclm.owep.mapper;

import com.kclm.owep.entity.BranchInstitute;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: BranchInstituteMapper
 * @date 2023/9/1 17:41
 */
@Mapper
public interface BranchInstituteMapper extends BaseMapper<BranchInstitute> {

    @Select("select * from t_branch_institute where fk_org_id=#{orgId};")
    List<BranchInstitute> getByOrgId(Integer orgId);
}
