package com.kclm.owep.utils.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.system.ApplicationHome;

import java.io.File;

/**
 * @author Asgard
 * @version 1.0
 * @description: DbCopy
 * @date 2023/9/4 18:15
 */
@Slf4j
public class DbCopy {
    public String backupSql() {
        ApplicationHome applicationHome = new ApplicationHome(getClass());//获取架包所在目录
        File file = applicationHome.getSource();
        String dirPath = file.getParentFile().toString() + "/sql/";
        log.debug("在jar包所在目录下生成一个sql文件夹用来存储备份SQL ---> dirPath = " + dirPath);
        File path = new File(dirPath);
        File filePath = new File(dirPath, "t_db_copy.sql");
        try {
            if (!filePath.exists()) {
                filePath.createNewFile();
            }
            /*InetAddress localhost = InetAddress.getLocalHost();
            String ipAddress = localhost.getHostAddress();
            log.debug("本机的IP地址时:" + ipAddress);*/
            // 构建命令行字符串, 以 cmd 开头表示在cmd进程中执行后面的mysqldump指定，\c 表示执行完成关闭窗口
            String command = "cmd \\c mysqldump -hlocalhost -uroot -p123456 dev_base_v1 t_db_copy > t_db_copy.sql";
            log.debug("command的语句:" + command);
            // 执行命令行
            log.debug("path = " + path);
            Process process = Runtime.getRuntime().exec(command, null, path);

            // 等待命令行执行完成
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("命令行执行成功");
                return "备份成功";
            } else {
                System.out.println("命令行执行失败");
                return "备份失败";
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
