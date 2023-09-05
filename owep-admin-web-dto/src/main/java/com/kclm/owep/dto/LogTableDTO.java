package com.kclm.owep.dto;

import lombok.Data;

/**
 * @author Asgard
 * @version 1.0
 * @description: LogTableDTO
 * @date 2023/9/5 9:16
 */
@Data
public class LogTableDTO {
    private Integer id;

    private String logThime;

    private String ipAddress;

    private String requestAddress;

    private String requestType;

    private String userName;

    private String type;
}
