package com.kclm.owep.web.controller;

import com.kclm.owep.dto.BranchTableDTO;
import com.kclm.owep.dto.OrgInstituteDTO;
import com.kclm.owep.entity.OrgInstitute;
import com.kclm.owep.service.BranchInstituteService;
import com.kclm.owep.service.OrgInstituteService;
import com.kclm.owep.utils.exceptions.BusinessException;
import com.kclm.owep.utils.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: OrganizationController
 * @date 2023/8/30 16:13
 */
@Slf4j
@Controller
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    private OrgInstituteService orgInstituteService;
    @Autowired
    private BranchInstituteService branchInstituteService;

    @GetMapping("/orgList")
    public String toOrgListPage() {
        return "organization/orgList";
    }

    @GetMapping("/branchList")
    public String toBranchListPage() {
        return "organization/branchList";
    }

    @GetMapping("/branchTable")
    @ResponseBody
    public R getBranchTable() {
        List<BranchTableDTO> branchTable = branchInstituteService.getBranchTable();
        return R.ok().put("data", branchTable);
    }

    //机构-获取机构列表信息
    @GetMapping("/orgTable")
    @ResponseBody
    public R getOrgTable() {
        List<OrgInstituteDTO> orgInstituteTable = orgInstituteService.getOrgInstituteTable();
        return R.ok().put("data", orgInstituteTable);
    }

    //机构-修改机构信息
    @PostMapping("/edit")
    @ResponseBody
    public R editOrg(@RequestBody OrgInstituteDTO dto) {
        try {
            orgInstituteService.editOrg(dto);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("修改成功！");
    }

    //机构-删除
    @GetMapping("/delete")
    @ResponseBody
    public R deleteOrg(Integer id) {
        try {
            orgInstituteService.deleteOrg(id);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("删除成功！");
    }

    //机构-批量删除
    @PostMapping("/deleteByIds")
    @ResponseBody
    public R deleteOrgByIds(List<Serializable> ids) {
        try {
            orgInstituteService.deleteByIds(ids);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("删除成功！");
    }

    //机构-查询
    @PostMapping("/query")
    @ResponseBody
    public R query(@RequestBody OrgInstituteDTO dto) {
        List<OrgInstituteDTO> orgInstituteDTO = orgInstituteService.queryList(dto);
        return R.ok().put("data", orgInstituteDTO);
    }

    //机构-添加
    @PostMapping("/addOrgInstitute")
    @ResponseBody
    public R addOrg(@RequestBody OrgInstitute orgInstitute) {
        try {
            orgInstituteService.addOrg(orgInstitute);
        } catch (BusinessException e) {
            return R.error(e.getMessage());
        }
        return R.ok("新增成功！");
    }
}
