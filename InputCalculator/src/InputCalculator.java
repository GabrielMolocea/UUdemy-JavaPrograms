import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0 ;


        while (true){
            //System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                break;
            }
//            scanner.nextLine();

        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)(sum) / (double)(count)));


        scanner.close();

    }
}
