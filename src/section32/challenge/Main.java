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

        BankAccount timsAccount = new BankAccount("Tim", "tim@wp.pl", "123456789");

        VipPerson person1 = new VipPerson();
        System.out.println("person1.getName() = " + person1.getName());

        VipPerson person2 = new VipPerson(10000, "wp.pl");
        System.out.println("person2.getName() = " + person2.getName());

        VipPerson person3 = new VipPerson("dddd", 10000, "wp.pl");
        System.out.println("person3.getName() = " + person3.getName());
    }
}
