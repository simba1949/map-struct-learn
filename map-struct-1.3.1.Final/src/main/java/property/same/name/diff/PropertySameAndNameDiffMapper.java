package property.same.name.diff;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Mapper ：自定义映射器
 * 属性相同，属性名不相同
 * @author Anthony
 * @date 2020/9/11 13:55
 */
@Mapper
public interface PropertySameAndNameDiffMapper {

    PropertySameAndNameDiffMapper INSTANCE = Mappers.getMapper(PropertySameAndNameDiffMapper.class);

    /**
     * 对象转换
     * 当属性与目标实体对应项具有相同的名称时，它将隐式映射。
     * 当属性与目标实体对应项名称不相同时，需要使用 @Mapping 显示映射
     * @param propertySameAndNameDiffDto
     * @return
     */
    @Mapping(source = "idDto", target = "idVo")
    @Mapping(source = "enableDto", target = "enableVo")
    @Mapping(source = "priceDto", target = "priceVo")
    @Mapping(source = "descDto", target = "descVo")
    @Mapping(source = "produceDto", target = "produceVo")
    @Mapping(source = "birthdayDto", target = "birthdayVo")
    PropertySameAndNameDiffVo dto2Vo(PropertySameAndNameDiffDto propertySameAndNameDiffDto);
}
