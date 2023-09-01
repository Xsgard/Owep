package com.kclm.owep.service;

import com.kclm.owep.dto.StudentDTO;
import com.kclm.owep.entity.Student;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: TODO StudentService
 * @date 2023/8/31 15:01
 */
public interface StudentService {
    List<StudentDTO> getStudentInfo(String order, Integer limit, Integer offset);

    void addStudent(Student student);
}
