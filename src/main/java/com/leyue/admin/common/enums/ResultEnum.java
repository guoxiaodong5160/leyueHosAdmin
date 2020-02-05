package com.leyue.admin.common.enums;

public enum ResultEnum {
    SUCCESS(0, "成功"),
    USER_NOT_EXIST(1, "失败"),
    UNKNOWN_ERROR(-1, "未知错误");;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
