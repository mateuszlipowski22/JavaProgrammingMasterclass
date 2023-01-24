package section13.access_modifier;

import java.util.ArrayList;

public class Account {

    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions=new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposite(int amount){
        if(amount>0){
            transactions.add(amount);
            this.balance+=amount;
            System.out.println(amount+" deposited. Balanced is now " + this.balance);
        }else {
            System.out.println("Cannot deposit negative amount");
        }
    }

    public void withdraw(int amount){
        int withdrawal = -amount;
        if(withdrawal<0){
            transactions.add(withdrawal);
            this.balance+=withdrawal;
            System.out.println(amount+" withdrawn. Balanced is now " + this.balance);
        }else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance(){
        this.balance=0;
        for (int transaction : this.transactions) {
            this.balance+=transaction;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
