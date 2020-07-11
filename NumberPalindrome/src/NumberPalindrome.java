public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0, lastDigit;
        int positiveNumber = Math.abs(number);
        int savedNumber = positiveNumber;
        while (positiveNumber != 0){
            lastDigit = positiveNumber % 10;
            reverse = reverse * 10 + lastDigit;
            positiveNumber /= 10;
        }
        return savedNumber == reverse;
    }
}

