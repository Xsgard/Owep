package com.kclm.owep.entity;

import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/*******
 * @Author yangwr
 * @Version v1.0
 * @Create 2020/7/6 16:34
 * @Description 组织机构实体类
 */
@Getter
public class OrgInstitute implements Serializable {

    private static final long serialVersionUID = 1L;

    /***
     * 组织机构id
     * -- GETTER --
     *  构造方法

     */
    private Integer id;
    /***
     * 机构名称
     */
    private String instituteName;
    /***
     *机构类型 1表示学校机构，2 表示培训机构
     */
    private Integer instituteType;
    /***
     *是否逻辑删除，1表示未删除，0表示已删除
     */
    private Integer isDelete;

    /***
     * 从分支机构中获取数据
     */
    private List<BranchInstitute> branchInstitutes;
    /***
     *版本
     */
    private Integer version = 1;
    /***
     *创建时间
     */
    private LocalDateTime createTime =LocalDateTime.now();
    /***
     *最后访问时间
     */
    private LocalDateTime lastAccessTime = LocalDateTime.now();

    public OrgInstitute() {
    }

    public OrgInstitute(Integer id, String instituteName, Integer instituteType, Integer isDelete, List<BranchInstitute> branchInstitutes, Integer version, LocalDateTime createTime, LocalDateTime lastAccessTime) {
        this.id = id;
        this.instituteName = instituteName;
        this.instituteType = instituteType;
        this.isDelete = isDelete;
        this.branchInstitutes = branchInstitutes;
        this.version = version;
        this.createTime = createTime;
        this.lastAccessTime = lastAccessTime;
    }

    @Override
    public String toString() {
        return "OrgInstitute{" +
                "id=" + id +
                ", instituteName='" + instituteName + '\'' +
                ", instituteType=" + instituteType +
                ", isDelete=" + isDelete +
                ", branchInstitutes=" + branchInstitutes +
                ", version=" + version +
                ", createTime=" + createTime +
                ", lastAccessTime=" + lastAccessTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgInstitute that = (OrgInstitute) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(instituteName, that.instituteName) &&
                Objects.equals(instituteType, that.instituteType) &&
                Objects.equals(isDelete, that.isDelete) &&
                Objects.equals(branchInstitutes, that.branchInstitutes) &&
                Objects.equals(version, that.version) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(lastAccessTime, that.lastAccessTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instituteName, instituteType, isDelete, branchInstitutes, version, createTime, lastAccessTime);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public void setInstituteType(Integer instituteType) {
        this.instituteType = instituteType;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public void setBranchInstitutes(List<BranchInstitute> branchInstitutes) {
        this.branchInstitutes = branchInstitutes;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public void setLastAccessTime(LocalDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }
}
