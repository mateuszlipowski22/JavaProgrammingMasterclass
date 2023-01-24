package section13.access_modifier;

public class Main {

    public static void main(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.deposite(1000);
        timsAccount.withdraw(500);
        timsAccount.deposite(-20);
        timsAccount.withdraw(-200);

        timsAccount.calculateBalance();
//        timsAccount.balance=5000;

        System.out.println("Balance on Tims account is "+ timsAccount.getBalance());

//        timsAccount.transactions.add(4500);
        timsAccount.calculateBalance();

    }

}
