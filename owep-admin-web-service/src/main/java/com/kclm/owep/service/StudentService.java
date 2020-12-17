package com.kclm.owep.service;

import com.kclm.owep.dto.StuDTO;
import com.kclm.owep.dto.StudentDTO;
import com.kclm.owep.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public interface StudentService {
    int create(@Param("student") Student student);

    int update(@Param("student") Student student);

    int delete(@Param("id") Integer id);

    List<Student> selectAll();

    List<Student> selectAllSchool();

    List<Student> selectAllCollege();

    List<Integer> getClassIds(Serializable id);

    List<Student> findByKeyword(String keyword);

    List<Student> selectNoClass();

    int setGroups(@Param("studentId") Integer studentId, @Param("groupIds") List<Integer> groupIds);

    Student selectById(@Param("id") Integer id);

    StuDTO translator_Stu2StuDto(Student student);

    int insertAllStudent(List<Student> list);

    int setClass(@Param("stuId") Integer stuId,@Param("classIds") Serializable classIds);

    int activate (@Param("id") Integer id);

    int deactivate (@Param("id") Integer id);
    /**
     * 根据姓名和学号来查询
     * @param id
     * @param studentNumber
     * @param studentName
     * @return
     */
    List<StudentDTO> selectStudentByKeyword(Serializable id, String studentNumber, String studentName);

    /**
     * 根据班级id来查找学员
     * @param id
     * @return
     */
    List<StudentDTO> selectStudentByClassId(Serializable id);

    /**
     * 删除选中的学生
     * @param idList
     * @return
     */
    int deleteSelect(List<Serializable> idList);

    /**
     * 批量导入学生到班级
     * @Author TianYanwei
     * @param list
     * @return
     */
    int insertAllStudentToClass(List<Student> list);
}
