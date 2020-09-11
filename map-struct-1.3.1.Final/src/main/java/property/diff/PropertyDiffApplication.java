package property.diff;

/**
 * @author Anthony
 * @date 2020/9/11 14:10
 */
public class PropertyDiffApplication {
    public static void main(String[] args) {
        PropertyDiffDto dto = new PropertyDiffDto();
        dto.setIdDto("1");
        // 除了 true 其他都是 false：假设1=true,0=false
        dto.setEnableDto("0");
        dto.setPriceDto("6.66");
        dto.setDescDto(1);
        dto.setProduceDto("2020-09-11");
        dto.setBirthdayDto("2020-09-11 14:00:00");

        PropertyDiffVo vo = PropertyDiffMapper.INSTANCE.dto2Vo(dto);
        System.out.println(vo);
    }
}
