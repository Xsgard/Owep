package com.kclm.owep.service.impl;

import com.kclm.owep.convert.BranchTableConvert;
import com.kclm.owep.dto.BranchTableDTO;
import com.kclm.owep.entity.BranchInstitute;
import com.kclm.owep.mapper.BranchInstituteMapper;
import com.kclm.owep.mapper.OrgInstituteMapper;
import com.kclm.owep.service.BranchInstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
