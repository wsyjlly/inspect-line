package com.tyjw.inspectline.entity.pojo.facilities;

import lombok.Data;

import java.io.Serializable;

@Data
public class Point implements Serializable {
    private static final long serialVersionUID = 1L;

    private double lng;//经度
    private double lat;//维度

    public Point() {
    }

    public Point(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }
}
