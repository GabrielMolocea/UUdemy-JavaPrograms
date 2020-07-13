public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first,int second) {

        if(first<10 || second<10) {

            return -1;

        }

        int max = 0,gcd1=0,gcd2=0;

        for(int i=1;i<=first;i++) {

            if(first%i == 0) {

                gcd1 = i;

            }

            if(second%i == 0) {

                gcd2 = i;

            }

            if(gcd1 == gcd2) {

                if(max<gcd1) {

                    max = gcd1;

                }

            }

        }

        return max;

    }

}     