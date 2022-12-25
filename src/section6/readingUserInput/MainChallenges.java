package section6.readingUserInput;

import java.util.Scanner;

public class MainChallenges {

    public static void main(String[] args) {

//        System.out.println("canPack(1, 0, 4) = " + canPack(1, 0, 4));
//        System.out.println("canPack(1, 0, 5) = " + canPack(1, 0, 5));
//        System.out.println("canPack(0, 5, 4) = " + canPack(0, 5, 4));
//        System.out.println("canPack(2, 2, 11) = " + canPack(2, 2, 11));
//        System.out.println("canPack(-3, 2, 12) = " + canPack(-3, 2, 12));

//        System.out.println("getLargestPrime(21) = " + getLargestPrime(21));
//        System.out.println("getLargestPrime(217) = " + getLargestPrime(217));
//        System.out.println("getLargestPrime(0) = " + getLargestPrime(0));
//        System.out.println("getLargestPrime(45) = " + getLargestPrime(45));
//        System.out.println("getLargestPrime(-1) = " + getLargestPrime(-1));

        printSquareStar(5);
        printSquareStar(8);
    }


    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount<0 || smallCount <0 || goal <0){
            return false;
        }

        boolean result = false;

        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount ; j++) {
                if (i * 5 + j == goal) {
                    result = true;
                    break;
                }
            }
        }
        return result ;

    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;

//            if (number <= 1) return -1;
//
//            int largestPrime = 1;
//
//            while (number != 1) {
//                for (int i = 2; i <= number; i++) {
//                    if (number % i == 0) {
//                        number/= i;
//                        largestPrime = i;
//                        break;
//                    }
//                }
//            }
//
//        return largestPrime;
    }

    public static void printSquareStar(int number){
        if(number<5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if(i==1 || i ==number || j==1 || j == number || i==j || j==number-i+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double avg = 0;
        double inputCount = 0;

        while (true) {
            try {
                int next = Integer.parseInt(scanner.nextLine());
                sum += next;
                inputCount++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        avg = Math.round(sum / inputCount);

        System.out.println("SUM = " +(int) sum + " AVG = " + (long) avg);

    }
}
