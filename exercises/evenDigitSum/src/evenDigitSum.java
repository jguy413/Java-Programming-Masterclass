public class evenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;
        int sum = 0;
        int lastDigit = 0;
        int dummy = number;

        while (dummy >= 1) {

            lastDigit = dummy % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }

            dummy /= 10;
        }
        return sum;
    }

}
