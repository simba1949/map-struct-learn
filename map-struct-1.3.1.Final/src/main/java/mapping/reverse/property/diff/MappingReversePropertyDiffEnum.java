package mapping.reverse.property.diff;

/**
 * @author Anthony
 * @date 2020/9/11 19:02
 */
public enum MappingReversePropertyDiffEnum {
    YES(1, "YES"),
    NO(0, "NO"),
    ;

    public static MappingReversePropertyDiffEnum getEnumByCode(Integer code){
        for (MappingReversePropertyDiffEnum anEnum : MappingReversePropertyDiffEnum.values()) {
            if (code == anEnum.code){
                return anEnum;
            }
        }
        throw new RuntimeException("");
    }


    private Integer code;
    private String desc;

    MappingReversePropertyDiffEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
