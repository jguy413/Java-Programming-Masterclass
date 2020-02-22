public class lastDigit {

    public static boolean hasSameLastDigit(int val1, int val2, int val3) {

        if ((val1 < 10 || val1 > 1000) || (val2 < 10 || val2 > 1000) || (val3 < 10 || val3 > 1000)) {
            return false;
        }

        int count = 0;

        int val1_last = val1 % 10;
        int val2_last = val2 % 10;
        int val3_last = val3 % 10;

        if (val1_last == val2_last) {
            count++;
        }
        if (val2_last == val3_last) {
            count++;
        }
        if (val1_last == val3_last) {
            count++;
        }

        if (count >= 1 ) {
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean isValid(int val) {

        if (val < 10 || val > 1000) {
            return false;
        }

        return true;

    }

}
