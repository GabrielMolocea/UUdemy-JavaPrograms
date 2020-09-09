package com.gabrielmolocea;

public class SomeClass {
    
    private static int calssCounter =0;
    public final int instanceNumber;
    private final String name;
    
    public SomeClass(String name) {
        this.name = name;
        calssCounter++;
        instanceNumber = calssCounter;
        System.out.println(name +" created, instance is " + instanceNumber);
    }
    
    public int getInstanceNumber() {
        return instanceNumber;
    }
}
