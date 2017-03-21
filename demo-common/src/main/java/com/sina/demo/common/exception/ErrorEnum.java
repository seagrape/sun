package com.sina.demo.common.exception;


public enum ErrorEnum {
    SUCCESS(0, "success"),
    NOT_LOG_IN(1, "未登陆"),
    PERMISSION_DENIED(2, "权限不足"),


    FAILED(-1, "failed");

    private int code;
    private String message;

    private ErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
