package property.diff;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Mapper ：自定义映射器
 * 属性不相同
 * @author Anthony
 * @date 2020/9/11 14:10
 */
@Mapper
public interface PropertyDiffMapper {

    PropertyDiffMapper INSTANCE = Mappers.getMapper(PropertyDiffMapper.class);

    /**
     * 对象转换
     * 属性相同：当属性与目标实体对应项具有相同的名称时，它将隐式映射。
     * 属性相同：当属性与目标实体对应项名称不相同时，需要使用 @Mapping 显示映射
     *
     * 属性不同：
     *  有特殊要求的，比如日期，@Mapping 添加属性 dateFormat，不满足要求的可以自定义解析
     *  (假设 enable 1=true,0=false)：按照自定义解析方式解析
     *  无特殊要求的，按照以下规则解析
     *
     *  Boolean.parseBoolean(..)
     *  Integer.parseInt(..)
     *
     *  String.valueOf(..)
     *
     *  (new SimpleDateFormat("yyyy-MM-dd")).parse(..) ： dateFormat = "yyyy-MM-dd"
     *  LocalDateTime.parse(.., DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) ：dateFormat = "yyyy-MM-dd HH:mm:ss"
     *
     *  new BigDecimal(..)
     *
     * @param propertyDiffDto
     * @return
     */
    @Mapping(source = "idDto", target = "idVo")
    // 将 source 定义成 表达式
    @Mapping(expression = "java(enableDto2Vo(propertyDiffDto.getEnableDto()))", target = "enableVo")
    @Mapping(source = "priceDto", target = "priceVo")
    @Mapping(source = "descDto", target = "descVo")
    // 需要添加日期格式化
    @Mapping(source = "produceDto", target = "produceVo", dateFormat = "yyyy-MM-dd")
    @Mapping(source = "birthdayDto", target = "birthdayVo", dateFormat = "yyyy-MM-dd HH:mm:ss")
    PropertyDiffVo dto2Vo(PropertyDiffDto propertyDiffDto);

    /**
     * 自定义 enableDto2Vo 解析
     * @param enableStr
     * @return
     */
    default boolean enableDto2Vo(String enableStr){
        if ("0".equals(enableStr)){
            return false;
        }else if ("1".equals(enableStr)){
            return true;
        }else {
            throw new RuntimeException("无法解析:" + enableStr);
        }
    }
}
