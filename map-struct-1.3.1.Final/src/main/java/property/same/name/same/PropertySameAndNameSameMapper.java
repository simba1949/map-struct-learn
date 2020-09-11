package property.same.name.same;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Mapper ：自定义映射器
 * 属性相同，属性名相同
 * @author Anthony
 * @date 2020/9/11 10:26
 */
@Mapper
public interface PropertySameAndNameSameMapper {

    PropertySameAndNameSameMapper INSTANCE = Mappers.getMapper(PropertySameAndNameSameMapper.class);

    /**
     * 对象转换
     * 当属性与目标实体对应项具有相同的名称时，它将隐式映射。
     * @param propertySameAndNameSameDto
     * @return
     */
    PropertySameAndNameSameVo dto2Vo(PropertySameAndNameSameDto propertySameAndNameSameDto);
}
