/*******************
 *版权所有 CopyRight(c) 快程乐码信息科技有限公司所有，未经授权，不得复制转发
 *
 */

package com.kclm.owep.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * author：ZhangQi
 * module：privilege
 * description:菜单实体，关联行为和权限,同时自关联
 * version：v0.1
 * time：2020/7/3
 */
public class Menu implements Serializable {
    private Integer id;
    private Menu parent;/** 父菜单*/
    private String menuName;/** 菜单名*/
    private String menuUrl;/** 菜单URL*/
    private String menuDescription;/** 菜单描述*/
    private String menuCode;/** 菜单代号*/
    private LocalDateTime createTime;/** 菜单创建时间*/
    private LocalDateTime lastAccessTime;/** 最后一次访问时间*/
    private Integer version;/** 版本号*/
    private List<Menu> childMenus;/** 子菜单*/
    private List<Permission> permissions;/** 关联权限*/
    private List<Action> actions;/** 关联行为表*/

    public Menu() {
    }

    public Menu(Integer id, Menu parent, String menuName, String menuUrl, String menuDescription, String menuCode, LocalDateTime createTime, LocalDateTime lastAccessTime, Integer version) {
        this.id = id;
        this.parent = parent;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuDescription = menuDescription;
        this.menuCode = menuCode;
        this.createTime = createTime;
        this.lastAccessTime = lastAccessTime;
        this.version = version;
    }

    public Menu(Menu parent, String menuName, String menuUrl, String menuDescription, String menuCode, LocalDateTime createTime, LocalDateTime lastAccessTime, Integer version) {
        this.parent = parent;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuDescription = menuDescription;
        this.menuCode = menuCode;
        this.createTime = createTime;
        this.lastAccessTime = lastAccessTime;
        this.version = version;
    }

    public Menu(Integer id, Menu parent, String menuName, String menuUrl, String menuDescription, String menuCode, LocalDateTime createTime, LocalDateTime lastAccessTime, Integer version, List<Menu> childMenus, List<Permission> permissions, List<Action> actions) {
        this.id = id;
        this.parent = parent;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuDescription = menuDescription;
        this.menuCode = menuCode;
        this.createTime = createTime;
        this.lastAccessTime = lastAccessTime;
        this.version = version;
        this.childMenus = childMenus;
        this.permissions = permissions;
        this.actions = actions;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Menu{");
        sb.append("id=").append(id);
        sb.append(", parent=").append(parent);
        sb.append(", menuName='").append(menuName).append('\'');
        sb.append(", menuUrl='").append(menuUrl).append('\'');
        sb.append(", menuDescription='").append(menuDescription).append('\'');
        sb.append(", menuCode='").append(menuCode).append('\'');
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
        Menu menu = (Menu) o;
        return Objects.equals(id, menu.id) &&
                Objects.equals(menuUrl, menu.menuUrl) &&
                Objects.equals(menuCode, menu.menuCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, menuUrl, menuCode);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription == null ? null : menuDescription.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
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

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    public List<Menu> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<Menu> childMenus) {
        this.childMenus = childMenus;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}