package multi.object;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Anthony
 * @date 2020/9/11 15:29
 */
public class MultiObject2OneApplication {
    public static void main(String[] args) {
        MultiObject2OneDtoFirst first = new MultiObject2OneDtoFirst();
        first.setIdDto("id");
        first.setAgeDto(18);
        first.setPriceDto(BigDecimal.TEN);

        MultiObject2OneDtoDepth depth = new MultiObject2OneDtoDepth();
        depth.setEnableDto(true);
        MultiObject2OneDtoSecond second = new MultiObject2OneDtoSecond();
        second.setBirthdayDto(new Date());
        second.setLocalDateTimeDto(LocalDateTime.now());
        second.setDepthDto(depth);

        MultiObject2OneVo vo = MultiObject2OneMapper.INSTANCE.dto2Vo(first, second);
        System.out.println(vo);
    }
}
