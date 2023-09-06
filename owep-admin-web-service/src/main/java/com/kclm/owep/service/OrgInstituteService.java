package com.kclm.owep.service;

import com.kclm.owep.dto.OrgInstituteDTO;
import com.kclm.owep.entity.OrgInstitute;

import java.io.Serializable;
import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: orgInstituteService
 * @date 2023/9/6 11:31
 */
public interface OrgInstituteService {
    List<OrgInstituteDTO> getOrgInstituteTable();

    void editOrg(OrgInstituteDTO dto);

    void deleteOrg(Integer id);

    void deleteByIds(List<Serializable> ids);

    void addOrg(OrgInstitute dto);

    List<OrgInstituteDTO> queryList(OrgInstituteDTO dto);
}
