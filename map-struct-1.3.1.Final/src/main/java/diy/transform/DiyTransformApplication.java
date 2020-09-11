package diy.transform;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 16:45
 */
public class DiyTransformApplication {
    public static void main(String[] args) {
        DiyTransformDto dto = new DiyTransformDto();
        dto.setIntDto("9");
        dto.setBooleanDto("true");
        dto.setDateDto("2020-01-01 14:00:00");
        dto.setLocalDateTimeDto("2020-02-02 14:00:00");
        dto.setUserIntDto("7");
        dto.setUserStringDto("username");

        dto.setEnumDto("1");

        dto.setLocalDateTime2DateDto(LocalDateTime.now());
        dto.setDate2LocalDateTimeDto(new Date());

        DiyTransformVo vo = DiyTransformMapper.INSTANCE.dto2Vo(dto);
        System.out.println(vo);
    }
}
