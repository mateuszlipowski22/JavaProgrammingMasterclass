package section6.forLoop;

public class SumOddChallenge {

    public static void main(String[] args) {

        System.out.println("sumOdd(1, 100) = " + sumOdd(1, 100));
        System.out.println("sumOdd(-1, 100) = " + sumOdd(-1, 100));

    }

        public static boolean isOdd(int numberToCheck){
            if(numberToCheck<=0){
                return false;
            }

            return numberToCheck % 2 != 0;
        }

        public static int sumOdd(int startNumber, int endNumber){
            if(startNumber > endNumber || startNumber <= 0 || endNumber <= 0){
                return -1;
            }
            int sumOfOddNUmbers=0;
            for (int i = startNumber; i <= endNumber ; i++) {
                if(isOdd(i)){
                    sumOfOddNUmbers+=i;
                }
            }
            return sumOfOddNUmbers;
        }

}
