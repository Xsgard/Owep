/*********************
 * 2018-2021 版权所有 CopyRight（c）
 */
package com.kclm.owep.dto;

import com.kclm.owep.entity.Resource;
import com.kclm.owep.entity.Student;

import java.time.LocalDateTime;
import java.util.List;

/*********************
 * @Auther shentr
 * @Version V1.0
 * @Create 2020/7/13 9:44
 * @Description 授课管理的dto
 */
public class TeachingDTO {

    /**
     * id
     */
    private Integer id;
    /***
     * 班级描述
     */
    private String classDesc;
    /***
     * 资源管理
     */
    private List<Resource> resourceList;
    /**
     *学员外键
     */
    private Student student;
    /**
     *评价内容
     */
    private String evaluate;
    /**
     *请假时间
     */
    private LocalDateTime leaveTime;
    /**
     *结束时间
     */
    private LocalDateTime endTime;
    /**
     *请假事由
     */
    private String reasonLeave;
    /**
     *审核状态,1.待审核， 2， 审核通过， 0 未通过
     */
    private Integer approvalStatus;
    /**
     *违规时间
     */
    private LocalDateTime disciplineTime;
    /**
     *情况说明
     */
    private String presentationCondition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public LocalDateTime getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(LocalDateTime leaveTime) {
        this.leaveTime = leaveTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getReasonLeave() {
        return reasonLeave;
    }

    public void setReasonLeave(String reasonLeave) {
        this.reasonLeave = reasonLeave;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public LocalDateTime getDisciplineTime() {
        return disciplineTime;
    }

    public void setDisciplineTime(LocalDateTime disciplineTime) {
        this.disciplineTime = disciplineTime;
    }

    public String getPresentationCondition() {
        return presentationCondition;
    }

    public void setPresentationCondition(String presentationCondition) {
        this.presentationCondition = presentationCondition;
    }

    @Override
    public String toString() {
        return "TeachingDTO{" +
                "id=" + id +
                ", classDesc='" + classDesc + '\'' +
                ", resourceList=" + resourceList +
                ", student=" + student +
                ", evaluate='" + evaluate + '\'' +
                ", leaveTime=" + leaveTime +
                ", endTime=" + endTime +
                ", reasonLeave='" + reasonLeave + '\'' +
                ", approvalStatus=" + approvalStatus +
                ", disciplineTime=" + disciplineTime +
                ", presentationCondition='" + presentationCondition + '\'' +
                '}';
    }
}
