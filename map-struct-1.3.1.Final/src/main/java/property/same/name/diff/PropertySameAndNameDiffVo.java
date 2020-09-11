package property.same.name.diff;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 13:55
 */
@Data
public class PropertySameAndNameDiffVo {
    private Integer idVo;
    private Boolean enableVo;
    private BigDecimal priceVo;
    private String descVo;
    private Date produceVo;
    private LocalDateTime birthdayVo;
}
