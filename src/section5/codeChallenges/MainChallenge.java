package section5.codeChallenges;

public class MainChallenge {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));

        System.out.println("String.format(\"%.3f\", firstNumber) = " + String.format("%.3f", 3.1756));


    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        return ((int) (firstNumber*1000)) == ((int) (secondNumber*1000));
    }

    public static void printYearsAndDays(long minutes){
        if ((minutes < 0)) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + minutes / (365 * 24 * 60) + " y and " + (minutes % (365 * 24 * 60)) / (24 * 60) + " d");
        }
    }

    public static void printEqual(int firstParam, int secondParam, int thirdParam) {
        if (firstParam < 0 || secondParam < 0 || thirdParam < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (firstParam == secondParam && firstParam == thirdParam) {
            System.out.println("All numbers are equal");
        } else if (firstParam == secondParam || firstParam == thirdParam) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
