package section5.methodOverloading;

public class MainChallenge {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = "+convertToCentimeters(5, 8));
        System.out.println("68n = "+convertToCentimeters(68));

    }

    public static double convertToCentimeters(int inches){
        return inches*2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
//        return convertToCentimeters((foot*12)+inches);
        int feetToInches = feet*12;
        int totalInches = feetToInches+inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
