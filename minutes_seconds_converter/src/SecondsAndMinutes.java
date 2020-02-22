public class SecondsAndMinutes {

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3728));

    }

    private static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid Parameters";
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid Parameters";
        }

        int hours = minutes / 60;
        String hourString = "" + hours;
        if (hours == 0) {
            hourString = "00";
        } else if (hours > 0 && hours <= 9) {
            hourString = "0" + hours;
        }

        minutes = minutes % 60;
        String minuteString = "" + minutes;
        if (minutes == 0) {
            minuteString = "00";
        } else if (minutes > 0 && minutes <= 9) {
            minuteString = "0" + minutes;
        }

        String secondString = "" + seconds;
        if (seconds == 0) {
            secondString = "00";
        } else if (seconds > 0 && seconds <= 9) {
            secondString = "0" + seconds;
        }

        String output = hourString + "h " + minuteString + "m " + secondString + "s";
        return output;
    }
}
















//        if(minutes >= 0 && minutes <= 9); {
//            boolean smallmin = true;
//        }
//        boolean smallmin = false;
//
//        if(seconds >= 0 && seconds <= 9); {
//            boolean smallsec = true;
//        }
//        boolean smallsec = false;
//
//        if((minutes / 60 >= 0) && (minutes / 60 <= 9)); {
//            boolean smallhour = true;
//        }
//        boolean smallhour = false;
//
//        if((minutes < 0) || ((seconds < 0) || (seconds > 59)))  {
//            return "Invalid Parameters";
//        }
//        else {
//            int hours = minutes / 60;
//            minutes = minutes % 60;
//            if(smallhour && smallmin && smallsec) {
//                return "0" + hours + "h 0" + minutes + "m 0" + seconds + "s";
//            }
//            else if (smallhour && smallmin && !smallsec) {
//                return "0" + hours + "h " + " 0" + minutes + "m " + seconds + "s";
//            }
//            else if (smallhour && !smallmin && smallsec) {
//                return "0" + hours + "h " + minutes + "m 0" + seconds + "s";
//            }
//            else if (smallhour && !smallmin && !smallsec) {
//                return "0" + hours + "h " + minutes + "m " + seconds + "s";
//            }
//            else if (!smallhour && smallmin && !smallsec) {
//                return hours + "h 0" + minutes + "m " + seconds + "s";
//            }
//            else if (!smallhour && !smallmin && smallsec) {
//                return hours + "h " + minutes + "m 0" + seconds + "s";
//            }
//            else {
//                return hours + "h " + minutes + "m " + seconds + "s";
//            }
//
//        }
//
//    }
//
//}
