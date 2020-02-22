public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if((goal % 5 == 0) && (5*bigCount >= goal)) {
            return true;
        }

        else if(5*bigCount + smallCount >= goal) {
            int div5 = goal / 5;

            if(smallCount >= goal) {
                return true;
            }

            else if(bigCount >= div5 && smallCount >= (goal % 5)){
                return true;
            }

            else if(bigCount < div5 && smallCount >= (goal - 5*bigCount)) {
                return true;
            }

        }
    return false;
    }

}
