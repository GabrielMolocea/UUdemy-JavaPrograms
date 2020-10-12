package com.gabrielmolocea;

import java.util.*;

public class Example {
    
    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }
    private static int divide() {
        int x, y;
        try {
            x = getInt();
            y = getInt();
        } catch (NoSuchElementException exception) {
            throw  new ArithmeticException("no suitable input");
        }
        
        System.out.println("x is: " + x + ", y is: " + y);
        try {
            return x / y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by 0");
        }
    }
    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                //go round again. Read past the end of line in the input first
                scanner.nextLine();
                System.out.println("Please enter a number only using digits form 0 to 9");
            }
        }

    }
}
