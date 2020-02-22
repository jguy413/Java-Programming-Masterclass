public class sharedDigit {

    public static boolean hasSharedDigit(int val1, int val2) {

        if(val1 < 10 || val1 > 99 | val2 < 10 || val2 > 99) {

            return false;
        }

        int count1 = 0;
        int dummy1 = val1;
        int lastDigit1 = 0;
        int lastDigit2 = 0;

        while (count1 < 2) {

            lastDigit1 = dummy1 % 10;
            int dummy2 = val2;
            int count2 = 0;

            while (count2 < 2) {

                lastDigit2 = dummy2 % 10;

                if (lastDigit1 == lastDigit2) {
                    return true;
                }

                dummy2 /= 10;
                count2++;

            }

            dummy1 /= 10;
            count1++;
        }
        return false;

    }

}
