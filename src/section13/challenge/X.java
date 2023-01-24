package section13.challenge;

import java.util.Scanner;

public class X {

    private int x;

    public int x(){
        Scanner x = new Scanner(System.in);
        System.out.println("Input number");
        this.x=x.nextInt();
        return this.x;
    }

    public void x(int y){
        for (int x = 1; x <= 12; x++) {
            System.out.printf("%d * %d = %d %n",this.x,x,this.x*x);
        }
    }
}
