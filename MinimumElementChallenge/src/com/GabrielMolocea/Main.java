package com.GabrielMolocea;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
    }

    public int[] redIntegers(int count){
        int[] array = new int[count];
        for (int i =0; i < array.length; i++){
            System.out.println("Enter a number:\r");
            int num = scanner.nextInt();
            scanner.nextLine();
            array[i] = num;
        }
        return array;
    }
}
