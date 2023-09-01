package com.kclm.owep.mapper;

import com.kclm.owep.entity.Clazz;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Asgard
 * @version 1.0
 * @description: ClassMapper
 * @date 2023/9/1 13:07
 */
@Mapper
public interface ClassMapper extends BaseMapper<Clazz> {

    @Select("select id,class_number,class_name from t_class where is_delete=1" +
            " and class_status=1 and fk_profession_id=#{professionId} ;")
    List<Clazz> getClazzInfo(Integer professionId);
}
