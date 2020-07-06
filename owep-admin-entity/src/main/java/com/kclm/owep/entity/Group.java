package com.kclm.owep.entity;

import java.util.Date;

public class Group {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_name
     *
     * @mbg.generated
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.group_description
     *
     * @mbg.generated
     */
    private String groupDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.last_access_time
     *
     * @mbg.generated
     */
    private Date lastAccessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_group.max_count
     *
     * @mbg.generated
     */
    private Integer maxCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.id
     *
     * @return the value of t_group.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.id
     *
     * @param id the value for t_group.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_name
     *
     * @return the value of t_group.group_name
     *
     * @mbg.generated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_name
     *
     * @param groupName the value for t_group.group_name
     *
     * @mbg.generated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.group_description
     *
     * @return the value of t_group.group_description
     *
     * @mbg.generated
     */
    public String getGroupDescription() {
        return groupDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.group_description
     *
     * @param groupDescription the value for t_group.group_description
     *
     * @mbg.generated
     */
    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription == null ? null : groupDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.create_time
     *
     * @return the value of t_group.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.create_time
     *
     * @param createTime the value for t_group.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.last_access_time
     *
     * @return the value of t_group.last_access_time
     *
     * @mbg.generated
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.last_access_time
     *
     * @param lastAccessTime the value for t_group.last_access_time
     *
     * @mbg.generated
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.version
     *
     * @return the value of t_group.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.version
     *
     * @param version the value for t_group.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_group.max_count
     *
     * @return the value of t_group.max_count
     *
     * @mbg.generated
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_group.max_count
     *
     * @param maxCount the value for t_group.max_count
     *
     * @mbg.generated
     */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }
}