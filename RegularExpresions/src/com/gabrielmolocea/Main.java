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
        
        
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
    
        String newAlphanumeric = "abcDeeeF12Ghhiiiijk99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X")); // when using ^ inside [] is a character class
    
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X")); // (?i) ignores case sensitivity and for unicode is (?iu)
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));// \\d replaces all numbers in string
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));// \\D replaces all characters in String
        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", "")); // \\s removes all whitespaces
        System.out.println(hasWhitespace.replaceAll("\t", "x"));
        System.out.println(hasWhitespace.replaceAll("\\S", "")); // \\S removes all non-whitespaces only tabs, spaces and newline characters remain
    
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));// \\x matches a-z,0-9,A-Z and _ //W matches all except \\w function
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));
    }
}
