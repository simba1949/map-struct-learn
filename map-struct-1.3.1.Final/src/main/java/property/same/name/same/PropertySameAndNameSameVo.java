package property.same.name.same;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 10:25
 */
@Data
public class PropertySameAndNameSameVo {
    private Integer id;
    private Boolean enable;
    private BigDecimal price;
    private String desc;
    private Date produce;
    private LocalDateTime birthday;
}
