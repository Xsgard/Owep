package com.kclm.owep.service;

import com.kclm.owep.dto.BranchTableDTO;
import com.kclm.owep.entity.BranchInstitute;
import com.kclm.owep.mapper.common.BaseMapper;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: BranchInstituteMapper
 * @date 2023/9/8 9:55
 */
public interface BranchInstituteService {

    List<BranchTableDTO> getBranchTable();
}
