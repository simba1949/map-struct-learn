package property.same.name.diff;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 13:54
 */
@Data
public class PropertySameAndNameDiffDto {
    private Integer idDto;
    private Boolean enableDto;
    private BigDecimal priceDto;
    private String descDto;
    private Date produceDto;
    private LocalDateTime birthdayDto;
}
