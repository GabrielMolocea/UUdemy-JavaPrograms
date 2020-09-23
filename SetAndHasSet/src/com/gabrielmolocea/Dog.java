package com.gabrielmolocea;

public class Dog {
    private final String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public final boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        
        if (obj instanceof Dog){
            String onjName= ((Dog) obj).getName();
            return this.name.equals(onjName);
        }
        
        return false;
    }
}
