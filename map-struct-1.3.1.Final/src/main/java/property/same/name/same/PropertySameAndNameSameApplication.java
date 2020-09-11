package property.same.name.same;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 10:27
 */
public class PropertySameAndNameSameApplication {
    public static void main(String[] args) {
        PropertySameAndNameSameDto dto = new PropertySameAndNameSameDto();
        dto.setId(1);
        dto.setEnable(true);
        dto.setDesc("desc");
        dto.setPrice(BigDecimal.ONE);
        dto.setProduce(new Date());
        dto.setBirthday(LocalDateTime.now());

        PropertySameAndNameSameVo vo = PropertySameAndNameSameMapper.INSTANCE.dto2Vo(dto);
        System.out.println(vo);
    }
}
