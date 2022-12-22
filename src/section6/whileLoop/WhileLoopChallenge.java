package section6.whileLoop;

public class WhileLoopChallenge {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int totalEvenNumber = 0;
        int totalOddNumber = 0;

        while(number<finishNumber){
            number++;
            if(!isEvenNumber(number)){
                totalOddNumber++;
                continue;
            }
            totalEvenNumber++;
            System.out.println("Even number = " + number);

            if(totalEvenNumber==5){
                System.out.println("Total even number found " + totalEvenNumber);
                System.out.println("Total odd number found " + totalOddNumber);
                break;
            }
        }

    }

    public static boolean isEvenNumber(int number){
        return number%2==0;
    }

}
