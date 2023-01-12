package section10.autoboxing_challenge;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Jan Kowalski");

        Bank bank = new Bank("Bank Polski");

        bank.addNewCustomer("Jane A", 500);
        System.out.println(bank);

        bank.addTransaction("Jane A", 1000);
        bank.addTransaction("Jane A", -100);
        bank.printStatement("Jane A");

    }

}
