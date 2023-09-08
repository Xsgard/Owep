package com.kclm.owep.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Asgard
 * @version 1.0
 * @description: BranchTableDTO
 * @date 2023/9/8 9:23
 */
@Data
public class BranchTableDTO {
    private Integer id;

    private String branchName;

    private String subsidiaryOrgan;

    private LocalDateTime createTime;
}
