package com.kclm.owep.convert;

import com.kclm.owep.dto.UserDto;
import com.kclm.owep.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/********************
 * @author yejf
 * 此接口是基于mapstruct组件技术来完成实体类与DTO之前的映射，包含集合或集合属性都可以。
 */
@Mapper(componentModel = "spring")
public interface UserConvert {

    /** 实例:用spring IOC管理时，此句可以不用写 */
//    UserConvert instance = Mappers.getMapper(UserConvert.class);

    /*************************************************************
     *
     * @param user
     * @return
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "userPwd", target = "userPwd")
    UserDto toUserDto(User user);

}
