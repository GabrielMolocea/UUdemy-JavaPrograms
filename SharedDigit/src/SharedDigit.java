public class SharedDigit {
    public static boolean hasSharedDigit(int firstNUmber, int secondNumber){
        if ((firstNUmber <= 10 || firstNUmber >= 99) && (secondNumber <= 10 || secondNumber >= 99)){
            return false;
        }
        int originalSecondNumber = secondNumber;
        int firstNumberDigit = 0;
        int secondNumberDigit = 0;
        while ((firstNUmber != 0) ){
            int firstRemainder = firstNUmber % 10;
            while (secondNumber !=0){
                int secondRemainder = secondNumber % 10;
                if (firstRemainder == secondRemainder){
                    return true;
                }
                secondNumber /= 10;
            }
            secondNumber = originalSecondNumber;
            firstNUmber /=10;
        }
        return false;
    }
}
