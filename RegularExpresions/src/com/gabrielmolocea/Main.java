package com.gabrielmolocea;

import java.util.regex.*;

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
    
        String secondAlphanumeric = "abcDeeeF12Ghhiiiijk99z";
        System.out.println(secondAlphanumeric.replaceAll("^abcDe{3}", "YYY")); // character{numbers} -> represents the total fo how many characters need to match in
                                                                                                // order to replace the string in this example is 3
        System.out.println(secondAlphanumeric.replaceAll("^abcDe+", "YYY")); // + -> character is looking for any characters, not a number of characters as {}
    
        System.out.println(secondAlphanumeric.replaceAll("^abcDe*", "YYY")); // * is looking for any characters in string
    
        System.out.println(secondAlphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
    
        System.out.println(secondAlphanumeric.replaceAll("h+i*j", "Y"));
        
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>THis is another paragraphs about something else.</p>");
        htmlText.append("<h2<Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");
        
        String h2Patten = ".+<h2>.*";
        Pattern pattern = Pattern.compile(h2Patten);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
    }
}
