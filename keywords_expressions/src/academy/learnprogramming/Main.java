package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    boolean gameover = true;
        int score = 15000;
        int levelCompleted = 5;
        int bonus = 100 * levelCompleted;

        int highScore = calculateScore(gameover, score, levelCompleted, bonus);
        //System.out.println("High Score: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 100 * levelCompleted;
        highScore = calculateScore(gameover, score, levelCompleted, bonus);
        //System.out.println("High Score: " + highScore);


//	    if (myScore <= 5000 && myScore>=1000) {
//            System.out.println("Decent Score");
//        }
//	    else if (myScore < 1000) {
//            System.out.println("Score lower than minimum threshold. Game Over.");
//        }
//	    else {
//            System.out.println("Score greater than 5000!");
//        }


        int tablePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", tablePosition);

        tablePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bill", tablePosition);

        tablePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bo", tablePosition);

        tablePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Blake", tablePosition);
    }

    public static int calculateScore(boolean gameover, int score, int levelCompleted, int bonus) {
        if (gameover) {
            int finalScore = score + bonus;
            finalScore += 100;
            return finalScore;
        }
        return -1;
    }


    public static void displayHighScorePosition(String playerName, int tablePosition) {
        System.out.println(playerName + " managed to get position " + tablePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500) {
            return 2;
        }
        else if (playerScore >= 100) {
            return 3;
        }

        return 4;
    }

}
