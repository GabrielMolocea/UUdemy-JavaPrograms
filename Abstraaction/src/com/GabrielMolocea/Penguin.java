package com.GabrielMolocea;

public class Penguin extends Bird {
    
    public Penguin(String name) {
        super(name);
    }
    
    @Override
    public void fly() {
        System.out.println("I'm bot very good at that, i can swim instead");
    }
}
