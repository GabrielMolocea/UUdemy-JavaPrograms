package com.gabrielmolocea;

public class SIBTest {
    public static final String owner;
    
    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }
    
    public SIBTest() {
        System.out.println("SIB constructed called");
    }
    
    static {
        System.out.println("2end initialization block called");
    }
    public void someMethod(){
        System.out.println("someMethod called");
    }
}
