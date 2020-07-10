package com.GabrielMolocea;

public class Main {

    public static void main(String[] args) {
//	int count = 1;
//	while (count != 6){
//        System.out.println("Count value is " + count);
//        count++;
//	}
////	count = 1;
////    while (true){
////        if (count == 6) {
////            break;
////        }
////        System.out.println("Count value is " + count);
////        count++;
////    }
//        count =0;
//    do {
//        System.out.println("Count value was " + count);
//        count++;
//    } while (count != 6);
        int number = 4;
        int finishNumber = 20;
        int countEnvenNumbers = 0;
            while (number <= finishNumber){
                number++;
                if (!isEvenNumber(number)){
                    continue;
                }
                System.out.println("Even number " + number);
                countEnvenNumbers++;
                if (countEnvenNumbers >= 5){
                    System.out.println("Total of even numbers found is " + countEnvenNumbers);
                    break;
                }
            }

    }
    public static boolean isEvenNumber(int number){
        if ((number % 2) == 0){
            return true;
        }
        return false;
    }
}
