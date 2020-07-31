package com.GabrielMolocea;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        if (width < 0){
            return 0;
        }
        return width;
    }

    public double getLength() {
        if (length < 0){
            return 0;
        }
        return length;
    }

    public double getArea(){
        if (this.width < 0 || this.length < 0){
            return 0;
        }
        return this.width * this.length;
    }
}
