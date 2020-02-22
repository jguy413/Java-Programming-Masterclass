public class barkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        else if ((barking) && (8 > hourOfDay || 22 < hourOfDay )) {
            return true;
        }
        return false;
    }
}
