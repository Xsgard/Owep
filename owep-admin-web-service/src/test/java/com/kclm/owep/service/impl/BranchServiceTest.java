package com.kclm.owep.service.impl;

import com.kclm.owep.dto.BranchTableDTO;
import com.kclm.owep.entity.BranchInstitute;
import com.kclm.owep.service.BaseServiceTests;
import com.kclm.owep.service.BranchInstituteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.AssertTrue;
import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: BranchServiceTest
 * @date 2023/9/8 9:58
 */
public class BranchServiceTest extends BaseServiceTests {

    @Autowired
    BranchInstituteService branchInstituteService;

    @Test
    public void getBranchTableTest() {
        List<BranchTableDTO> branchTable = branchInstituteService.getBranchTable();
        branchTable.forEach(System.out::println);
    }
}
