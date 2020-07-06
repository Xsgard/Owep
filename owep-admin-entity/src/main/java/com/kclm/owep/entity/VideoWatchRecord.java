package com.kclm.owep.entity;

import java.util.Date;

public class VideoWatchRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.start_position
     *
     * @mbg.generated
     */
    private String startPosition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.end_position
     *
     * @mbg.generated
     */
    private String endPosition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.fk_video_id
     *
     * @mbg.generated
     */
    private Integer fkVideoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.fk_studyrecord_id
     *
     * @mbg.generated
     */
    private Integer fkStudyrecordId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.current_progress
     *
     * @mbg.generated
     */
    private Double currentProgress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.last_access_time
     *
     * @mbg.generated
     */
    private Date lastAccessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_videowatch_record.version
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.id
     *
     * @return the value of t_videowatch_record.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.id
     *
     * @param id the value for t_videowatch_record.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.start_time
     *
     * @return the value of t_videowatch_record.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.start_time
     *
     * @param startTime the value for t_videowatch_record.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.start_position
     *
     * @return the value of t_videowatch_record.start_position
     *
     * @mbg.generated
     */
    public String getStartPosition() {
        return startPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.start_position
     *
     * @param startPosition the value for t_videowatch_record.start_position
     *
     * @mbg.generated
     */
    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition == null ? null : startPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.end_time
     *
     * @return the value of t_videowatch_record.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.end_time
     *
     * @param endTime the value for t_videowatch_record.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.end_position
     *
     * @return the value of t_videowatch_record.end_position
     *
     * @mbg.generated
     */
    public String getEndPosition() {
        return endPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.end_position
     *
     * @param endPosition the value for t_videowatch_record.end_position
     *
     * @mbg.generated
     */
    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition == null ? null : endPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.fk_video_id
     *
     * @return the value of t_videowatch_record.fk_video_id
     *
     * @mbg.generated
     */
    public Integer getFkVideoId() {
        return fkVideoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.fk_video_id
     *
     * @param fkVideoId the value for t_videowatch_record.fk_video_id
     *
     * @mbg.generated
     */
    public void setFkVideoId(Integer fkVideoId) {
        this.fkVideoId = fkVideoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.fk_studyrecord_id
     *
     * @return the value of t_videowatch_record.fk_studyrecord_id
     *
     * @mbg.generated
     */
    public Integer getFkStudyrecordId() {
        return fkStudyrecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.fk_studyrecord_id
     *
     * @param fkStudyrecordId the value for t_videowatch_record.fk_studyrecord_id
     *
     * @mbg.generated
     */
    public void setFkStudyrecordId(Integer fkStudyrecordId) {
        this.fkStudyrecordId = fkStudyrecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.current_progress
     *
     * @return the value of t_videowatch_record.current_progress
     *
     * @mbg.generated
     */
    public Double getCurrentProgress() {
        return currentProgress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.current_progress
     *
     * @param currentProgress the value for t_videowatch_record.current_progress
     *
     * @mbg.generated
     */
    public void setCurrentProgress(Double currentProgress) {
        this.currentProgress = currentProgress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.create_time
     *
     * @return the value of t_videowatch_record.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.create_time
     *
     * @param createTime the value for t_videowatch_record.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.last_access_time
     *
     * @return the value of t_videowatch_record.last_access_time
     *
     * @mbg.generated
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.last_access_time
     *
     * @param lastAccessTime the value for t_videowatch_record.last_access_time
     *
     * @mbg.generated
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_videowatch_record.version
     *
     * @return the value of t_videowatch_record.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_videowatch_record.version
     *
     * @param version the value for t_videowatch_record.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}