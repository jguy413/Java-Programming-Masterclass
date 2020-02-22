public class Main {

    public static void main(String[] args) {

        //System.out.println("10,000 at 2% interest = $" + calculateInterest(10000, 2));

        for (double i=2; i<3; i+=.1) {
            //System.out.println("$10,000 at " + String.format("%.2f", i) + "% interest = $" + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("");

        for (double i=8; i>1; i--) {
            //System.out.println("$10,000 at " + String.format("%.2f", i) + "% interest = $" + String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;
        for (int j = 10; j < 50 ; j++) {
            //check if prime
            if (isPrime(j)) {
                System.out.println(j + " is a prime number.");
                count++;
            }
            //exit loop if we have found 3 primes
            if (count == 10) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return  true;
    }




    public static double calculateInterest(double amount, double interestRate) {

        return (amount*(interestRate/100));

    }

}
