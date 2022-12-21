package section5.methodOverloading;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(45,65));


    }

    public static String getDurationString(int seconds){
        if(seconds<0) return "Invalid value";
        int hours = seconds/(3600);
        int minutes = (seconds/(60))%60;
        int remainingSeconds =(seconds%60);
        return hours + "h " + minutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int seconds, int minutes){
        if(minutes<0 || seconds<0 || seconds>59) return "Invalid value";

        int minutesToSeconds = minutes*60;
        int totalSeconds = minutesToSeconds+seconds;
        return getDurationString(totalSeconds);
    }
}
