package diy.transform;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 16:43
 */
@Data
public class DiyTransformDto {
    private String intDto;
    private String booleanDto;
    private String dateDto;
    private String localDateTimeDto;
    private String userIntDto;
    private String userStringDto;

    private String enumDto;

    private Date date2LocalDateTimeDto;
    private LocalDateTime localDateTime2DateDto;
}
