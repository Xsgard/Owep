/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */
package com.kclm.owep.dto;


import java.io.Serializable;
import java.time.LocalDateTime;

/************
 *@Author chenxin
 *@Version v1.0
 *@Create 2020/7/13 10:23
 *@Description 数据库备份DTO
 */
public class DbCopyDTO implements Serializable {

    private static final long serialVersionUTD = 1L;
    /**
     * 主键id值
     */
    private Integer id;
    /**
     *文件名
     */
    private String fileName;
    /**
     *备份的状态，1表示成功，0表示失败
     */
    private Boolean status;
    /**
     *备份时间
     */
    private LocalDateTime createTime=LocalDateTime.now();

}
