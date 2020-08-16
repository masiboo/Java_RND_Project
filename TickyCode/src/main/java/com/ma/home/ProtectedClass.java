package com.ma.home;

class Point {
    protected int x, y;

    public Point(){

    }

    public Point(int _x, int _y) {
        x = _x;
        y = _y;
    }
}
public class ProtectedClass {
    public static void main(String args[]) {
        Point p = new Point();
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}
