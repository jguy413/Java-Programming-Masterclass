package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("Result: " + result); // this prints the result of the expression

        int prevResult = result;
        System.out.println("Previous Result: " + result);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // gives remainder of 4 / 3, equals 1
        System.out.println("4 mod 3 = " + result);

        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 + " + result);

        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        // if statement with no code block
        //boolean bamaWins = true;
        //if (bamaWins == true)
        //    System.out.println("Bama Wins! Roll Tide!");

        boolean bamaWins = true;
        if (bamaWins == true) {
            System.out.println("Bama Wins!");
            System.out.println("Roll Tide!");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondScore = 60;
        if ((topScore > secondScore) && (topScore < 100)) {
            System.out.println("Deeeecent");
        }

        if ((topScore > 90) || (topScore < 100)) {
            System.out.println("Top Score is greater than 90 or less than 100");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("New Value = 50");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 21;
        boolean is21Up = ageOfClient >= 21 ? true : false;
        if (is21Up) {
            System.out.println("21 babyyyy");
        }

    }
}
