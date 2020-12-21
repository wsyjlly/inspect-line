package com.tyjw.inspectline.entity.pojo.facilities;

import java.io.Serializable;
import java.util.List;

public class Marker implements Serializable {
    private static final long serialVersionUID = 1L;

    private String icon;//图标
    private String color;//颜色
    private List<Point> points;//点集合

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}

