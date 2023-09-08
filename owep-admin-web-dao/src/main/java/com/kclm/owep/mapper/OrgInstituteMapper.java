package com.kclm.owep.mapper;

import com.kclm.owep.entity.OrgInstitute;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.io.Serializable;
import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: OrgInstituteMapper.xml
 * @date 2023/9/1 17:40
 */
@Mapper
public interface OrgInstituteMapper extends BaseMapper<OrgInstitute> {
    @Select("select * from t_org_institute where is_delete=1;")
    List<OrgInstitute> getAllOrgInstitute();

    @Select("select institute_name from t_org_institute where id=#{id};")
    String getOrgNameById(Integer id);

    @Select("select id,institute_name,institute_type,create_time from t_org_institute where is_delete=1;")
    List<OrgInstitute> getOrgInstituteTable();

    @Update("update t_org_institute set institute_name = #{orgName},institute_type=#{orgType}  where id=#{id} ;")
    int updateOrg(@Param("id") Integer id, @Param("orgName") String orgName, @Param("orgType") Integer orgType);

    @Update("update t_org_institute set is_delete = 0 where id=#{id};")
    int deleteOrg(Serializable id);

    @Select("select * from t_org_institute where institute_name=#{instituteName} " +
            "and institute_type=#{instituteType};")
    List<OrgInstitute> queryOrgList(String instituteName,Integer instituteType);
}
