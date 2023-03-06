package section17.threads;

import static section17.threads.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another thread==");
        anotherThread.start();

//        new Thread(){
//            @Override
//            public void run() {
//                System.out.println(ANSI_GREEN+"Hello from the anonymous class");
//            }
//        }.start();

        new Thread(() -> System.out.println(ANSI_GREEN+"Hello from the anonymous class")).start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED+"Hello from anonymous class implementation of run");
            }
        });
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread");
//        anotherThread.start();

    }
}
