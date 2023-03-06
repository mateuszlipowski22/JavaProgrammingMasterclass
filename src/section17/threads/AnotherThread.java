package section17.threads;

import static section17.threads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Hello from another thread");
    }
}
