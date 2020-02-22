public class perfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int factorSum=0;

        for(int i=1; i<number; i++) {

            if(number % i == 0) {

                factorSum+=i;

            }

        }

        if(number == factorSum) {
            return true;
        }
        else {
            return false;
        }

    }

}
