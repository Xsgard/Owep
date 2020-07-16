/*******
 * 2018-2021版权所有 CopyRight(c) 快程乐码信息有限公司 未经授权，不得随意使用！ 
 */
package com.kclm.owep.service;

import com.kclm.owep.dto.BranchInstituteDTO;
import com.kclm.owep.entity.BranchInstitute;

import java.io.Serializable;
import java.util.List;

/*******
 * @Author yangwr
 * @Version v1.0
 * @Create 2020/7/13 17:42
 * @Description TODO
 */
public interface BranchInstituteService {

    /***
     * 查询所有分支
     * @return
     */
    List<BranchInstituteDTO> findAllBranch();

    /***
     * 根据分支名称和所属机构来查询
     * @param instituteName
     * @param orgInstitute
     * @return
     */
    List<BranchInstituteDTO> findBranchInstituteByNameAndInstitute(String instituteName, String orgInstitute);

    /***
     * 添加分支机构
     * @param branchInstitute
     * @return
     */
    int addBranchInstitute(BranchInstitute branchInstitute);

    /***
     * 根据选择的id删除资源
     * @param branchIds
     * @return
     */
    int deleteSelectBranchInstitute(List<Serializable> branchIds);

    /***
     * 修改分支机构
     * @param branchInstitute
     * @return
     */
    int updateBranchInst(BranchInstitute branchInstitute);

    /***
     * 根据分支名称删除资源
     * @param instituteName
     * @return
     */
    int deleteBranchInstituteByName(Serializable instituteName);
}
