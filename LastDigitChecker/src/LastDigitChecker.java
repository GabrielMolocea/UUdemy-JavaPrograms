public class LastDigitChecker {

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {

        if (!(isValid(n1) && isValid(n2) && isValid(n3))) {

            return false;

        }

        int rem1 = n1 % 10;

        int rem2 = n2 % 10;

        int rem3 = n3 % 10;

        if ((rem1 == rem2) || (rem2 == rem3) || (rem3 == rem1)) {

            return true;

        }

        return false;

    }


    public static boolean isValid(int n) {

        if (n < 10 || n > 1000)

            return false;

        else {

            return true;

        }

    }

}