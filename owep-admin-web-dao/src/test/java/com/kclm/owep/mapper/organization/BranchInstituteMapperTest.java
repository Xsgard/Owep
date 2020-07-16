package com.kclm.owep.mapper.organization;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.BranchInstitute;
import com.kclm.owep.entity.OrgInstitute;
import com.kclm.owep.mapper.BranchInstituteMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
/*******
 * @Author yangwr
 * @Version v1.0
 * @Create 2020/7/6 16:34
 * @Description 分支机构测试类
 */
@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
class BranchInstituteMapperTest {
    @Autowired
    private BranchInstituteMapper branchInstituteMapper;

    /************
     * 插入数据
     */
    @Test
    public void save() {
        BranchInstitute branchInstitute = new BranchInstitute();
        branchInstitute.setBranchName("培训机构");
        OrgInstitute orgInstitute = new OrgInstitute();
        orgInstitute.setId(1);
        branchInstitute.setOrgInstitute(orgInstitute);
        this.branchInstituteMapper.save(branchInstitute);
    }

    /***
     * 根据分支名称和所属机构查查询
     */
    @Test
    void findByBranchNameAndInstitute() {
       BranchInstitute branchInstitute = new BranchInstitute();
       branchInstitute.setBranchName("学校");
       OrgInstitute orgInstitute = new OrgInstitute();
       orgInstitute.setId(1);
       branchInstitute.setOrgInstitute(orgInstitute);
       this.branchInstituteMapper.findByBranchNameAndinstitute(branchInstitute);

    }

    /***
     * 查询所有数据
     */
    @Test
    public void selectAll() {
        final List<BranchInstitute> All = this.branchInstituteMapper.selectAll();
        All.forEach(System.out::println);
    }

    /***
     * 更新数据
     */
    @Test
    public void update() {
        BranchInstitute branchInstitute = this.branchInstituteMapper.selectById(5);
        branchInstitute.setBranchName("学校");
        OrgInstitute orgInstitute = new OrgInstitute();
        orgInstitute.setId(1);
        branchInstitute.setOrgInstitute(orgInstitute);
        this.branchInstituteMapper.update(branchInstitute);
    }

    /***
     * 根据id来查询
     */
    @Test
    public void selectById() {
        BranchInstitute branchInstitute = this.branchInstituteMapper.selectById(2);
        System.out.println(branchInstitute);
    }

    /***
     * 根据id删除
     */
    @Test
    public void deleteByid(){
        this.branchInstituteMapper.deleteById(1);
    }

    /***
     * 多个删除
     */
    @Test
    public void deleteSelect(){
        List<Serializable> idList = Arrays.asList(1, 2, 3);
        branchInstituteMapper.deleteSelect(idList);

    }
}