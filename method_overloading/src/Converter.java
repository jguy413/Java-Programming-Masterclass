public class Converter {

    public static void main(String[] args) {
        double centimeters = (calcFeetAndInchesToCentimeters(6, 1));
        if(centimeters < 0) {
            System.out.println("Invalid Parameters");
        }
        else {
            System.out.println(centimeters);
        }
        centimeters = calcFeetAndInchesToCentimeters(73);
        if(centimeters < 0) {
            System.out.println("Invalid Parameters");
        }
        else {
            System.out.println(centimeters);
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || ((inches < 0) || (inches > 11))) {
            return -1d;
        }
        else {
            double feetToCentimeters = (feet * 12d) * 2.54d;
            double inchesToCentimeters = (inches * 2.54d);
            double totalCentimeters = feetToCentimeters + inchesToCentimeters;
            return totalCentimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1d;
        }
        else {
            double totalFeet = inches / 12.0;
            double totalCentimeters = calcFeetAndInchesToCentimeters(totalFeet, 0);
            return totalCentimeters;
        }
    }
}
