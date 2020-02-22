public class minutesDaysYears {

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int years = (int) (minutes / (365 * 24 * 60));
            //System.out.println(years);
            int days = (int) ((minutes - years * (365 * 24 * 60)) / (24 * 60));

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

}
