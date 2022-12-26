package section7.classesChallenge;

public class MainChallenge {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(123456789, 4000, "BOB", "bob@wp.pl", 1234567);

        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());

        bankAccount.setAccountBalance(2000);
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());
        bankAccount.depositFound(2000);
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());
        bankAccount.withdrawFound(2000);
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());

    }

}
