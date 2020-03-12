import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Array Size: ");
        int count = scanner.nextInt();

        int[] array = readIntegers(count);

        int minVal = findMin(array);

        System.out.println("Min Value: " + minVal);
    }


    public static int[] readIntegers(int count) {

        int val;
        int[] intArray = new int[count];
        System.out.println("Enter " + count + " Array Values");
        for(int i=0; i<count; i++) {
            val = scanner.nextInt();
            intArray[i] = val;
        }
        return intArray;
    }

    public static int findMin(int[] array) {

        int min = 2147483647;
        for(int i = 0; i < array.length - 1; i++) {

            if(array[i] <= array[i+1] && array[i] <= min) {
                min = array[i];
            }
            else {
                if(array[i+1] <= min) {
                    min = array[i+1];
                }
            }
        }
        return min;

    }

}
