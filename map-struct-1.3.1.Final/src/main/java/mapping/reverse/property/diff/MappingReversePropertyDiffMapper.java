package mapping.reverse.property.diff;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Anthony
 * @date 2020/9/11 18:50
 */
@Mapper
public interface MappingReversePropertyDiffMapper {
    MappingReversePropertyDiffMapper INSTANCE = Mappers.getMapper(MappingReversePropertyDiffMapper.class);

    @Mapping(source = "idDto", target = "idVo")
    @Mapping(source = "toDateDto", target = "toDateVo", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(source = "toLocalDateTimeDto", target = "toLocalDateTimeVo", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(expression = "java(toEnum(mappingReversePropertyDiffDto.getToEnum()))", target = "anEnum")
    MappingReversePropertyDiffVo dto2Vo(MappingReversePropertyDiffDto mappingReversePropertyDiffDto);

    /**
     * 反向映射：添加注解 @InheritInverseConfiguration(name = "dto2Vo")
     * 如果多个方法符合条件，需要在 name 指定对应的方法名
     * 如果不满足反向映射需要自定义方法反向映射
     * @param mappingReversePropertySameVo
     * @return
     */
    @InheritInverseConfiguration(name = "dto2Vo")
    @Mapping(expression = "java(enum2String(mappingReversePropertySameVo.getAnEnum()))", target = "toEnum")
    MappingReversePropertyDiffDto vo2Dto(MappingReversePropertyDiffVo mappingReversePropertySameVo);

    default MappingReversePropertyDiffEnum toEnum(String code){
        if (null == code || code.length() <= 0){
            throw new RuntimeException("");
        }
        return MappingReversePropertyDiffEnum.getEnumByCode(Integer.valueOf(code));
    }

    /**
     * 自定义方法反向映射
     * @param anEnum
     * @return
     */
    default String enum2String(MappingReversePropertyDiffEnum anEnum){
        return String.valueOf(anEnum.getCode());
    }
}
