package com.kclm.owep.mapper;

import com.kclm.owep.entity.BranchInstitute;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*******
 * @Author yangwr
 * @Version v1.0
 * @Create 2020/7/6 16:34
 * @Description 分支机构mapper类
 */
@Mapper
public interface BranchInstituteMapper extends BaseMapper<BranchInstitute> {

    /*
     * 根据分支名称进行查询
     * */
    List<BranchInstitute> findByBranchName( String branchName);
}