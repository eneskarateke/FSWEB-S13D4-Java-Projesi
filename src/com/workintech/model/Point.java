package com.workintech.model;

//INPUT
//        Point first = new Point(6, 5);
//
//        Point second = new Point(3, 1);
//
//        System.out.println("distance(0,0)= " + first.distance());
//
//        System.out.println("distance(second)= " + first.distance(second));
//
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//
//        Point point = new Point(0,0);
//
//        System.out.println("distance()= " + point.distance());
//
//
//        OUTPUT
//        distance(0,0)= 7.810249675906654
//
//        distance(second)= 5.0
//
//        distance(2,2)= 5.0
//
//        distance()= 0.0

public class Point {

    private int x;


    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance() {
        return Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
    }


    public double distance(int a, int b) {
        return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
    }


    public double distance(Point p) {
        if (p != null) {
            return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        }
        return distance();

    }
}