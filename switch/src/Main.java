public class Main {

    public static void main(String[] arg) {
        int val = 1;
        if(val == 1) {
            System.out.println("Val = 1");
        }
        else if(val == 2) {
            System.out.println("Val = 2");
        }
        else {
            System.out.println("Val not 1 or 2");
        }

        int switchVal = 1;

        switch (switchVal) {
            case 1:
                System.out.println("switchVal = 1");
                break;
            case 2:
                System.out.println("switchVal = 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("It was a " + switchVal);
                break;
            default:
                System.out.println("switchVal not 1 or 2");
                break;
        }

        char switchChar = 'Z';
        switch (switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found.");
                break;
            default:
                System.out.println(switchChar + " not found");
                break;
        }

        printDayOfWeek(8);

    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }


}
