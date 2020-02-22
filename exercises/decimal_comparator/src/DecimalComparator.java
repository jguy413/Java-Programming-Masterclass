public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double entry1, double entry2) {
        if(((int) (entry1 * 1000)) == (((int) (entry2 * 1000)))) {
            //System.out.println(((int) entry1) * 1000);
            return true;
        }
        return false;
    }
}
