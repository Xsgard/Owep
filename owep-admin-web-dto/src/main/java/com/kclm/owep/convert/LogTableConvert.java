package com.kclm.owep.convert;

import com.kclm.owep.dto.LogTableDTO;
import com.kclm.owep.dto.SystLogDTO;
import com.kclm.owep.entity.SystLog;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author Asgard
 * @version 1.0
 * @description: SysLogConvert
 * @date 2023/9/4 19:26
 */
@Mapper(componentModel = "spring")
public interface LogTableConvert {

    @Mappings({
            @Mapping(source = "title", target = "logThime"),
            @Mapping(source = "ipAddr", target = "ipAddress"),
            @Mapping(source = "requestUrl", target = "requestAddress"),
            @Mapping(source = "method", target = "requestType"),
            @Mapping(source = "loginUserName", target = "userName"),
    })
    LogTableDTO toDto(SystLog systLog);
}
