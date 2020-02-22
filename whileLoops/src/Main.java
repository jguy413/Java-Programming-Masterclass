public class Main {

    public static void main(String[] args) {

    int number = 5;
    int evenNumbers = 0;

    while (number <= 20 && evenNumbers < 5) {

        if(!isEvenNumber(number)) {
            number++;
            continue;
        }
        else {
            System.out.println("Even Number: " + number);
            number++;
            evenNumbers++;
        }
    }
        System.out.println(evenNumbers);

    }

    public static boolean isEvenNumber (int number) {

        if(number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
