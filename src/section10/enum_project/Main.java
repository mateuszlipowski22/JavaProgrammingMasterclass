package section10.enum_project;

import java.time.Duration;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfWeek weekDay = DayOfWeek.WED;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay=getRandom();
//            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
//            if(weekDay==DayOfWeek.FRI){
//                System.out.println("Found a Friday");
//            }
            switchDayOfWeek(weekDay);
        }

        for(Topping topping : Topping.values()){
            System.out.println(topping.name() + " : "+ topping.getPrice());
        }

        Duration duration = Duration.parse("PT5M10S");
        System.out.println(duration);

    }

    public static DayOfWeek getRandom(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfWeek.values();
        return allDays[randomInteger];
    }

    public static void switchDayOfWeek(DayOfWeek weekDay){
        int weekDayInteger = weekDay.ordinal()+1;
        switch (weekDay){
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0)+weekDay.name().substring(1).toLowerCase()+"day is Day "+weekDayInteger);
        }
    }

}
