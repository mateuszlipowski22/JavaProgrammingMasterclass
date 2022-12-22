package section6.whileLoop;

public class sumDigitChallenge {

    public static void main(String[] args) {

        System.out.println("sumDigits(1234) = " + sumDigits(1234));

    }

    public static int sumDigits(int number){

        if(number<=0){
            return -1;
        }

        int digitSum=0;

//        char[] numberArray = String.valueOf(number).toCharArray();
//
//        for (int i = 0; i < numberArray.length; i++) {
//            digitSum+= (int) numberArray[i];
//        }
//        return digitSum;

        while(number > 9){
            digitSum+=(number%10);
            number=number/10;
        }

        digitSum+=number;

        return digitSum;

    }

}
