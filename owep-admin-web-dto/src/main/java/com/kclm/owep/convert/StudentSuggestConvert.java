package com.kclm.owep.convert;

import com.kclm.owep.dto.StudentSuggestDTO;
import com.kclm.owep.entity.Student;
import org.mapstruct.Mapper;

/**
 * @author Asgard
 * @version 1.0
 * @description: StudentSuggestConvert
 * @date 2023/9/1 19:33
 */
@Mapper(componentModel = "spring")
public interface StudentSuggestConvert {
    StudentSuggestDTO toSuggestDto(Student student);
}
