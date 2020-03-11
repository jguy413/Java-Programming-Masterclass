import java.util.Scanner;

public class Main {

// MY SOLUTION
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter Array Size Below");
        int array_size = scanner.nextInt();

        int[] intArray = getIntegers(array_size);

        int[] sortedArray = sortArray(intArray, array_size);

        for (int i =0; i < array_size; i++) {
            System.out.println(sortedArray[i]);
        }


    }


    public static int[] getIntegers(int array_size) {
        System.out.println("Enter " + array_size + " integers.");
        int[] values = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] sortArray(int[] intArray, int array_size) {

        int position = 0;
        int duplicates = -1;
        int[] sortedArray = new int[array_size];

        for (int i = 0; i < array_size; i++) {

            for (int j = 0; j < array_size; j++) {

                if (intArray[i] < intArray[j]) {
                    position += 1;
                }
                if (intArray[i] == intArray[j]) {
                    duplicates += 1;
                }
            }
            if (duplicates > 0) {
                for (int k = 1; k <= duplicates; k++) {
                    sortedArray[position] = intArray[i];
                    position += 1;
                }
            }
            else {
                sortedArray[position] = intArray[i];
            }
            position = 0;
            duplicates = 0;

        }

        return sortedArray;


    }

// EXAMPLE SOLUTION
//
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//
//        int[] myIntegers = getIntegers(5);
//        int[] sortedIntegers = sortIntegers(myIntegers);
//        printArray(sortedIntegers);
//
//    }
//
//    public static int[] getIntegers(int capacity) {
//        int[] array = new int[capacity];
//        System.out.println("Enter " + capacity + " integer values:\r");
//        for(int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + " contents " + array[i]);
//        }
//    }
//
//    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
//
//        boolean flag = true;
//        int temp;
//        while(flag) {
//            flag = false;
//            for(int i = 0; i < sortedArray.length-1; i++) {
//                if(sortedArray[i] < sortedArray[i+1]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        return sortedArray;
//    }

}
