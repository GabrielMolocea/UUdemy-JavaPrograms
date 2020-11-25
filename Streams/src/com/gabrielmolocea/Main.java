package com.gabrielmolocea;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");
        
        someBingoNumbers
                .stream()
                .map(String::toUpperCase) // map(Accepts a argument and can us String::toUpperCase in case of lambda)
                .filter(s -> s.startsWith("G")) // filter accepts a function
                .sorted()
                .forEach(System.out::println); //forEach in called a terminal operation
    
        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36",  "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("----------------------------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());
        
        
//        List<String> gNumbers = new ArrayList<>();
//        someBingoNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((s1, s2) -> s1.compareTo(s2));
//        gNumbers.forEach(s -> System.out.println(s));
    }
}
