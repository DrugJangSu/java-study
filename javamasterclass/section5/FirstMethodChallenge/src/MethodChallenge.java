public class MethodChallenge {
    public static void main(String[] args) {


    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim", highScorePosition);

    highScorePosition = calculateHighScorePosition(1000);
    displayHighScorePosition("Bob", highScorePosition);

    highScorePosition = calculateHighScorePosition(500);
    displayHighScorePosition("Percy", highScorePosition);

    highScorePosition = calculateHighScorePosition(100);
    displayHighScorePosition("Gilbert", highScorePosition);

    highScorePosition = calculateHighScorePosition(25);
    displayHighScorePosition("James", highScorePosition);

    }
    public static void displayHighScorePosition(String name, int highScorePosition) {
        System.out.println(name + " managed to get into position " + highScorePosition + " on the high score list.");
    }


    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
