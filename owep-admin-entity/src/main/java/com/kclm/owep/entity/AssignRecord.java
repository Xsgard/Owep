package com.kclm.owep.entity;

import java.util.Date;

public class AssignRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_assign_record.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_assign_record.fk_from_user_id
     *
     * @mbg.generated
     */
    private Integer fkFromUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_assign_record.fk_to_user_id
     *
     * @mbg.generated
     */
    private Integer fkToUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_assign_record.fk_client_id
     *
     * @mbg.generated
     */
    private Integer fkClientId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_assign_record.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_assign_record.reason
     *
     * @mbg.generated
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_assign_record.last_access_time
     *
     * @mbg.generated
     */
    private Date lastAccessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_assign_record.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_assign_record.id
     *
     * @return the value of t_assign_record.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_assign_record.id
     *
     * @param id the value for t_assign_record.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_assign_record.fk_from_user_id
     *
     * @return the value of t_assign_record.fk_from_user_id
     *
     * @mbg.generated
     */
    public Integer getFkFromUserId() {
        return fkFromUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_assign_record.fk_from_user_id
     *
     * @param fkFromUserId the value for t_assign_record.fk_from_user_id
     *
     * @mbg.generated
     */
    public void setFkFromUserId(Integer fkFromUserId) {
        this.fkFromUserId = fkFromUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_assign_record.fk_to_user_id
     *
     * @return the value of t_assign_record.fk_to_user_id
     *
     * @mbg.generated
     */
    public Integer getFkToUserId() {
        return fkToUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_assign_record.fk_to_user_id
     *
     * @param fkToUserId the value for t_assign_record.fk_to_user_id
     *
     * @mbg.generated
     */
    public void setFkToUserId(Integer fkToUserId) {
        this.fkToUserId = fkToUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_assign_record.fk_client_id
     *
     * @return the value of t_assign_record.fk_client_id
     *
     * @mbg.generated
     */
    public Integer getFkClientId() {
        return fkClientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_assign_record.fk_client_id
     *
     * @param fkClientId the value for t_assign_record.fk_client_id
     *
     * @mbg.generated
     */
    public void setFkClientId(Integer fkClientId) {
        this.fkClientId = fkClientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_assign_record.create_time
     *
     * @return the value of t_assign_record.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_assign_record.create_time
     *
     * @param createTime the value for t_assign_record.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_assign_record.reason
     *
     * @return the value of t_assign_record.reason
     *
     * @mbg.generated
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_assign_record.reason
     *
     * @param reason the value for t_assign_record.reason
     *
     * @mbg.generated
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_assign_record.last_access_time
     *
     * @return the value of t_assign_record.last_access_time
     *
     * @mbg.generated
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_assign_record.last_access_time
     *
     * @param lastAccessTime the value for t_assign_record.last_access_time
     *
     * @mbg.generated
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_assign_record.version
     *
     * @return the value of t_assign_record.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_assign_record.version
     *
     * @param version the value for t_assign_record.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}