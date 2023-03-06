package section17.threads;

import static section17.threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from MyRunnable implementation of run()");
    }
}
