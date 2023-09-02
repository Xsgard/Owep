package com.kclm.owep.dto;

import com.kclm.owep.entity.Clazz;
import lombok.Data;

/**
 * @author Asgard
 * @version 1.0
 * @description: StudentSuggestDTO
 * @date 2023/9/1 19:20
 */
@Data
public class StudentSuggestDTO {

    private Integer id;

    private String stuName;

    private String stuSchool;

    private String stuCollege;

    public String className;
}
