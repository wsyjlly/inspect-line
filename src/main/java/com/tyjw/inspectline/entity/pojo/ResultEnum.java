package com.tyjw.inspectline.entity.pojo;

import org.springframework.http.HttpStatus;

public enum ResultEnum{
    SUCCESS(0, "操作成功"),
    FAIL(-1, "操作失败"),
    USER_LOGOUT_ERROR(-2, "异常退出登录"),
    PROJECT_NO_PERMISSIONS (-3, "项目权限不允许"),
    PARAMS_MISS_ERROR(400, "提交参数有问题，请核实"),
    SYS_SERVER_ERROR(500,"服务器内部错误，无法完成请求"),
    SMS_SEND_TOO_FAST(-250, "消息发送频率太快了"),
    REQUEST_HEADERS_ERROR(-3,"请求头信息不完整");

    private int value;
    private String message;

    private ResultEnum(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public int getValue() {
        return this.value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
