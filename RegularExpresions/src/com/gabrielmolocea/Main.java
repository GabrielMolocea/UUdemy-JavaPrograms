package com.gabrielmolocea;

public class Main {

    public static void main(String[] args) {
	    String string = "I am a string. Yes I am."; // Simplest regular expression is a regular string
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);
        
        String alphanumeric = "abcDeeeF12Ghhiiiijk99z";
        System.out.println(alphanumeric.replaceAll(".", "Y")); // . is use for all the string
    
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY")); // ^ -> Is use at the beginning of the String
    
    
        String secondString = "abcDeeeF12GhhiabcDeeeiiijk99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));
    
        System.out.println(alphanumeric.matches("^hello"));
        
        System.out.println(alphanumeric.matches("^abcDeee"));
    
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijk99z"));
    
        System.out.println(alphanumeric.replaceAll("iijk99z$", "THE END")); // $ -> Signify the end of the String
    
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));// [] -> replaces only the letters or characters in square bracts
        System.out.println(alphanumeric.replaceAll("[aei]", "I replace the later here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
        
    }
}
