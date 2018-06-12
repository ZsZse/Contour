package com.mobile.strigoy.myapplication.utility;

import android.graphics.PointF;

public class Line {
    public int id;
    public PointF[] p; //point 2D
    public int pointCount = -1;
    public int limit=10000;
    public boolean[] breakOn; //breaking Line

    public Line() {
        p = new PointF[limit+1];
        breakOn =new boolean[limit+1];
        for(int i=0;i<limit+1;i++) breakOn[i]=false;
    }
}
