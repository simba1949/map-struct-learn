package multi.object;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 15:30
 */
@Data
public class MultiObject2OneDtoSecond {
    private Date birthdayDto;
    private LocalDateTime localDateTimeDto;
    private MultiObject2OneDtoDepth depthDto;
}
