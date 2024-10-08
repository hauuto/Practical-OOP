/*
 * @ (#) Point.java       1.0      9/3/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai02;

/**
 * @description: This class is used to manage information of a point
 * This class is inherited from iuh.fit.bai01.Point
 * This class will add some methods to calculate the distance from O(0,0) to the point and negate the point
 * This class will override the toString method to display the information of the point
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/3/2024 10:49 PM
 */
public class Point extends iuh.fit.bai01.Point {


    //Constructors

    //Default constructor
    public Point() {
        super();
    }
    public Point(String name, double x, double y){
        super(name, x, y);
    }


    //Methods

    //This methods will return the distance from O(0,0) to the point
    public double getDistance(Point p){
        return Math.sqrt(Math.pow(-p.getX(),2) + Math.pow(-p.getY(),2));
    }

    public Point negate(){
        return new Point(getName(), -getX(), -getY());
    }

    @Override
    public String toString(){
        return String.format("%s(%.1f, %.1f)\t\t%.2f\t\t\t%s(%.1f,%.1f)", getName(), getX(), getY(), getDistance(this), negate().getName(), negate().getX(), negate().getY());
    }
}
