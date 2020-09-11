package diy.transform;

import diy.transform.handler.DateTransformHandler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 第一种方式：
 * @Mapper(uses = {DateTransformHandler.class}) ：使用自定义的转换器
 * @author Anthony
 * @date 2020/9/11 16:45
 */
@Mapper(uses = {DateTransformHandler.class})
public interface DiyTransformMapper {

    DiyTransformMapper INSTANCE = Mappers.getMapper(DiyTransformMapper.class);

    @Mapping(source = "intDto", target = "intVo")
    @Mapping(source = "booleanDto", target = "booleanVo")
    @Mapping(source = "dateDto", target = "dateVo", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(source = "localDateTimeDto", target = "localDateTimeVo", dateFormat = "yyyy-MM-dd HH:mm:ss")
    // 第二种方式：使用自定义的转换器
    @Mapping(expression = "java(string2Enum(diyTransformDto.getEnumDto()))",target = "enumVo")
    @Mapping(source = "userIntDto", target = "userVo.userIntVo")
    @Mapping(source = "userStringDto", target = "userVo.userStringVo")
    @Mapping(source = "date2LocalDateTimeDto", target = "date2LocalDateTimeVo")
    @Mapping(source = "localDateTime2DateDto", target = "localDateTime2DateVo")
    DiyTransformVo dto2Vo(DiyTransformDto diyTransformDto);

    /**
     * 转义枚举
     * @param code
     * @return
     */
    default DiyTransformDeleteEnum string2Enum(String code){
        if (null == code || code.length() == 0){
            throw new RuntimeException("解析枚举失败");
        }
        Integer codeInt = Integer.valueOf(code);
        return DiyTransformDeleteEnum.getDeleteEnumByCode(codeInt);
    }
}
