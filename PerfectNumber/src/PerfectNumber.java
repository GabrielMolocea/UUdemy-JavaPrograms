public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int maxNumber = 1;
        int sum = 0;
        while (number != maxNumber) {
            if (number < 1) {
                return false;
            }
            if (number % maxNumber == 0) {
                sum +=maxNumber;
            }
            maxNumber++;
        }

        return sum == number;
    }

}