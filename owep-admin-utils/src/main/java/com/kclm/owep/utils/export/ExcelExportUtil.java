package com.kclm.owep.utils.export;

import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.boot.system.ApplicationHome;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: excel数据导出工具类
 * @date 2023/8/23 15:31
 */
@Slf4j
public class ExcelExportUtil {
    private ExcelExportUtil() {
    }

    /**
     * 通过流在网页传输
     */
    public static void exportAdminList(Workbook workbook, HttpServletResponse response) throws IOException {
        ServletOutputStream out = response.getOutputStream();
        String fileName = URLEncoder.encode("管理员信息记录", "UTF-8");
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xlsx");

        workbook.write(out);
        out.flush();
        out.close();
    }

}
