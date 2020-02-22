package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum Integer Value: " + myMinIntValue);
        System.out.println("Maximum Integer Value: " + myMaxIntValue);

        System.out.println("Busted Max Value = " + (myMaxIntValue+1));
        System.out.println("Busted Min Value = " + (myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value: " + myMinByteValue);
        System.out.println("Maximum Byte Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short Value: " + myMinShortValue);
        System.out.println("Maximum Short Value: " + myMaxShortValue);

        long myLongValue = 100L; //specify that it is a long value with L suffix
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value: " + myMinLongValue);
        System.out.println("Maximum Long Value: " + myMaxLongValue);

        int myTotal = (myMinIntValue/2);

        byte myNewByteValue = (byte) (myMinByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);

        // Primitive Types Challenge
        byte byteVar = 16;
        short shortVar = 10000;
        int intVar = 10500000;

        long sumVars = 50000L + 10L*(byteVar + shortVar+intVar);

        System.out.println("Byte Variable: " + byteVar);
        System.out.println("Short Variable: " + shortVar);
        System.out.println("Int Variable: " + intVar);
        System.out.println("10 Year Earnings: " + sumVars);
    }
}
