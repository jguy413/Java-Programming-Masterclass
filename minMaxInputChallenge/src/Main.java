import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int run = 0;
        int max = -2147483647; //Integer.MIN_VALUE
        int min = 2147483647; //Integer.MAX_VALUE

        while(true) {

            System.out.println("Enter number");
            boolean isInt = scanner.hasNextInt();

            if(isInt) {

                int number = scanner.nextInt();

                if(run==0) {
                    max = number;
                    min = number;

                }
                else {

                    if(number>max) {
                        if(run==1) {
                            min = max;
                        }
                        max = number;
                    }
                    if(number<min) {
                        if(run==1) {
                            max = min;
                        }
                        min = number;
                    }

                }
                run+=1;
            }

            else {
                System.out.println("Invalid number");

                if(run==0) {
                    System.out.println("No max or min");
                }
                else {
                    System.out.println("Max: " + max);
                    System.out.println("Min: " + min);
                }
                break;

            }

        }
        scanner.close();
    }

}
