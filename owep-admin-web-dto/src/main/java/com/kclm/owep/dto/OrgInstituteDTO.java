/*******
 * 2018-2021版权所有 CopyRight(c) 快程乐码信息有限公司 未经授权，不得随意使用！ 
 */
package com.kclm.owep.dto;


import java.time.LocalDateTime;

/*******
 * @Author yangwr
 * @Version v1.0
 * @Create 2020/7/13 10:17
 * @Description TODO
 */
public class OrgInstituteDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    /***
     * 机构列表id
     */
    private  Integer instituteId;
    /***
     * 机构名称
     */
    private String instituteName;
    /***
     * 机构名称
     */
    private Integer instituteType;

    /***
     * 是否逻辑删除 1表示未删除，0表示已删除
     */
    private Integer delete;
    /***
     * 创建时间
     */
    private LocalDateTime createTime;

    /***
     * 构造方法
     * @return
     */
    public Integer getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Integer instituteId) {
        this.instituteId = instituteId;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public Integer getInstituteType() {
        return instituteType;
    }

    public void setInstituteType(Integer instituteType) {
        this.instituteType = instituteType;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
