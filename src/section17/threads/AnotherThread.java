package section17.threads;

import static section17.threads.ThreadColor.ANSI_BLUE;
import static section17.threads.ThreadColor.ANSI_RED;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Hello from "+currentThread().getName());

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_RED+"Another thread woke me up");
        }

        System.out.println(ANSI_BLUE+"Three seconds have passed and I am woke");

    }
}
