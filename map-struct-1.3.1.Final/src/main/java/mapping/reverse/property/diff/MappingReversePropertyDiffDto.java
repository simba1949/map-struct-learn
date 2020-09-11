package mapping.reverse.property.diff;

import lombok.Data;

/**
 * @author Anthony
 * @date 2020/9/11 18:50
 */
@Data
public class MappingReversePropertyDiffDto {
    private String idDto;
    private String toDateDto;
    private String toLocalDateTimeDto;

    private String toEnum;
}
