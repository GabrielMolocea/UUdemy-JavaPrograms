package com.GabrielMolocea;

public class Tesla extends Car{
    private int roadServiceMonths;

    public Tesla(int roadServiceMonths) {
        super("4WD", "Tesla", 5, 5, 6, false, 0);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity =  getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
