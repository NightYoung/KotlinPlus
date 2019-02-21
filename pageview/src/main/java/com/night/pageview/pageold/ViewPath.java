package com.night.pageview.pageold;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: liuzhenfeng
 * @function: 设置Path的曲线信息，获取当前的坐标点
 * @date: 2019/1/21  13:39
 */
public class ViewPath {

    public static final int MOVE = 0;
    public static final int LINE = 1;
    public static final int QUAD = 2;
    public static final int CURVE = 3;

    private ArrayList<ViewPoint> mPoints;

    public ViewPath() {
        mPoints = new ArrayList<>();
    }

    public void moveTo(float x, float y) {
        mPoints.add(ViewPoint.moveTo(x, y, MOVE));
    }

    public void lineTo(float x, float y) {
        mPoints.add(ViewPoint.lineTo(x, y, LINE));
    }

    public void curveTo(float x, float y, float x1, float y1, float x2, float y2) {
        mPoints.add(ViewPoint.curveTo(x, y, x1, y1, x2, y2, CURVE));
    }

    public void quadTo(float x, float y, float x1, float y1) {
        mPoints.add(ViewPoint.quadTo(x, y, x1, y1, QUAD));
    }

    public Collection<ViewPoint> getPoints() {
        return mPoints;
    }

}
