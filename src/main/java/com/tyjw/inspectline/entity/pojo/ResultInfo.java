package com.tyjw.inspectline.entity.pojo;
import com.tyjw.inspectline.entity.pojo.ResultEnum;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer state = 0;
    private String message;
    private int hasNext;
    private long total;
    private T returnData;

    public ResultInfo() {
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public ResultInfo(ResultEnum re) {
        this.state = re.getValue();
        this.message = re.getMessage();
    }

    public ResultInfo setResultEnum(ResultEnum re){
        this.state = re.getValue();
        this.message = re.getMessage();
        return this;
    }

}
