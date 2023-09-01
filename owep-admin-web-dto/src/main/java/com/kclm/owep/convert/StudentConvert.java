package com.kclm.owep.convert;

import com.kclm.owep.dto.StudentDTO;
import com.kclm.owep.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Asgard
 * @version 1.0
 * @description: TODO StudentConvert
 * @date 2023/8/31 16:13
 */
@Mapper(componentModel = "spring")
public interface StudentConvert {
    //
    StudentDTO toDto(Student student);
}
