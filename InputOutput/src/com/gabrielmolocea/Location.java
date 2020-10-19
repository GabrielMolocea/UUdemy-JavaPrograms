package com.gabrielmolocea;

import java.io.*;
import java.util.*;

public class Location implements Serializable {
    private final int locationID;
    private final String description;
    private final Map<String,Integer> exits;
    
    // Using Serializable interface in mandatory to add serialVersionUID as long and attributing a serial
    // In this case we will attribute 1 as is the first serial we are using
    
    private long serialVersionUID = 1L;
    
    public Location(int locationID, String description, Map<String,Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
            this.exits = new LinkedHashMap<>(exits);
        } else {
            this.exits = new LinkedHashMap<>();
        }
        this.exits.put("Q",0);
    }
    
    public int getLocationID() {
        return locationID;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Map<String, Integer> getExits() {
        return new LinkedHashMap<>(exits);
    }
    
    protected void addExit(String description, int locationID) {
        exits.put(description,locationID);
    }
}
