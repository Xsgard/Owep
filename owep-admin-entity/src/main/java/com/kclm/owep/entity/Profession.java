package com.kclm.owep.entity;

import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/*********************
 * @Author: tanj
 * @Version : v1.0
 * @Create: 2020年7月03日 上午12:30:40
 * @Description 专业方向
 */
@Getter
public class Profession implements Serializable {

    private Integer id; //id

    private String profName;    //专业名称

    private String profDesc;    //专业描述

    private Integer profStatus; //'专业启用状态 1：已启用 0：未启用'

    private String instituteName; // 所属机构名称

    private String instituteBranchName;  //所属机构下面的分支名称

    private Integer isDelete=1;         //是否删除 1:正常 0：删除

    private String orderProfeName;  //旧的专业名称

    private Integer version=1;        //版本号

    private LocalDateTime createTime=LocalDateTime.now();        //创建时间

    private LocalDateTime lastAccessTime;    //最后一次访问时间

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public void setProfDesc(String profDesc) {
        this.profDesc = profDesc;
    }

    public void setProfStatus(Integer profStatus) {
        this.profStatus = profStatus;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public void setInstituteBranchName(String instituteBranchName) {
        this.instituteBranchName = instituteBranchName;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public void setOrderProfeName(String orderProfeName) {
        this.orderProfeName = orderProfeName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profession that = (Profession) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(profName, that.profName) &&
                Objects.equals(profDesc, that.profDesc) &&
                Objects.equals(instituteName, that.instituteName) &&
                Objects.equals(instituteBranchName, that.instituteBranchName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, profName, profDesc, instituteName, instituteBranchName);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Profession{");
        sb.append("id=").append(id);
        sb.append(", profName='").append(profName).append('\'');
        sb.append(", profDesc='").append(profDesc).append('\'');
        sb.append(", profStatus=").append(profStatus);
        sb.append(", instituteName='").append(instituteName).append('\'');
        sb.append(", instituteBranchName='").append(instituteBranchName).append('\'');
        sb.append(", delete=").append(isDelete);
        sb.append(", orderProfeName='").append(orderProfeName).append('\'');
        sb.append(", version=").append(version);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastAccessTime=").append(lastAccessTime);
        sb.append('}');
        return sb.toString();
    }
}