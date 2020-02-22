public class numberPalindrome {

    // a palindrome number is one that is the same when reversed order of digits
    public static boolean isPalindrome(int number) {

        int useNumber = number;
        int check = 0;
        int multiplier = 0;
        while ((Math.abs(useNumber)) >= 1) {

            int lastDigit = useNumber % 10;
            //System.out.println("Last Digit: " + lastDigit);
            if (multiplier != 0) {
                check *= 10;
            }
            check += lastDigit;
            useNumber /= 10;
            //System.out.println("Check: " + check);
            //System.out.println("Use Number: " + useNumber);
            multiplier ++;
        }
        //System.out.println("Check: " + check);
        if(number == check) {
            return true;
        }
        return false;
    }

}
