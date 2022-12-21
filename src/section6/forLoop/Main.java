package section6.forLoop;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            System.out.println("10,000 at "+rate+"% interest = " + calculateInterest(10000, rate) );
        }

        for (double rate = 7.5; rate <= 10.0; rate+=0.25d) {
            if(rate>8.5){
            break;
            }
            System.out.println("100 at "+rate+"% interest = " + calculateInterest(100, rate) );
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

}
