import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myVal = 10;
        int anotherVal = myVal;

        System.out.println("myVal: " + myVal);
        System.out.println("anotherVal: " + anotherVal);

        anotherVal++;

        System.out.println("myVal: " + myVal);
        System.out.println("anotherVal: " + anotherVal);

        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};

        modifyArray(myArray);

        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
