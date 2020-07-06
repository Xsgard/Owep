package com.kclm.owep.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * author：ZhangQi
 * module：privilege
 * description:权限实体,与角色、菜单、行为都有多对多关联
 * version：v0.1
 * time：2020/7/3
 */
public class Permission implements Serializable {
    private Integer id;
    private String permissionName;//权限名
    private String permissionDescription;//权限描述
    private LocalDateTime createTime;//创建时间
    private LocalDateTime lastAccessTime;//最后一次访问时间
    private Integer version;//版本号
    private List<Role> roles;//关联角色
    private List<Action> actions;//关联行为
    private List<Menu> menus;//关联菜单


    public Permission() {
    }

    public Permission(String permissionName, String permissionDescription, LocalDateTime createTime, LocalDateTime lastAccessTime, Integer version) {
        this.permissionName = permissionName;
        this.permissionDescription = permissionDescription;
        this.createTime = createTime;
        this.lastAccessTime = lastAccessTime;
        this.version = version;
    }

    public Permission(Integer id, String permissionName, String permissionDescription, LocalDateTime createTime, LocalDateTime lastAccessTime, Integer version) {
        this.id = id;
        this.permissionName = permissionName;
        this.permissionDescription = permissionDescription;
        this.createTime = createTime;
        this.lastAccessTime = lastAccessTime;
        this.version = version;
    }

    public Permission(Integer id, String permissionName, String permissionDescription, LocalDateTime createTime, LocalDateTime lastAccessTime, Integer version, List<Role> roles, List<Action> actions, List<Menu> menus) {
        this.id = id;
        this.permissionName = permissionName;
        this.permissionDescription = permissionDescription;
        this.createTime = createTime;
        this.lastAccessTime = lastAccessTime;
        this.version = version;
        this.roles = roles;
        this.actions = actions;
        this.menus = menus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Permission{");
        sb.append("id=").append(id);
        sb.append(", permissionName='").append(permissionName).append('\'');
        sb.append(", permissionDescription='").append(permissionDescription).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", lastAccessTime=").append(lastAccessTime);
        sb.append(", version=").append(version);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(permissionName, that.permissionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permissionName);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionDescription() {
        return permissionDescription;
    }

    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription == null ? null : permissionDescription.trim();
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(LocalDateTime lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}