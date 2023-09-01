package com.kclm.owep.mapper;

import com.kclm.owep.entity.OrgInstitute;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: OrgInstituteMapper
 * @date 2023/9/1 17:40
 */
@Mapper
public interface OrgInstituteMapper extends BaseMapper<OrgInstitute> {
    @Select("select * from t_org_institute where is_delete=1;")
    List<OrgInstitute> getAllOrgInstitute();
}
