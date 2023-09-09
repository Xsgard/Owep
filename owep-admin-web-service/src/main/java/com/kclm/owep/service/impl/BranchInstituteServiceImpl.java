package com.kclm.owep.service.impl;

import com.kclm.owep.convert.BranchTableConvert;
import com.kclm.owep.dto.BranchInstituteDTO;
import com.kclm.owep.dto.BranchTableDTO;
import com.kclm.owep.entity.BranchInstitute;
import com.kclm.owep.entity.OrgInstitute;
import com.kclm.owep.mapper.BranchInstituteMapper;
import com.kclm.owep.mapper.OrgInstituteMapper;
import com.kclm.owep.service.BranchInstituteService;
import com.kclm.owep.utils.exceptions.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Asgard
 * @version 1.0
 * @description: BranchInstituteMapperImpl
 * @date 2023/9/8 9:56
 */
@Service
public class BranchInstituteServiceImpl implements BranchInstituteService {

    @Autowired
    private BranchInstituteMapper branchInstituteMapper;
    @Autowired
    private OrgInstituteMapper orgInstituteMapper;

    @Autowired
    private BranchTableConvert branchTableConvert;

    /**
     * 获取分支分页信息
     *
     * @return 分支信息DTO集合
     */
    @Override
    public List<BranchTableDTO> getBranchTable() {
        //获取分支集合信息
        List<BranchInstitute> branchList = branchInstituteMapper.getBranchList();
        //处理集合信息 映射为DTO
        return branchList.stream().map(item -> {
            BranchTableDTO branchDTO = branchTableConvert.toBranchDTO(item);
            //查询组织机构名
            String orgName = orgInstituteMapper.getOrgNameById(item.getOrgInstitute().getId());
            branchDTO.setSubsidiaryOrgan(orgName);
            return branchDTO;
        }).collect(Collectors.toList());
    }

    /**
     * 添加分支信息
     *
     * @param dto 分支DTO信息
     */
    @Override
    public void addBranch(BranchTableDTO dto) {
        //查询到组织机构Id
        List<OrgInstitute> orgId = orgInstituteMapper.getOrgId(dto.getSubsidiaryOrgan());
        if (orgId.isEmpty())
            throw new BusinessException("未查询到该所属机构在本系统中注册！");
        //创建分支实体
        BranchInstitute branchInstitute = new BranchInstitute();
        //创建组织机构实体
        OrgInstitute orgInstitute = new OrgInstitute();
        //设置组织机构Id
        orgInstitute.setId(orgId.get(0).getId());
        //设置分支实体中的组织机构
        branchInstitute.setOrgInstitute(orgInstitute);
        branchInstitute.setBranchName(dto.getBranchName());
        int save = branchInstituteMapper.save(branchInstitute);
        if (save < 1)
            throw new BusinessException("添加失败！");
    }

    /**
     * 修改分支信息
     *
     * @param branchInstitute 分支信息
     */
    @Override
    public void editBranch(BranchInstitute branchInstitute) {
        int update = branchInstituteMapper.update(branchInstitute);
        if (update < 1)
            throw new BusinessException("修改失败！");
    }

    /**
     * 删除分支
     *
     * @param id 分支Id
     */
    @Override
    public void deleteBranch(Integer id) {
        int i = branchInstituteMapper.deleteById(id);
        if (i < 1)
            throw new BusinessException("删除失败！");
    }

    /**
     * 批量删除分支信息
     *
     * @param ids 需删除的分支Id
     */
    @Override
    public void deleteByIds(List<Serializable> ids) {
        int i = branchInstituteMapper.deleteSelect(ids);
        if (i < ids.size())
            throw new BusinessException("删除失败！");
    }
}
