package com.kclm.owep.entity;

import lombok.Data;

/**
 * @author Asgard
 * @version 1.0
 * @description: Parameter 服务器参数实体
 * @date 2023/9/6 9:37
 */
@Data
public class Parameter {
    //操作名+系统版本号
    private String osName = System.getProperty("os.name");
    //
    private String javaVersion = System.getProperty("java.version");

}
