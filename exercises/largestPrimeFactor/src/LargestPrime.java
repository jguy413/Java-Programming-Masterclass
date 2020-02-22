public class LargestPrime {

    public static int getLargestPrime(int number) {

        if(number <= 1) {
            return -1;
        }


        int largestPrime = -1;

        for(int i=number;i>=2;i--) {
            if (number % i == 0) {

                int check = 0;
                for (int j = i-1; j >= 2; j--) {
                    if (i % j == 0) {
                        check += 1;
                    }
                    if (check == 0 && j == 2) {
                        largestPrime = i;
                        break;
                    }
                }
            if(largestPrime != -1) {
                return largestPrime;
            }
            }
        }
        if(largestPrime==-1 && number % 2 == 0) {
            return 2;
        }
        return number;
    }


}
