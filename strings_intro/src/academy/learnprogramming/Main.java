package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // booleans

        String myString = "This is my string";
        System.out.println("My String: " + myString);
        myString = myString + ", and this is an addition to the string.";
        System.out.println("Updated String: " + myString);
        double doubleNum = 120d;
        String newString = "Adding non-string types to strings";
        newString = newString + doubleNum;
        System.out.println(newString);
    }
}
