public class FactorPrinter {
    public static void printFactors(int number){

        int maxNumber = 1;

        while ((number+1) != maxNumber){
            if (number < 1) {
                System.out.println("Invalid Value");
                break;
            }
            if (number % maxNumber ==0){
                System.out.println(maxNumber);
            }
            maxNumber++;
        }
    }
}
