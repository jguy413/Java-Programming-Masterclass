public class parsingString {

    public static void main(String[] args) {

        String numberString = "2020.123";
        System.out.println("Number String: " + numberString);

        double number = Double.parseDouble(numberString);
        System.out.println("Number: " + number);

        numberString += 1;
        number += 1;

        System.out.println("Number String: " + numberString);
        System.out.println("Number: " + number);

    }

}
