package com.kclm.owep.mapper;

import com.kclm.owep.entity.Student;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: TODO StudentMapper
 * @date 2023/8/31 14:54
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
//    @Select("select id,stu_name,stu_number,gender,effective_date,status,stu_phone,stu_email," +
//            "last_access_time from t_student where is_delete=1 order by create_time ${order}  ")
    List<Student> getAllStudent(@Param("order") String order);

    @Select("select count(id) from t_student where stu_number=#{stuNum};")
    Integer getByStuNum(String  stuNum);

    @Select("select * from t_student where id = #{id};")
    Student getById(Integer id);

    @Select("select fk_class_id from t_student where id=#{studentId};")
    Integer getStudentClassId(Integer studentId);

    @Select("select id,stu_name,stu_college,stu_school,fk_class_id from t_student;")
    List<Student> getStudentSuggest();
}
