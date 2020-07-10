public class DigitSum {
    public static int sumDigits(int number){

        if(number <= 10){
            return -1;
        }

        int sum = 0;

        while (number > 0){
//            extract the last-significant digit
            int digit  = number % 10;
            sum += digit;
            System.out.println("sum is " +sum);

//            drop the last-significant digit
            number /= 10;
            System.out.println("number is " +number);

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits in  number 125 is " + sumDigits(125));
    }
}
