package com.GabrielMolocea;

public class Circle {
    private double radius;

    public Circle(double radius){
        if (radius < 0){
            this.radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        if (radius < 0){
            radius = 0;
    }
        return radius;
    }

    public double getArea(){
        if (radius < 0){
            return 0;
        }
        return ( radius * radius * Math.PI);
    }
}
