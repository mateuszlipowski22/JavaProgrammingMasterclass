package section17.challenge_1;

public class Main {

    public static void main(String[] args) {

        final BankAccount bankAccount = new BankAccount(1000, "12345-678");

//        Thread thead1 = new Thread(){
//            @Override
//            public void run() {
//                bankAccount.deposit(300);
//                System.out.println(bankAccount.getAccountNumber() + " : " + bankAccount.getBalance());
//                bankAccount.withdraw(50);
//                System.out.println(bankAccount.getAccountNumber() + " : " + bankAccount.getBalance());
//            }
//        };
//
//
//        Thread thead2 = new Thread(){
//            @Override
//            public void run() {
//                bankAccount.deposit(203.75);
//                System.out.println(bankAccount.getAccountNumber() + " : " + bankAccount.getBalance());
//                bankAccount.withdraw(100);
//                System.out.println(bankAccount.getAccountNumber() + " : " + bankAccount.getBalance());
//            }
//        };


        Thread thead1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(300);
                System.out.println(bankAccount.getAccountNumber() + " : " + bankAccount.getBalance());
                bankAccount.withdraw(50);
                System.out.println(bankAccount.getAccountNumber() + " : " + bankAccount.getBalance());
            }
        });

        Thread thead2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(203.75);
                System.out.println(bankAccount.getAccountNumber() + " : " + bankAccount.getBalance());
                bankAccount.withdraw(100);
                System.out.println(bankAccount.getAccountNumber() + " : " + bankAccount.getBalance());
            }
        });

        thead1.start();
        thead2.start();

        System.out.println(bankAccount.getAccountNumber() + " : " + bankAccount.getBalance());

    }

}
