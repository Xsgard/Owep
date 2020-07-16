/*******
 * 2018-2021版权所有 CopyRight(c) 快程乐码信息有限公司 未经授权，不得随意使用！ 
 */
package com.kclm.owep.service;

import com.kclm.owep.dto.OrgInstituteDTO;
import com.kclm.owep.entity.OrgInstitute;

import java.io.Serializable;
import java.util.List;

/*******
 * @Author yangwr
 * @Version v1.0
 * @Create 2020/7/13 17:26
 * @Description TODO
 */
public interface OrgInstituteService {

    /**
     * 查询所有机构
     *
     * @return
     */
    List<OrgInstituteDTO> findAllinstitute();

    /***
     * 根据机构名称和机构类型来查询
     * @param instituteName
     * @return
     */
    List<OrgInstituteDTO> findOrgInstituteByNameAndType(String instituteName, String instituteType);

    /***
     * 添加机构列表
     * @param orgInstitute
     * @return
     */
    int addOrgInstitute(OrgInstitute orgInstitute);

    /***
     * 根据选择的id删除资源
     * @param instituteIds
     * @return
     */
    int deleteSelectOrgInstitute(List<Serializable> instituteIds);

    /***
     * 修改机构列表
     * @param orgInstitute
     * @return
     */
    int updateOrgInstitute(OrgInstitute orgInstitute);

    /***
     * 根据机构名称删除资源
     * @param instituteName
     * @return
     */
    int deleteOrgInstituteByName(Serializable instituteName);


}
