package diy.transform;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 16:44
 */
@Data
public class DiyTransformVo {
    private Integer intVo;
    private Boolean booleanVo;
    private Date dateVo;
    private LocalDateTime localDateTimeVo;
    private DiyTransformUserVo userVo;

    private DiyTransformDeleteEnum enumVo;

    private LocalDateTime date2LocalDateTimeVo;
    private Date localDateTime2DateVo;
}
