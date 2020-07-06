package com.kclm.owep.entity;

import java.util.Date;

public class Message {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.read
     *
     * @mbg.generated
     */
    private Integer read;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.last_access_time
     *
     * @mbg.generated
     */
    private Date lastAccessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.from_user_name
     *
     * @mbg.generated
     */
    private String fromUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.to_user_name
     *
     * @mbg.generated
     */
    private String toUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.fk_from_student_id
     *
     * @mbg.generated
     */
    private Integer fkFromStudentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.fk_to_student_id
     *
     * @mbg.generated
     */
    private Integer fkToStudentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.id
     *
     * @return the value of t_message.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.id
     *
     * @param id the value for t_message.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.title
     *
     * @return the value of t_message.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.title
     *
     * @param title the value for t_message.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.content
     *
     * @return the value of t_message.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.content
     *
     * @param content the value for t_message.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.read
     *
     * @return the value of t_message.read
     *
     * @mbg.generated
     */
    public Integer getRead() {
        return read;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.read
     *
     * @param read the value for t_message.read
     *
     * @mbg.generated
     */
    public void setRead(Integer read) {
        this.read = read;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.create_time
     *
     * @return the value of t_message.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.create_time
     *
     * @param createTime the value for t_message.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.last_access_time
     *
     * @return the value of t_message.last_access_time
     *
     * @mbg.generated
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.last_access_time
     *
     * @param lastAccessTime the value for t_message.last_access_time
     *
     * @mbg.generated
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.version
     *
     * @return the value of t_message.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.version
     *
     * @param version the value for t_message.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.from_user_name
     *
     * @return the value of t_message.from_user_name
     *
     * @mbg.generated
     */
    public String getFromUserName() {
        return fromUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.from_user_name
     *
     * @param fromUserName the value for t_message.from_user_name
     *
     * @mbg.generated
     */
    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName == null ? null : fromUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.to_user_name
     *
     * @return the value of t_message.to_user_name
     *
     * @mbg.generated
     */
    public String getToUserName() {
        return toUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.to_user_name
     *
     * @param toUserName the value for t_message.to_user_name
     *
     * @mbg.generated
     */
    public void setToUserName(String toUserName) {
        this.toUserName = toUserName == null ? null : toUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.fk_from_student_id
     *
     * @return the value of t_message.fk_from_student_id
     *
     * @mbg.generated
     */
    public Integer getFkFromStudentId() {
        return fkFromStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.fk_from_student_id
     *
     * @param fkFromStudentId the value for t_message.fk_from_student_id
     *
     * @mbg.generated
     */
    public void setFkFromStudentId(Integer fkFromStudentId) {
        this.fkFromStudentId = fkFromStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.fk_to_student_id
     *
     * @return the value of t_message.fk_to_student_id
     *
     * @mbg.generated
     */
    public Integer getFkToStudentId() {
        return fkToStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.fk_to_student_id
     *
     * @param fkToStudentId the value for t_message.fk_to_student_id
     *
     * @mbg.generated
     */
    public void setFkToStudentId(Integer fkToStudentId) {
        this.fkToStudentId = fkToStudentId;
    }
}