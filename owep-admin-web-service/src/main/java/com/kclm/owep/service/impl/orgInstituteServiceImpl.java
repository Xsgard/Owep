package com.kclm.owep.service.impl;

import com.kclm.owep.convert.OrgInstituteConvert;
import com.kclm.owep.dto.OrgInstituteDTO;
import com.kclm.owep.entity.OrgInstitute;
import com.kclm.owep.mapper.OrgInstituteMapper;
import com.kclm.owep.service.OrgInstituteService;
import com.kclm.owep.utils.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Asgard
 * @version 1.0
 * @description: orgInstituteServiceImpl
 * @date 2023/9/6 11:33
 */
@Service
public class orgInstituteServiceImpl implements OrgInstituteService {

    @Autowired
    private OrgInstituteMapper orgInstituteMapper;

    /**
     * 获取组织机构信息
     *
     * @return 组织机构Dto信息集合
     */
    @Override
    public List<OrgInstituteDTO> getOrgInstituteTable() {
        List<OrgInstitute> orgInstituteTable = orgInstituteMapper.getOrgInstituteTable();
        return orgInstituteTable.stream()
                .map(OrgInstituteConvert.INSTANCE::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void editOrg(OrgInstituteDTO dto) {
        int i = orgInstituteMapper.updateOrg(dto.getInstituteId(), dto.getInstituteName(), dto.getInstituteType());
        if (i < 1)
            throw new BusinessException("修改失败！");
    }

    @Override
    public void deleteOrg(Integer id) {
        int i = orgInstituteMapper.deleteOrg(id);
        if (i < 1)
            throw new BusinessException("删除失败！");
    }

    @Override
    @Transactional
    public void deleteByIds(List<Serializable> ids) {
        int i = orgInstituteMapper.deleteSelect(ids);
        if (i < ids.size())
            throw new BusinessException("删除失败！");
    }

    @Override
    public void addOrg(OrgInstitute orgInstitute) {
        orgInstitute.setIsDelete(1);

        int save = orgInstituteMapper.save(orgInstitute);
        if (save < 1)
            throw new BusinessException("新增失败！");
    }

    @Override
    public List<OrgInstituteDTO> queryList(OrgInstituteDTO dto) {
        List<OrgInstitute> orgInstitutes = orgInstituteMapper.queryOrgList(dto.getInstituteName(), dto.getInstituteType());
        return orgInstitutes.stream()
                .map(OrgInstituteConvert.INSTANCE::entityToDTO)
                .collect(Collectors.toList());

    }
}
