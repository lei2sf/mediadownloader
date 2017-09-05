package com.yang.downloader.enums;

/**
 * @author yangl
 * @Description
 * @date 2017/9/4.
 */
public enum CoreExceptionEnum {
    REQUEST_SUCCESS("200","请求成功"),
    SYSTEM_EXCEPTION("-1","系统异常");

    private String code;
    private String msg;

    CoreExceptionEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
