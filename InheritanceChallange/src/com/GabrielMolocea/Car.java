package com.GabrielMolocea;

public class Car extends Vehicle {

    private int wheels;
    private int door;
    private int gear;
    private boolean isManual;

    private int currentGear;

    public Car(String size, String name, int wheels, int door, int gear, boolean isManual, int currentGear) {
        super(size, name);
        this.wheels = wheels;
        this.door = door;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear");
    }
    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed,direction);
    }


}
