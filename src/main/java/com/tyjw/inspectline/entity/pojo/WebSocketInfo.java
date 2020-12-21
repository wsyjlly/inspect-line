package com.tyjw.inspectline.entity.pojo;

import java.io.Serializable;

public class WebSocketInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int state;//状态
    private int type;//数据类型
    private String message;//状态信息
    private T returnData;//返回数据

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getReturnData() {
        return returnData;
    }

    public void setReturnData(T returnData) {
        this.returnData = returnData;
    }
}
