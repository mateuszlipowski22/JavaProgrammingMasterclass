package section7.classesChallenge;

public class MainChallenge {

    public static void main(String[] args) {

//        BankAccount bankAccount = new BankAccount(123456789, 4000, "BOB", "bob@wp.pl", 1234567);

        BankAccount bankAccount = new BankAccount();

        System.out.println("bankAccount..getAccountNumber() = " + bankAccount.getAccountNumber());
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());

        bankAccount.setAccountBalance(2000);
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());
        bankAccount.depositFound(2000);
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());
        bankAccount.withdrawFound(2000);
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());


        BankAccount bankAccount1 = new BankAccount("Tim", "dsadas@w.sd", 1222);
        System.out.println("bankAccount1.getAccountNumber() = " + bankAccount1.getAccountNumber());
        System.out.println("bankAccount1.getAccountBalance() = " + bankAccount1.getAccountBalance());
    }

}
