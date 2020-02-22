import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(true) {
            //System.out.println("Enter Number");
            boolean isInt = scanner.hasNextInt();

            if(isInt) {
                int number = scanner.nextInt();

                sum+=number;
                count+=1;

            }
            else {
                break;
            }
        }

        if(count==0) {
            System.out.println("SUM = 0 AVG = 0");
        }
        else {
            long avg = Math.round((double) sum/count);
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }


    }

}
