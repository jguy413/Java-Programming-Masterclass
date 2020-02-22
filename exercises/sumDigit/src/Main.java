public class Main {

    public static void main(String[] args) {

        int testNum = 10;
        System.out.println("Sum of digits in " + testNum + " = " + sumDigits(testNum));


    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        else {
            int sum = 0;
            if (number == 10) {
                return 1;
            }
            while (number % 10 >= 1) {
                int n = number % 10;
                sum += n;
                number = number / 10;
            }
            return sum;
        }

    }

}
