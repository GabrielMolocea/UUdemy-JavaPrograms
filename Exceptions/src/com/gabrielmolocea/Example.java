package com.gabrielmolocea;

import java.util.*;

public class Example {
    
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException exception) {
            System.out.println(exception.toString());
            System.out.println("Unable to perform division, auto-pilot shouting down");
        }

    }
    private static int divide() {
        int x, y;
//        try {
            x = getInt();
            y = getInt();
            System.out.println("x is: " + x + ", y is: " + y);
            return x / y;
//        } catch (NoSuchElementException exception) {
//            throw  new NoSuchElementException("No suitable input");
//        } catch (ArithmeticException exception) {
//            throw new ArithmeticException("Attempt to divide by 0");
//        }
        
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
