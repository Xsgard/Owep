/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.entity;

import java.time.LocalDateTime;

/*****
 * @Author WSP
 * @Version v1.0
 * @Create 2020/7/6 16:33
 * @Description 资源类型实体类
 */
public class ResourceType {

    /***
     * 主键ID
     */
    private Integer id;

    /***
     * 资源类型名称/资源管理
     */
    private String typeName;

    /***
     * 资源描述
     */
    private String typeDesc;

    /***
     * 创建时间
     */
    private LocalDateTime createTime;

    /***
     * 逻辑删除，1表示未删除，0表示已删除
     */
    private Integer delete;

    /***
     * 版本数
     */
    private Integer version;

    /***
     * 最后一次访问时间
     */
    private LocalDateTime lastAccessTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public LocalDateTime getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(LocalDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResourceType{");
        sb.append("id=").append(id);
        sb.append(", typeName='").append(typeName).append('\'');
        sb.append(", typeDesc='").append(typeDesc).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", delete=").append(delete);
        sb.append(", version=").append(version);
        sb.append(", lastAccessTime=").append(lastAccessTime);
        sb.append('}');
        return sb.toString();
    }
}