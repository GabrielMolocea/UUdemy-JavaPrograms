public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number >= 0) {
            while (number != 0) {
                int even = number % 10;
                if (even % 2 == 0) {
                    sum += even;
                }
                number /= 10;

            }
            return sum;
        }
        return -1;
    }
}
