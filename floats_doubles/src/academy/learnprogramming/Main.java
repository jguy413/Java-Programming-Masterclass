package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Minimum Float Value: " + myMinFloatValue);
        System.out.println("Maximum Float Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Minimum Double Value: " + myMinDoubleValue);
        System.out.println("Maximum Double Value: " + myMaxDoubleValue);

        int myInt = 5 / 3;
        // float myFloat = (float) 5.25;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;

        System.out.println("Int Value: " + myInt);
        System.out.println("Float Value: " + myFloat);
        System.out.println("Double Value: " + myDouble);

        // Challenge

        double numberOfPounds = 200d;
        double poundsToKilos = numberOfPounds * 0.45359237d;
        System.out.println(numberOfPounds + " pounds = " + poundsToKilos + " kilos");





    }
}
