package section5.codeChallenges;

public class MainChallenge {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));

        System.out.println("String.format(\"%.3f\", firstNumber) = " + String.format("%.3f", 3.1756));


    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        return ((int) (firstNumber*1000)) == ((int) (secondNumber*1000));
    }

}
