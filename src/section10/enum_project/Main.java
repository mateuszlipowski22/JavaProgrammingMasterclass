package section10.enum_project;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfWeek weekDay = DayOfWeek.WED;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay=getRandom();
            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
            if(weekDay==DayOfWeek.FRI){
                System.out.println("Found a Friday");
            }
        }

    }

    public static DayOfWeek getRandom(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfWeek.values();
        return allDays[randomInteger];
    }

}
