/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Objects;

/*********************
 * @Author: ZhangShaowei
 * @Version : v1.0
 * @Create: 2020年7月03日
 * @Description 学生实体类
 */
@Data
public class Student {

    /**
     * id
     */
    private Integer id;

    /**
     * 学生用户名
     */
    private String stuName;

    /**
     * 学生密码
     */
    private String stuPwd;

    /**
     * 学号
     */
    private String stuNumber;

    /**
     * 学生手机号码
     */
    private String stuPhone;

    /**
     * 学生邮箱
     */
    private String stuEmail;

    /**
     * 学生真实姓名
     */
    private String stuRealName;

    /**
     * 学生email密文
     */
    private String emailCode;

    /**
     * 学生性别，1表示男，0表示女，-1 表示未知
     */
    private Integer gender;

    /**
     * 学生身份证号码
     */
    private String cardNum;

    /**
     * 学生状态，1表示启用，0表示禁用
     */
    private Integer status;

    /**
     * 学生截止有效期限
     */

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime effectiveDate;

    /**
     * 学生生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime birth;

    /**
     * 学生头像图片路径
     */
    private String imageUrl;

    /**
     * 学生描述信息
     */
    private String description;

    /**
     * 学员的类型，如：应届生，往届生
     */
    private String stuType;

    /**
     * 学生就读的大学
     */
    private String stuSchool;

    /**
     * 学生所在的院系
     */
    private String stuCollege;

    /**
     * 学生专业
     */
    private String stuMajor;

    /**
     * 学生学历，枚举，1.博士，2.硕士，3. 本科，4.专科，5.高中，6.中职，7.其它
     */
    private Integer stuEducation;

    /**
     * 英语水平，枚举，1.AB,2.4级，3. 6级，4.8级， 5. 雅思，6，托福
     */
    private Integer englishLevel;

    /**
     * 个人资料是否完善，1表示已完善，0表示未完善
     */
    private Integer perfectStatus;

    /**
     * 是否已经逻辑删除，1表示未删除，0表示已删除
     */
    private Integer isDelete;

    /**
     * 学生创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 学生最后一次访问时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastAccessTime;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 外键 ，班级ID
     */
    private Clazz clazz;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", stuName='").append(stuName).append('\'');
        sb.append(", stuPwd='").append(stuPwd).append('\'');
        sb.append(", stuNumber='").append(stuNumber).append('\'');
        sb.append(", stuPhone='").append(stuPhone).append('\'');
        sb.append(", stuEmail='").append(stuEmail).append('\'');
        sb.append(", stuRealName='").append(stuRealName).append('\'');
        sb.append(", emailCode='").append(emailCode).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", cardNum='").append(cardNum).append('\'');
        sb.append(", status=").append(status);
        sb.append(", effectiveDate=").append(effectiveDate);
        sb.append(", birth=").append(birth);
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", stuType='").append(stuType).append('\'');
        sb.append(", stuSchool='").append(stuSchool).append('\'');
        sb.append(", stuCollege='").append(stuCollege).append('\'');
        sb.append(", stuMajor='").append(stuMajor).append('\'');
        sb.append(", stuEducation=").append(stuEducation);
        sb.append(", englishLevel=").append(englishLevel);
        sb.append(", perfectStatus=").append(perfectStatus);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastAccessTime=").append(lastAccessTime);
        sb.append(", version=").append(version);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Student student = (Student) o;
        return id.equals(student.id) &&
                stuName.equals(student.stuName) &&
                stuPwd.equals(student.stuPwd) &&
                stuPhone.equals(student.stuPhone) &&
                stuEmail.equals(student.stuEmail) &&
                stuRealName.equals(student.stuRealName) &&
                emailCode.equals(student.emailCode) &&
                gender.equals(student.gender) &&
                cardNum.equals(student.cardNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stuName, stuPwd, stuPhone, stuEmail, stuRealName, emailCode, gender, cardNum);
    }

    public Student() {
        this.stuType = "";
        this.status = 0;
        this.gender = 1;
    }
}
