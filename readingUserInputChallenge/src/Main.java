import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        boolean go = true;

        while(go) {
            System.out.println("Enter Input #" + count);
            boolean isInt = scanner.hasNextInt();

            if(isInt) {
                if(count<=10) {

                    int number = scanner.nextInt();

                    sum+=number;

                }

                if(count==10) {
                    System.out.println("Sum of inputs: " + sum);
                    go = false;
                }

                count+=1;
            }

            else {
                System.out.println("Invalid Number");
                scanner.nextLine();
                System.out.println("");
            }

        }
        scanner.close();
    }

}
