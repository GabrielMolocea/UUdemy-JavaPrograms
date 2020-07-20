import java.util.Scanner;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

//        boolean first = true;

        while (true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();

//                if (first){ // flag for first number
//                            // associate min and max to current number
//                    first = false;
//                    minNumber = number;
//                    maxNumber = number;
//                }
                    if (number > maxNumber){
                        maxNumber = number;
                    }

                    if (number < minNumber){
                        minNumber = number;
                    }
            } else {
                break;
            }
            scanner.nextLine(); //handle input
        }
        System.out.println("Minimum = " + minNumber + ", max= " + maxNumber);

        scanner.close();
    }
}
