package section6.forLoop;

public class Sum3And5Challenge {

    public static void main(String[] args) {

        System.out.println("sum3And5(0, 1000) = " + sum3And5(1, 1000));

    }

    public static int sum3And5(int minimum, int maximum){
        if(minimum>=maximum || minimum>1000 || maximum>1000 || minimum<=0){
            return -1;
        }
        int sum=0;
        int counter=0;
        for(int i =minimum; i<=maximum && counter<5; i++){
            if(i%3==0 && i%5==0){
                System.out.println("Number that is devided by 3 and 5 is "+ i);
                sum+=i;
                counter++;
            }
        }
        return sum;
    }

}
