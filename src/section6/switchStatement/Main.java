package section6.switchStatement;

public class Main {

    public static void main(String[] args) {

//        int value = 1 ;

//        if(value == 1){
//            System.out.println("Value was 1");
//        }else if(value == 2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Value was not 1 or 2");
//        }

//        String month = "APRIL";
        String month = "sss";

        System.out.println(month + " is in the " + getQuarterEnhanced(month)+ " quarter");

        int switchValue = 1;

    switch (switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Was 3, 4 or 5");
            System.out.println("Actually it was "+switchValue);
        break;
        default:
            System.out.println("Value was not 1, 2, 3, 4 and 5");
            break;
    }

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was 3, 4 or 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4 and 5");
        }

    }

    public static String getQuarter(String month){
        switch (month){
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }

        return "BAD";
    }

    public static String getQuarterEnhanced(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                yield  month + " is BAD";
            }
        };

    }

}
