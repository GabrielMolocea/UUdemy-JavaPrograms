package com.GabrielMolocea;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        if (height < 0 ){
            return 0;
        }
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}
