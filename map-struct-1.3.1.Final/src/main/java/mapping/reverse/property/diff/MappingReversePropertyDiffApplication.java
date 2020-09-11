package mapping.reverse.property.diff;

/**
 * @author Anthony
 * @date 2020/9/11 18:50
 */
public class MappingReversePropertyDiffApplication {
    public static void main(String[] args) {
        MappingReversePropertyDiffDto dto = new MappingReversePropertyDiffDto();
        dto.setIdDto("1");
        dto.setToDateDto("2020-01-01 14:00:00");
        dto.setToLocalDateTimeDto("2020-12-31 14:00:00");
        dto.setToEnum("0");

        MappingReversePropertyDiffVo vo = MappingReversePropertyDiffMapper.INSTANCE.dto2Vo(dto);
        System.out.println(vo);

        MappingReversePropertyDiffDto vo2Dto = MappingReversePropertyDiffMapper.INSTANCE.vo2Dto(vo);
        System.out.println(vo2Dto);
    }
}
