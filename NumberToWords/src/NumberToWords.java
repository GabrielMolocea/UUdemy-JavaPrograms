public class NumberToWords {
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        for (int x =1 ; x <= getDigitCount(number); x++){
            int lastDigit = reversedNumber % 10;
            reversedNumber /= 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number){
        int reversedNumber = 0;
        do {
            int x = number % 10;
            reversedNumber = reversedNumber * 10;
            reversedNumber += x;
            number /= 10;
        }
        while (number != 0);
        return reversedNumber;
    }

    public static  int getDigitCount (int number){
        if (number < 0){
            return  -1;
        } else if (number == 0){
            return 1;
        }
        int countedDigits = 0;
        for (int x = number; number != 0; number/= 10){
            countedDigits++;
        }
        if (countedDigits > 0){
            return countedDigits;
        } else {
            System.out.println("1");
            return 1;
        }
    }
}
