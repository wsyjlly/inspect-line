package com.tyjw.inspectline.geo;

import com.vividsolutions.jts.algorithm.PointLocator;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.operation.buffer.BufferOp;

import java.util.ArrayList;
import java.util.List;

public class GeoUtils {

    public static List<Point> queryBuffer(List<Point> points, int distance) {
        if (points != null && points.size() > 1) {
            Geometry bg = queryGeometry(points, distance);
            Coordinate[] coordinates = bg.getCoordinates();
            List<Point> pointList = new ArrayList<>();
            Point point = null;
            for (int i = 0; i < coordinates.length; i++) {
                point = new Point(coordinates[i].x, coordinates[i].y);
                pointList.add(point);
            }
            return pointList;
        }
        return new ArrayList<>();
    }


    /**
     * 创建缓冲区
     *
     * @param points
     * @param distance
     * @return
     */
    public static Geometry queryGeometry(List<Point> points, int distance) {
        if (points != null && points.size() > 1) {
            //创建一条直线
            Coordinate[] coordinates = new Coordinate[points.size()];
            for (int i = 0; i < points.size(); i++) {
                Point point = points.get(i);
                coordinates[i] = new Coordinate(point.getLng(), point.getLat());
            }
            GeometryFactory gf = new GeometryFactory();
            Geometry gfLineString = gf.createLineString(coordinates);
            double degree = distance / (2 * Math.PI * 6371004) * 360;
            //缓冲区建立
            BufferOp bufOp = new BufferOp(gfLineString);
            bufOp.setEndCapStyle(BufferOp.CAP_BUTT);
            Geometry geometry = bufOp.getResultGeometry(degree);
            return geometry;
        }
        return null;
    }

    /**
     * 判断点在不在缓冲区内
     *
     * @param lng 经度
     * @param lat 维度
     * @param bg  缓冲区
     * @return
     */
    public static boolean intersects(double lng, double lat, Geometry bg) {
        Coordinate point = new Coordinate(lng, lat);
        PointLocator a = new PointLocator();
        boolean success = a.intersects(point, bg);
        return success;
    }

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(116.389667, 39.911919));
        points.add(new Point(116.400053, 39.924031));
        points.add(new Point(116.407863, 39.919028));
        List<Point> pointList = queryBuffer(points, 200);
        System.out.println(pointList.size());
    }
}
