package property.diff;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 14:10
 */
@Data
public class PropertyDiffVo {
    private Integer idVo;
    private Boolean enableVo;
    private BigDecimal priceVo;
    private String descVo;
    private Date produceVo;
    private LocalDateTime birthdayVo;
}
