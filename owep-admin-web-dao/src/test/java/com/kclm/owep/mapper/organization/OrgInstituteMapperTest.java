package com.kclm.owep.mapper.organization;

import com.kclm.owep.OwepAdminWebDaoApplication;
import com.kclm.owep.entity.OrgInstitute;
import com.kclm.owep.mapper.OrgInstituteMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/*******
 * @Author yangwr
 * @Version v1.0
 * @Create 2020/7/6 16:34
 * @Description 组织机构测试类
 */
@SpringBootTest(classes = OwepAdminWebDaoApplication.class)
public class OrgInstituteMapperTest {


    @Autowired
    private OrgInstituteMapper orgInstituteMapper;
    /***
     * 插入数据
     */
    @Test
    public void save() {
        OrgInstitute orgInstitute = new OrgInstitute();
        orgInstitute.setInstituteName("快程乐码");
        orgInstitute.setInstituteType(123);
        this.orgInstituteMapper.save(orgInstitute);
    }

    /***
     * 根据机构名称 机构类型查找数据
     */
    @Test
    void findByinstituteName() {
        OrgInstitute orgInstitute = new OrgInstitute();
        orgInstitute.setInstituteName("萍乡学院");
        orgInstitute.setInstituteType(1);
        this.orgInstituteMapper.findByinstituteNameAndType(orgInstitute);


    }

    /***
     * 更新数据
     */
    @Test
    public void update() {
        OrgInstitute orgInstitute = this.orgInstituteMapper.selectById(1);
        orgInstitute.setInstituteName("萍乡学院");
        orgInstitute.setInstituteType(2);
        this.orgInstituteMapper.update(orgInstitute);
    }

    /***
     * 根据id查找数据
     */
    @Test
    public void selectById() {
        OrgInstitute orgInstitute = this.orgInstituteMapper.selectById(2);
        System.out.println(orgInstitute);
    }

    /***
     * 根据id删除
     */
    @Test
    public void  deleteById(){

       this.orgInstituteMapper.deleteById(3);
    }
    @Test
    public void deleteSelect(){
        List<Serializable> asList = Arrays.asList( 6,7);
        this.orgInstituteMapper.deleteSelect(asList);
    }
 }