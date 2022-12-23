package section6.whileLoop;

public class Challenges {

    public static void main(String[] args) {

//        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));
//        System.out.println("isPalindrome(707) = " + isPalindrome(707));
//        System.out.println("isPalindrome(11212) = " + isPalindrome(11212));

//        System.out.println("sumFirstAndLastDigit(252) = " + sumFirstAndLastDigit(252));
//        System.out.println("sumFirstAndLastDigit(257) = " + sumFirstAndLastDigit(257));
//        System.out.println("sumFirstAndLastDigit(0) = " + sumFirstAndLastDigit(0));
//        System.out.println("sumFirstAndLastDigit(5) = " + sumFirstAndLastDigit(5));
//        System.out.println("sumFirstAndLastDigit(-10) = " + sumFirstAndLastDigit(-10));

//        System.out.println("getEvenDigitSum(123456789) = " + getEvenDigitSum(123456789));
//        System.out.println("getEvenDigitSum(252) = " + getEvenDigitSum(252));
//        System.out.println("getEvenDigitSum(-22) = " + getEvenDigitSum(-22));

//        System.out.println("hasSharedDigit(12, 23) = " + hasSharedDigit(12, 23));
//        System.out.println("hasSharedDigit(9, 99) = " + hasSharedDigit(9, 99));
//        System.out.println("hasSharedDigit(15, 55) = " + hasSharedDigit(15, 55));
//        System.out.println("hasSharedDigit(12, 43) = " + hasSharedDigit(12, 43));

        System.out.println("hasSameLastDigit(41, 22, 71) = " + hasSameLastDigit(41, 22, 71));
        System.out.println("hasSameLastDigit(23, 32, 42) = " + hasSameLastDigit(23, 32, 42));
        System.out.println("hasSameLastDigit(9, 99, 999) = " + hasSameLastDigit(9, 99, 999));


    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int savedNumber=number;

        while(number > 9 || number<-9){
            reverse+=(number%10);
            reverse=reverse*10;
            number=number/10;
        }

        reverse+=number;

        return reverse==savedNumber;

    }

    public static int sumFirstAndLastDigit(int number){

        if(number<0){
            return -1;
        }

        int sum = number%10;

        while(number>9){
            number/=10;
        }

        return sum+number;
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }

        int sum = 0;

        while(number>0){
            if((number%10)%2==0){
                sum+=number%10;
            }
            number/=10;
        }

        return sum;

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){

        if(firstNumber<10 || firstNumber>99 ||secondNumber<10 || secondNumber>99) return false;

        int secondNumberLoop=secondNumber;

        while(firstNumber>=1){
            while (secondNumberLoop>=1){
                if (firstNumber%10==secondNumberLoop%10){
                    return true;
                }
                secondNumberLoop=secondNumberLoop/10;
            }
            secondNumberLoop=secondNumber;
            firstNumber=firstNumber/10;
        }

        return false;
    }

    public static boolean isValid(int number){
        return number>10 && number<=1000;
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (a == c) || (b == c);
        }
        return false;
    }


}
