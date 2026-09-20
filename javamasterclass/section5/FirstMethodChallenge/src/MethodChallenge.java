public class MethodChallenge {
    public static void main(String[] args) {

    String name;
    int position;
    int score;


    displayHighScorePosition("Tim", 2);
    calculateHighScorePosition(1500);
    calculateHighScorePosition(1000);
    calculateHighScorePosition(500);
    calculateHighScorePosition(100);
    calculateHighScorePosition(25);



    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }


    public static void calculateHighScorePosition(int score) {
        if (score >= 1000) {
            System.out.println("1");
        } else if (score >= 500) {
            System.out.println("2");
        } else if (score >= 100) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
