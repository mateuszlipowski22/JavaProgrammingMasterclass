package section6.whileLoop;

public class Challenges {

    public static void main(String[] args) {

//        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));
//        System.out.println("isPalindrome(707) = " + isPalindrome(707));
//        System.out.println("isPalindrome(11212) = " + isPalindrome(11212));

        System.out.println("sumFirstAndLastDigit(252) = " + sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257) = " + sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0) = " + sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5) = " + sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-10) = " + sumFirstAndLastDigit(-10));
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
}
