package section17.challenge_1;

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
        lock.lock();
        try{
            balance+=amount;
        }finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try{
            balance -= amount;
        }finally {
            lock.unlock();
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
