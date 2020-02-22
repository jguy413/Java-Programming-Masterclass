public class numberToWords {

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int dummy = reverse(number);
        int numberDigits = getDigitCount(number);
        int dummyDigits = getDigitCount(dummy);
        int endZeroes = numberDigits - dummyDigits;
        String output = "";

        System.out.println(output);
        System.out.println(numberDigits);

        while (numberDigits > 0); {

            System.out.println(dummy);

            int lastDigit = dummy % 10;

            if(lastDigit==0); {
                output+="Zero ";
            }
            if(lastDigit==1); {
                output+="One ";
            }
            if(lastDigit==2); {
                output+="Two ";
            }
            if(lastDigit==3); {
                output+="Three ";
            }
            if(lastDigit==4); {
                output+="Four ";
            }
            if(lastDigit==5); {
                output+="Five ";
            }
            if(lastDigit==6); {
                output+="Six ";
            }
            if(lastDigit==7); {
                output+="Seven ";
            }
            if(lastDigit==8); {
                output+="Eight ";
            }
            if(lastDigit==9); {
                output+="Nine ";
            }
            dummy /= 10;
            numberDigits -= 1;
        }

        while(endZeroes > 0); {
            output+="Zero ";
            endZeroes -= 1;
        }
        System.out.println(output);
    }

    public static int reverse(int number) {

        int reverse = 0;
        int dummy = number;
        int digits = getDigitCount(number);

        while (digits > 0) {

            int lastDigit = dummy % 10;
            reverse += (Math.pow(10, (digits-1)) * lastDigit);

            dummy /= 10;
            digits--;

        }
        return reverse;

    }

    public static int getDigitCount(int number) {

        int count = 0;
        int dummy = Math.abs(number);

//        if (number < 0) {
//            return -1;
//        }
        if(number >= -9 && number <= 9) {
            return 1;
        }
        else {
            while (dummy >= 1) {
                dummy /= 10;
                count++;
            }
        return count;
        }

    }

}
