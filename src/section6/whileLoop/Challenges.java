package section6.whileLoop;

public class Challenges {

    public static void main(String[] args) {

        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(707) = " + isPalindrome(707));
        System.out.println("isPalindrome(11212) = " + isPalindrome(11212));
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
}
