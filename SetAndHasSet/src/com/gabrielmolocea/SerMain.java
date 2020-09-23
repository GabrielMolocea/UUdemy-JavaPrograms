package com.gabrielmolocea;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SerMain {
    public static void main(String[] args) {
        Set<Integer> sequares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();
        
        for (int i =1; i<= 100;i++){
            sequares.add(i*i);
            cubes.add(i*i*i);
        }
    
        System.out.println("There are " + sequares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(sequares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements");
        
        Set<Integer> intersection = new HashSet<>(sequares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");
        for (int i : intersection){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }
        Set<String> word = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        word.addAll(Arrays.asList(arrayWords));
        
        for (String s : word){
            System.out.println(s);
        }
        
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] arrayNatureWords = {"all","nature","is","but","art","unknown","to","three"};
        nature.addAll(Arrays.asList(arrayNatureWords));
        
        
        String[] arrayDivineWords = {"to","err","is","human","to","forgive","divine"};
        divine.addAll(Arrays.asList(arrayDivineWords));
    
    
    }
}
