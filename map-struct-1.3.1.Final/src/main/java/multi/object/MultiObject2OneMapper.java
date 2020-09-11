package multi.object;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Anthony
 * @date 2020/9/11 15:30
 */
@Mapper
public interface MultiObject2OneMapper {

    MultiObject2OneMapper INSTANCE = Mappers.getMapper(MultiObject2OneMapper.class);

    @Mapping(source = "first.idDto", target = "idVo")
    @Mapping(source = "first.ageDto", target = "ageVo")
    @Mapping(source = "first.priceDto", target = "priceVo")
    @Mapping(source = "second.birthdayDto", target = "birthdayVo")
    @Mapping(source = "second.localDateTimeDto", target = "localDateTimeVo")
    @Mapping(source = "second.depthDto.enableDto", target = "enableVo")
    MultiObject2OneVo dto2Vo(MultiObject2OneDtoFirst first, MultiObject2OneDtoSecond second);
}
