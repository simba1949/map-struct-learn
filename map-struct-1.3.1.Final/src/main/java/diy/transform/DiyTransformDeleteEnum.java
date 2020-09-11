package diy.transform;

/**
 * @author Anthony
 * @date 2020/9/11 16:52
 */
public enum DiyTransformDeleteEnum {
    DELETE_NO(0, "未删除"),
    DELETE_YES(1, "已删除")
    ;

    private Integer code;
    private String desc;

    public static DiyTransformDeleteEnum getDeleteEnumByCode(int code){
        for (DiyTransformDeleteEnum anEnum : DiyTransformDeleteEnum.values()) {
            if (code == anEnum.code){
                return anEnum;
            }
        }
        throw new RuntimeException("获取不到对应的枚举类型");
    }

    DiyTransformDeleteEnum(Integer code, String desc) {
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

    @Override
    public String toString() {
        return "DiyTransformDeleteEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
