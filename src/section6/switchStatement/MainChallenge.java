package section6.switchStatement;

public class MainChallenge {

    public static void main(String[] args) {

        printNumberInWord(2);

    }

    public static void printNumberInWord(int number){
        String numberStr;
        switch (number){
            case 0 :
                numberStr = "ZERO";
                break;
            case 1 :
                numberStr = "ONE";
                break;
            case 2 :
                numberStr = "TWO";
                break;
            case 3 :
                numberStr = "THREE";
                break;
            case 4 :
                numberStr = "FOUR";
                break;
            case 5 :
                numberStr = "FIVE";
                break;
            case 6 :
                numberStr = "SIX";
                break;
            case 7 :
                numberStr = "SEVEN";
                break;
            case 8 :
                numberStr = "EIGHT";
                break;
            case 9 :
                numberStr = "NINE";
                break;
            default :
                numberStr = "OTHER";
                break;
        };
        System.out.println(numberStr);

//            case 0 :-> "ZERO";
//            case 1 -> "ONE";
//            case 2 -> "TWO";
//            case 3 -> "THREE";
//            case 4 -> "FOUR";
//            case 5 -> "FIVE";
//            case 6 -> "SIX";
//            case 7 -> "SEVEN";
//            case 8 -> "EIGHT";
//            case 9 -> "NINE";
//            default -> "OTHER";

    }
}
