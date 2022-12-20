package section5.firstMethodChallenge;

public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosision("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosision("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosision("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosision("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosision("James", highScorePosition);

    }

    public static int calculateHighScorePosition(int score){

        int position = 4;
            if(score>=1000){
                position = 1;
            }else if (score>= 500){
                position = 2;
            }else if(score>= 100){
                position = 3;
            }
            return position;
    }

    public static void displayHighScorePosision(String playerName, int highScorePosition){
        System.out.println(playerName+" managed to get into position "+highScorePosition+" on the high score list");
    }

}
