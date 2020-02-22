public class firstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int count = 0;
        int dummy = number;

        while (dummy >= 1) {

            int lastDigit = dummy % 10;
            dummy /= 10;
            if (count == 0 && dummy < 1) {
                sum += lastDigit*2;
                count ++;
            }
            else if (count == 0 || dummy < 1) {
                sum += lastDigit;
                count ++;
            }

        }
        return sum;
    }

}
