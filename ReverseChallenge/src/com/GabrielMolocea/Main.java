package com.GabrielMolocea;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] test = {5,4,3,2,1};
        System.out.println("Array = " + Arrays.toString(test));

        Reverse.reverse(test);
        System.out.println("Reverse array = " + Arrays.toString(test));
    }
}
