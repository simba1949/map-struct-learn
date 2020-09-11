package mapping.reverse.property.diff;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 18:50
 */
@Data
public class MappingReversePropertyDiffVo {
    private Integer idVo;
    private Date toDateVo;
    private LocalDateTime toLocalDateTimeVo;

    private MappingReversePropertyDiffEnum anEnum;
}
