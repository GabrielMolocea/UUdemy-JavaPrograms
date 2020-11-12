package com.gabrielmolocea;

/** Created by Gabriel on 12/11/2020*/

public class SharedResource {
    
    private Worker owner;
    
    public SharedResource(Worker owner) {
        this.owner = owner;
    }
    
    public Worker getOwner() {
        return owner;
    }
    
    public synchronized void setOwner(Worker owner) {
        this.owner = owner;
    }
}
