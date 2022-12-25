package section6.readingUserInput;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        minAndMaxValue();

    }

    public static void minAndMaxValue(){

//        Scanner scanner = new Scanner(System.in);
//        boolean continueLoop=true;
//        boolean initialData=true;
//        int min=0;
//        int max=0;
//        int next;
//
//        while(initialData){
//            System.out.println("Enter first number");
//            try{
//                next=Integer.parseInt(scanner.nextLine());
//                max=next;
//                min=next;
//                initialData=false;
//            }catch (NumberFormatException e){
//                System.out.println("Incorrect number - type again");
//            }
//        }
//
//
//        while(continueLoop){
//            System.out.println("Enter a number. To quit type any character");
//            try{
//                next=Integer.parseInt(scanner.nextLine());
//                if(max<next){
//                    max=next;
//                }
//                if(min>next){
//                    min=next;
//                }
//            }catch (NumberFormatException e){
//                continueLoop=false;
//            }
//        }
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);


        Scanner scanner = new Scanner(System.in);

        int min=0;
        int max=0;
        int loopCount=0;




        while(true){
            System.out.println("Enter a number. To quit type any character");
            try{
                int next=Integer.parseInt(scanner.nextLine());
                if(loopCount==0 || max<next){
                    max=next;
                }
                if(loopCount==0 || min>next){
                    min=next;
                }
            }catch (NumberFormatException e){
                break;
            }
        }
        if(loopCount>0){
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }else {
            System.out.println("Invalid data");
        }

    }

}
