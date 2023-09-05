package com.kclm.owep.web.controller;

import com.kclm.owep.entity.DbCopy;
import com.kclm.owep.entity.SystemConfig;
import com.kclm.owep.service.DbCopyService;
import com.kclm.owep.service.SystemConfigService;
import com.kclm.owep.utils.util.R;
import com.kclm.owep.utils.util.UploadImg;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: SystemController
 * @date 2023/8/30 16:12
 */
@Slf4j
@Controller
@RequestMapping("/system")
public class SystemController {
    private static final String UPLOAD_IMAGES_MEMBER_IMG = "/upload/images/";

    @Autowired
    private SystemConfigService systemConfigService;
    @Autowired
    private DbCopyService dbCopyService;


    @GetMapping("/paraminfo")
    public String toParamInfoPage() {
        return "system/paramInfo";
    }

    @GetMapping("/config")
    public String toConfigPage() {
        return "system/config";
    }

    @GetMapping("/backup")
    public String toBackUpPage() {
        return "system/backup";
    }

    @GetMapping("/getConfigInfo")
    @ResponseBody
    public R getSystemConfig() {
        SystemConfig info = systemConfigService.getServiceConfigInfo();
        return R.ok().put("data", info);
    }

    @PostMapping("/img.do")
    @ResponseBody
    public R saveLoginLogo(@RequestPart("imageSource") MultipartFile file) {
        if (!file.isEmpty()) {
            log.debug("\n==>文件上传...");
            String fileName = UploadImg.uploadImg(file, UPLOAD_IMAGES_MEMBER_IMG);
            if (fileName == null) {
                return R.error("头像上传失败");
            }
            if (StringUtils.isNotBlank(fileName)) {

            } else {
                return R.error("头像上传失败");
            }
        }
        return R.error("头像未上传");
    }

    @GetMapping("/dbCopy/copyRecord")
    @ResponseBody
    public R getAllDbCopyRecord(Integer offset, Integer limit) {
        List<DbCopy> allDbCody = dbCopyService.getAllDbCody(offset, limit);
        return R.ok().put("data", allDbCody);
    }
}
