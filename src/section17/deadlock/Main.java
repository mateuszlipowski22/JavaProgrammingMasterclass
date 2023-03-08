package section17.deadlock;

public class Main {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {

        new Thread1().start();
        new Thread2().start();

    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Has lock 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1: Has lock 1 and lock 2");
                }
                System.out.println("Thread 1: Released lock2");
            }
            System.out.println("Thread 1: Released lock1 Exiting");
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Has lock 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1: Has lock 2 and lock 1");
                }
                System.out.println("Thread 1: Released lock1");
            }
            System.out.println("Thread 1: Released lock1 Exiting");
        }
    }
}