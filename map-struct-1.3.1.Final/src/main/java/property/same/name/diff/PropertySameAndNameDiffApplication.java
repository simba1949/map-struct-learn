package property.same.name.diff;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 13:54
 */
public class PropertySameAndNameDiffApplication {
    public static void main(String[] args) {
        PropertySameAndNameDiffDto dto = new PropertySameAndNameDiffDto();
        dto.setIdDto(1);
        dto.setEnableDto(true);
        dto.setDescDto("desc");
        dto.setPriceDto(BigDecimal.TEN);
        dto.setProduceDto(new Date());
        dto.setBirthdayDto(LocalDateTime.now());

        PropertySameAndNameDiffVo vo = PropertySameAndNameDiffMapper.INSTANCE.dto2Vo(dto);
        System.out.println(vo);
    }
}
