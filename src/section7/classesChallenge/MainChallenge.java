package section7.classesChallenge;

public class MainChallenge {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountBalance(2000);
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());
        bankAccount.depositFound(2000);
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());
        bankAccount.withdrawFound(2000);
        System.out.println("bankAccount.getAccountBalance() = " + bankAccount.getAccountBalance());

    }

}
