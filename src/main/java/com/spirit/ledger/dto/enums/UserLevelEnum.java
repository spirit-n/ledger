package com.spirit.ledger.dto.enums;

public enum UserLevelEnum {
    USER("USER","普通用户", "1"),
    ADMIN("ADMIN","管理员", "2");

    private String code;
    private String desc;
    private String value;

    UserLevelEnum(String code, String desc, String value) {
        this.code = code;
        this.desc = desc;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
