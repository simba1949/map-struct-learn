package diy.transform.handler;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 18:01
 */
public class DateTransformHandler {

    public static Date localDateTime2Date(LocalDateTime localDateTime){
        if (null == localDateTime){
            throw new RuntimeException("");
        }
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDateTime date2LocalDateTime(Date date){
        if (null == date){
            throw new RuntimeException("");
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
