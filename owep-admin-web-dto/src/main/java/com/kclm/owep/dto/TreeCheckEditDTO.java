package com.kclm.owep.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: TreeCheckEditDTO 用于接收修改用户组的参数
 * @date 2023/9/5 17:40
 */
@Data
public class TreeCheckEditDTO {
    private Integer userId;

    private List<Integer> groupIds;
}
