package multi.object;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 15:32
 */
@Data
public class MultiObject2OneVo {
    private String idVo;
    private Integer ageVo;
    private BigDecimal priceVo;

    private Date birthdayVo;
    private LocalDateTime localDateTimeVo;

    private Boolean enableVo;
}
