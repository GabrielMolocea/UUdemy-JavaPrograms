package com.gabrielmolocea;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, Location> location = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, Integer> tempExit = new HashMap<>();
        location.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));
        
        //First room in the mini game
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        location.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
    
        //Second room in the mini game
        tempExit = new HashMap<>();
        tempExit.put("N",5);
        location.put(2, new Location(2, "You are at the top of a hill",tempExit));

        //Third room in the mini game
        tempExit = new HashMap<>();
        tempExit.put("W",1);
        location.put(3, new Location(3, "You are inside a building, a well house for a small spring ",tempExit));
    
        //Fourth room in the mini game
        tempExit = new HashMap<>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        location.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
    
        //Five room in the mini game
        tempExit = new HashMap<>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        location.put(5, new Location(5, "You are in the forest",tempExit));
    
        Map<String,String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("WEST","W");
        vocabulary.put("EAST","E");
        
        int loc =1;
        while (true){
            System.out.println(location.get(loc).getDescription());
            tempExit.remove("S");
            if (loc == 0){
                break;
            }
            Map<String,Integer> exits = location.get(loc).getExits();
            System.out.println("Available exits are ");
            for (String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();
            
            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() >1){
                String[] words = direction.split(" ");
                for (String word: words){
                    if (vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            
            if (exits.containsKey(direction)){
                loc =exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
           }
//            loc = scanner.nextInt();
//            if (!location.containsKey(loc)){
//                System.out.println("You cannot go in that direction");
//            }
        }
    }
}
