package com.gabrielmolocea;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        
        if (languages.containsKey("Java")){
            System.out.println("Java already exists");
        } else {
           languages.put("Java", "a compiled high level, object-oriented, platform independent language");
           System.out.println("Java added successfully");
        }
        languages.put("Python", "an interpreted, object-oriented, high-level programing language with dynamic semantics");
        languages.put("Algol", " an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "There lies madness"));
        
        
        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java","this course is about Java");
        }
        
//        System.out.println(languages.get("Java"));
        System.out.println("************************");
        
//        languages.remove("Lisp");
        if (languages.remove("Algol"," an algorithmic language")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
    
        if (languages.replace("Lisp","There lies madness" ,"a functional programing languages with imperative")){
            System.out.println("Lisp replace");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala","this will not be added"));
        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
        
        
    }
}
