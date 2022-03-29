package com.company;

public class Main {

    public static void main(String[] args) {
        // Kiem thu 2 tham so:
        Point2D point2D = new Point2D();
        point2D.setX(15.5f);
        point2D.setY(3f);
        for (float e1 : point2D.getXY()) {
            System.out.println(e1);
        }
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(17.7f, 44.4f);
        for (float e2 : point2D1.getXY()) {
            System.out.println(e2);
        }
        System.out.println(point2D1);
        // Kiem thu 3 tham so :
        Point3D point3D = new Point3D();
        point3D.setXYZ(-1.4f, 32.5f, 4f);
        for (float e3 : point3D.getXYZ()) {
            System.out.println(e3);
        }System.out.println(point3D);
    }
}