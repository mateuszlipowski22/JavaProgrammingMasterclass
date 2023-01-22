package section13.series;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("Series.nSum(%d) = %d %n",i , Series.nSum(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.printf("Series.factorial(%d) = %d %n",i , Series.factorial(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.printf("Series.fibonacci(%d) = %d %n",i , Series.fibonacci(i));
        }

    }

}
