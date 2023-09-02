package com.kclm.owep.service;

import com.kclm.owep.dto.NodeDTO;
import com.kclm.owep.dto.StudentDTO;
import com.kclm.owep.dto.StudentSuggestDTO;
import com.kclm.owep.entity.Student;

import java.io.Serializable;
import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: StudentService
 * @date 2023/8/31 15:01
 */
public interface StudentService {
    List<StudentDTO> getStudentInfo(String order, Integer limit, Integer offset);

    void addStudent(Student student);

    List<NodeDTO> getClazzTreeCheck(Integer studentId);

    void updateStudent(Student student);

    void stuSwitch(Integer id, Integer status);

    List<StudentSuggestDTO> getStudentSuggestInfo();

    void deleteById(Serializable id);

    void deleteByIds(List<Serializable> ids);
}
