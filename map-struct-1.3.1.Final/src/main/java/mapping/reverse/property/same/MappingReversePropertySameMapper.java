package mapping.reverse.property.same;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Anthony
 * @date 2020/9/11 18:35
 */
@Mapper
public interface MappingReversePropertySameMapper {

    MappingReversePropertySameMapper INSTANCE = Mappers.getMapper(MappingReversePropertySameMapper.class);

    @Mapping(source = "nameDto", target = "nameVo")
    @Mapping(source = "dateDto", target = "dateVo")
    MappingReversePropertySameVo dto2Vo(MappingReversePropertySameDto mappingReversePropertySameDto);

    /**
     * 反向映射：添加注解 @InheritInverseConfiguration(name = "dto2Vo")
     * 如果多个方法符合条件，需要在 name 指定对应的方法名
     * @param mappingReversePropertySameVo
     * @return
     */
    @InheritInverseConfiguration(name = "dto2Vo")
    MappingReversePropertySameDto vo2Dto(MappingReversePropertySameVo mappingReversePropertySameVo);
}
