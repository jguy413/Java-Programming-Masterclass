public class DiagonalStar {

    public static void Main(String[] args) {
        DiagonalStar.printSquareStar(5);
    }

    public static void printSquareStar(int number) {

        if(number < 5) {
            System.out.println("Invalid Value");
        }

        int line = 0;

        for(int i=1;i<=number;i++) {
            if(i==1) {
                for(int j=1;j<=number;j++) {
                    System.out.println("*");
                }
            }
        }

    }

}
