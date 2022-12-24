package section6.readingUserInput;

import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {

        printSumOfFive();

    }

    public static void printSumOfFive(){

        Scanner scanner = new Scanner(System.in);
        int index=1;
        int sum=0;

//        do{
//            System.out.println("Enter number #"+index );
//            try{
//                sum+=Integer.parseInt(scanner.nextLine());
//                index++;
//            }catch (NumberFormatException e){
//                System.out.println("Invalid number");
//            }
//        }while (index<=5);
//        System.out.println("sum = " + sum);

        while(index<=5){
            System.out.println("Enter number #"+index );
            try{
                sum+=Integer.parseInt(scanner.nextLine());
                index++;
            }catch (NumberFormatException e){
                System.out.println("Invalid number");
            }
        }
        System.out.println("sum = " + sum);

    }

}
