public class DiagonalStar {


        public static void printSquareStar(int number) {

            if (number < 5) {
                System.out.println("Invalid Value");
            }
            else {

                int rowNum = 1;
                for (int i = 1; i <= number; i++) {

                    for (int j = 1; j <= number; j++) {
                        if (i == 1 || j == 1 || i == number || j == number) {
                            System.out.print("*");
                        } else if (i == j || j == (number - i + 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }


                    }
                    System.out.println("");
                    rowNum += 1;
                }
            }

        }

}
