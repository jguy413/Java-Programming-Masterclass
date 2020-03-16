import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Array: " + Arrays.toString(array));
    }


    private static void reverse(int[] array) {

        int[] newAddress = new int[array.length];
        int index = 0;
        for(int i = array.length - 1; i >= 0; i--) {

            newAddress[index] = array[i];
            //array[index] = newAddress[index];
            index++;
        }
        for(int i = 0; i <= array.length-1; i++) {
            array[i] = newAddress[i];
        }
    }
}
