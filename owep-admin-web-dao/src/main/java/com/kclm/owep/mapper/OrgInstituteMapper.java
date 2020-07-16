package com.kclm.owep.mapper;

import com.kclm.owep.entity.OrgInstitute;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*******
 * @Author yangwr
 * @Version v1.0
 * @Create 2020/7/6 16:34
 * @Description 组织机构mapper类
 */
@Mapper
public interface OrgInstituteMapper extends BaseMapper<OrgInstitute> {
    /***
     * 根据机构名称和机构类型进行查询
     * @param orgInstitute
     * @return
     */
    List<OrgInstitute> findByinstituteNameAndType(OrgInstitute orgInstitute);

}