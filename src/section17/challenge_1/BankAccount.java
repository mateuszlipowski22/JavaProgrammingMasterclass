package section17.challenge_1;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(double initialBalance, String accountNumber) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }


//    public synchronized void deposit(double amount){
//        balance+=amount;
//    }
//
//    public synchronized void withdraw(double amount){
//        balance-=amount;
//    }

    public  void deposit(double amount){
        synchronized (this){
            balance+=amount;
        }
    }

    public synchronized void withdraw(double amount){
        synchronized (this){
            balance-=amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
