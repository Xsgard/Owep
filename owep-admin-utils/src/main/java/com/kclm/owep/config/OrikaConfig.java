/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.config;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.Type;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/*****************
 *
 * @author tanj
 * @date 2020/7/2 11:43
 * @version v1.0
 * @description
 *
 */
@Configuration
public class OrikaConfig {

    public OrikaConfig() {
        System.out.println("初始化 OrikaConfig 实例....");
    }

    @Bean
    public MapperFactory mapperFactory(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        ConverterFactory converterFactory = mapperFactory.getConverterFactory();
        //将自定义类型转换器注册到mapperFactory中
        converterFactory.registerConverter("myDate",new DateAndLocalDate());
        converterFactory.registerConverter("myEnum",new MyEnum());
        return mapperFactory;
    }

    /***
     * 自定义日期转换器 date与localDate之间的双向转换
     */
    private class DateAndLocalDate extends BidirectionalConverter<Date, LocalDate>{
        @Override
        public LocalDate convertTo(Date date, Type<LocalDate> type, MappingContext mappingContext) {
            ZoneId zoneId = ZoneId.systemDefault();
            Instant instant = date.toInstant();

            return instant.atZone(zoneId).toLocalDate();
        }

        @Override
        public Date convertFrom(LocalDate localDate, Type<Date> type, MappingContext mappingContext) {
            ZoneId zoneId = ZoneId.systemDefault();
            ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);

            return Date.from(zonedDateTime.toInstant());
        }
    }

    /***
     * 自定义枚举类型转换器
     */
    private class MyEnum extends BidirectionalConverter<Enum,Integer>{

        @Override
        public Integer convertTo(Enum anEnum, Type<Integer> type, MappingContext mappingContext) {
            return anEnum.ordinal();
        }

        @Override
        public Enum convertFrom(Integer integer, Type<Enum> type, MappingContext mappingContext) {
            ArrayList arrayList = new ArrayList(Arrays.asList(type.getRawType().getEnumConstants()));
            return (Enum) arrayList.get(integer);
        }
    }
}
