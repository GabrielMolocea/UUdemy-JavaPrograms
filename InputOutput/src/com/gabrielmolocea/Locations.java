package com.gabrielmolocea;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer,Location> {
    
    private static Map<Integer,Location> locations = new HashMap<>();
    
    public static void main(String[] args) throws IOException {
        
        try(FileWriter locFile = new FileWriter("locations.txt")) {
            for (Location location : locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
            }
        }

//        FileWriter localFile = null;
//        try {
//            localFile = new FileWriter("locations.txt");
//            for (Location location : locations.values()) {
//                localFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//            }
//            localFile.close();
//        } finally {
//            System.out.println("In finally block");
//            if (localFile != null) {
//                System.out.println("Attempting to close yhe localFile");
//                localFile.close();
//            }
//        }

    }
    
    static {
        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));
    
        //First room in the mini game
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
    
        //Second room in the mini game
        tempExit = new HashMap<>();
        tempExit.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
    
        //Third room in the mini game
        tempExit = new HashMap<>();
        tempExit.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring ",tempExit));
    
        //Fourth room in the mini game
        tempExit = new HashMap<>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
    
        //Five room in the mini game
        tempExit = new HashMap<>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));
    }
    @Override
    public int size() {
        return locations.size();
    }
    
    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }
    
    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }
    
    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }
    
    @Override
    public Location get(Object key) {
        return locations.get(key);
    }
    
    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key,value);
    }
    
    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }
    
    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {
    
    }
    
    @Override
    public void clear() {
        locations.clear();
    }
    
    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }
    
    @Override
    public Collection<Location> values() {
        return locations.values();
    }
    
    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}