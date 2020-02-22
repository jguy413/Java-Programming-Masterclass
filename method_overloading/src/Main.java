public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Jonny", 500);
        System.out.println(newScore);

        calculateScore(200);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player: " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player: Unnamed Player scored " + score + " points.");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No Player, No Score");
    }
}
