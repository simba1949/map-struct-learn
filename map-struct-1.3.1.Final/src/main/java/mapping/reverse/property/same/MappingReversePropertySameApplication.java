package mapping.reverse.property.same;

import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 18:36
 */
public class MappingReversePropertySameApplication {
    public static void main(String[] args) {
        MappingReversePropertySameDto dto = new MappingReversePropertySameDto();
        dto.setDateDto(new Date());
        dto.setIdSame(1);
        dto.setNameDto("name");

        MappingReversePropertySameVo vo = MappingReversePropertySameMapper.INSTANCE.dto2Vo(dto);
        System.out.println(vo);

        MappingReversePropertySameDto vo2Dto = MappingReversePropertySameMapper.INSTANCE.vo2Dto(vo);
        System.out.println(vo2Dto);
    }
}
