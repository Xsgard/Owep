/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */
package com.kclm.owep.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/************
 *@Author chenxin
 *@Version v1.0
 *@Create 2020/7/13 11:36
 *@Description 资料配置DTO
 */
public class SystemConfigDTO implements Serializable {

    private static final long serialVersionUTD=1L;
    /**
     * 系统名称
      */
    private String systemName;
    /**
     *版权所属
     */
    private String copyName;
    /**
     *登录页LOGO
     */
    private String loginPageLogo;
    /**
     *系统页LOGO
     */
    private String systemLogo;
}
