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

    public static boolean isLeapYear( int year){

        if(year<1 || year>9999){
            return false;
        }
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){

        if(year<1 || year>9999){
            return -1;
        }

        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                return 31;
            case 2 :{
                if(isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            }
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                return 30;
            default:
                return -1;
        }
    }

}
