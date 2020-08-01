package com.GabrielMolocea;

public class Car extends Vehicle {
    private int door;
    private int engineCapacity;

    public Car(String color, int door, int engineCapacity) {
        super(color);
        this.door = door;
        this.engineCapacity = engineCapacity;
    }
}
