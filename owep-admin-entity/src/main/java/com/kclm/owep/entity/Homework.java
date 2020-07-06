package com.kclm.owep.entity;

import java.util.Date;

public class Homework {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.work_title
     *
     * @mbg.generated
     */
    private String workTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.work_content
     *
     * @mbg.generated
     */
    private String workContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.fk_section_id
     *
     * @mbg.generated
     */
    private Integer fkSectionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.fk_class_id
     *
     * @mbg.generated
     */
    private Integer fkClassId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.work_file_name
     *
     * @mbg.generated
     */
    private String workFileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.work_status
     *
     * @mbg.generated
     */
    private Integer workStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.course_name
     *
     * @mbg.generated
     */
    private String courseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_homework.last_access_time
     *
     * @mbg.generated
     */
    private Date lastAccessTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.id
     *
     * @return the value of t_homework.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.id
     *
     * @param id the value for t_homework.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.work_title
     *
     * @return the value of t_homework.work_title
     *
     * @mbg.generated
     */
    public String getWorkTitle() {
        return workTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.work_title
     *
     * @param workTitle the value for t_homework.work_title
     *
     * @mbg.generated
     */
    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle == null ? null : workTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.work_content
     *
     * @return the value of t_homework.work_content
     *
     * @mbg.generated
     */
    public String getWorkContent() {
        return workContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.work_content
     *
     * @param workContent the value for t_homework.work_content
     *
     * @mbg.generated
     */
    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.fk_section_id
     *
     * @return the value of t_homework.fk_section_id
     *
     * @mbg.generated
     */
    public Integer getFkSectionId() {
        return fkSectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.fk_section_id
     *
     * @param fkSectionId the value for t_homework.fk_section_id
     *
     * @mbg.generated
     */
    public void setFkSectionId(Integer fkSectionId) {
        this.fkSectionId = fkSectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.fk_class_id
     *
     * @return the value of t_homework.fk_class_id
     *
     * @mbg.generated
     */
    public Integer getFkClassId() {
        return fkClassId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.fk_class_id
     *
     * @param fkClassId the value for t_homework.fk_class_id
     *
     * @mbg.generated
     */
    public void setFkClassId(Integer fkClassId) {
        this.fkClassId = fkClassId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.work_file_name
     *
     * @return the value of t_homework.work_file_name
     *
     * @mbg.generated
     */
    public String getWorkFileName() {
        return workFileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.work_file_name
     *
     * @param workFileName the value for t_homework.work_file_name
     *
     * @mbg.generated
     */
    public void setWorkFileName(String workFileName) {
        this.workFileName = workFileName == null ? null : workFileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.work_status
     *
     * @return the value of t_homework.work_status
     *
     * @mbg.generated
     */
    public Integer getWorkStatus() {
        return workStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.work_status
     *
     * @param workStatus the value for t_homework.work_status
     *
     * @mbg.generated
     */
    public void setWorkStatus(Integer workStatus) {
        this.workStatus = workStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.course_name
     *
     * @return the value of t_homework.course_name
     *
     * @mbg.generated
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.course_name
     *
     * @param courseName the value for t_homework.course_name
     *
     * @mbg.generated
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.create_time
     *
     * @return the value of t_homework.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.create_time
     *
     * @param createTime the value for t_homework.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.version
     *
     * @return the value of t_homework.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.version
     *
     * @param version the value for t_homework.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_homework.last_access_time
     *
     * @return the value of t_homework.last_access_time
     *
     * @mbg.generated
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_homework.last_access_time
     *
     * @param lastAccessTime the value for t_homework.last_access_time
     *
     * @mbg.generated
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }
}