package com.gabrielmolocea;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, Location> location = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        location.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        location.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        location.put(2, new Location(2, "You are at the top of a hill"));
        location.put(3, new Location(3, "You are inside a building, a well house for a small spring "));
        location.put(4, new Location(4, "You are in a valley beside a stream"));
        location.put(5, new Location(5, "You are in the forest"));
        
        //First room in the mini game
        location.get(1).addExit("W",2);
        location.get(1).addExit("E",3);
        location.get(1).addExit("S",4);
        location.get(1).addExit("N",5);
//        location.get(1).addExit("Q",0);
    
        //Second room in the mini game
        location.get(2).addExit("N",5);
//        location.get(2).addExit("Q",0);
    
        //Third room in the mini game
        location.get(3).addExit("W",1);
//        location.get(3).addExit("Q",0);
        
        //Fourth room in the mini game
        location.get(4).addExit("N",1);
        location.get(4).addExit("W",2);
//        location.get(4).addExit("Q",0);
        
        //Five room in the mini game
        location.get(5).addExit("S",1);
        location.get(5).addExit("W",2);
//        location.get(5).addExit("Q",0);
        
        int loc =1;
        while (true){
            System.out.println(location.get(loc).getDescription());
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
