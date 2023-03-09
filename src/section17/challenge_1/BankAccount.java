package section17.challenge_1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount(double initialBalance, String accountNumber) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
        this.lock=new ReentrantLock();
    }


//    public synchronized void deposit(double amount){
//        balance+=amount;
//    }
//
//    public synchronized void withdraw(double amount){
//        balance-=amount;
//    }

//    public  void deposit(double amount){
//        synchronized (this){
//            balance+=amount;
//        }
//    }
//
//    public void withdraw(double amount){
//        synchronized (this){
//            balance-=amount;
//        }
//    }

    public  void deposit(double amount){
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    balance+=amount;
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void withdraw(double amount) {
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    balance -= amount;
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


        public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = "+accountNumber);
    }
}
