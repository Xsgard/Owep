package com.kclm.owep.convert;

import com.kclm.owep.dto.BranchTableDTO;
import com.kclm.owep.entity.BranchInstitute;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author Asgard
 * @version 1.0
 * @description: BranchTableConvert
 * @date 2023/9/8 11:17
 */
@Mapper(componentModel = "spring")
public interface BranchTableConvert {

    BranchTableDTO toBranchDTO(BranchInstitute branchInstitute);
}
