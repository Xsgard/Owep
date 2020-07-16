/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.service;

import com.kclm.owep.dto.ResultSummaryDTO;

import java.time.LocalDate;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/13 13:59
 *@Description TODO
 *
 */
public interface DataReportService {
    ResultSummaryDTO getResultsSummary(LocalDate localDate);
}
