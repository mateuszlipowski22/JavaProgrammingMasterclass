package section32.challenge;

public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();
//        BankAccount bobsAccount = new BankAccount("12345", 0, "Bob Brown", "bob@wp.pl", "123456789");

        bobsAccount.getBalance();
        bobsAccount.getCustomerPhoneNumber();

        bobsAccount.withdraw(100);
        bobsAccount.deposit(50);
        bobsAccount.withdraw(100);

    }

}
