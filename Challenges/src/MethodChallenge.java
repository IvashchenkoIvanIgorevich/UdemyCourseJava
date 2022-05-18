public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Ivan", calculateHighScorePosition(1500));
        displayHighScorePosition("John", calculateHighScorePosition(900));
        displayHighScorePosition("Alex", calculateHighScorePosition(400));
        displayHighScorePosition("Stefania", calculateHighScorePosition(50));
    }

    static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000)
            position = 1;
        else if (playerScore >= 500)
            position = 2;
        else if (playerScore >= 100)
            position = 3;

        return position;
    }
}
