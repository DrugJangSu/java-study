public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if (score <= 5000) {
            System.out.println("Your score was less than or equal to 5000");
        } else {
            System.out.println("Got here");
        }

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int levelCompleted = 8;
//        int newBonus = 200;
//        int newFinalScore = newScore;
//        if (newGameOver == true) {
//            newFinalScore += (levelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }
//
            score = 10000;
            levelCompleted = 8;
            bonus = 200;

            finalScore = score;

            if (gameOver) {
                finalScore +=- (levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);
            }
            }

        }


