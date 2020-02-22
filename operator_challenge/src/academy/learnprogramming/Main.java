package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // 1. create a double variable with a value of 20.00
        double val1 = 20.00d;
        //System.out.println("Value 1: " + val1);

        // 2. create a double variable with a value of 80.00
        double val2 = 80.00d;
        //System.out.println("Value 2: " + val2);

        // 3. add both numbers together and multiple by 100.00
        double result1 = 100.00*(val1 + val2);
        //System.out.println("Result of operation on val1 & val2: " + result1);

        // 4. find remainder of result1 and 40.00
        double remainder1 = result1 % 40.00;
        //System.out.println("Remainder of result1 and 40.00: " + remainder1);

        // 5. create boolean to say true if remainder==0, else false
        boolean equals0 = (remainder1 == 0) ? true : false; // remainder1 == 0
        // 6. Output boolean
        System.out.println("Remainder Equals Zero? " + equals0);

        // 7. if/then to say "Got some remainder" if equals0 is NOT true
        if (equals0 != true) {
            System.out.println("Got some remainder.");
        }


    }
}
