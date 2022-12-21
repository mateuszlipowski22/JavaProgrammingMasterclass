package section6.switchStatement;

public class SwitchExpressionChallenge {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);


    }

    public static void printDayOfWeek(int day){
        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Incorrect day";
        };
        System.out.println(day+" stands for "+ dayOfWeek);
    }

    public static void printDayOfWeekIf(int day){
        String dayOfWeek = "Incorrect day";

        if(day==0) {
            dayOfWeek = "Sunday";
        }else if(day==1) {
            dayOfWeek = "Monday";
        }else if(day==2) {
            dayOfWeek = "Tuesday";
        }else if(day==3) {
            dayOfWeek = "Wednesday";
        }else if(day==4) {
            dayOfWeek = "Thursday";
        }else if(day==5) {
            dayOfWeek = "Friday";
        }else if(day==6) {
            dayOfWeek = "Saturday";
        }

        System.out.println(day+" stands for "+ dayOfWeek);
    }

}
