import java.util.Scanner;

public class Main {



//    public static void main(String[] args) {

//        int[] myIntArray = new int[10];
//        double[] myDoubleArray = new double[10];
//
//        myIntArray[5] = 50;
//
//        System.out.println(myIntArray[5]);
//
//
//        int[] otherIntArray = { 1,2,3,4,5,6,7,8,9,10 };
//        System.out.println(otherIntArray[1] + " " + otherIntArray[8]);
//
//        int[] anotherIntArray = new int[25];
//
//        for(int i=0; i<anotherIntArray.length; i++) {
//            anotherIntArray[i] = i*10;
//        }
//
//        for(int i=0; i<anotherIntArray.length; i++) {
//            System.out.println(anotherIntArray[i]);

//        }

        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

            System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
            int sum = 0;
            for(int i=0; i<array.length; i++) {
                sum += array[i];
            }

            return (double) sum / (double) array.length;
    }


}
