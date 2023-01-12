package section10.autoboxing_challenge;

import java.util.ArrayList;

public class Bank {

    private String name;

    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addNewCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName)==null){
            customers.add(new Customer(customerName, initialDeposit));
            System.out.print("New customer added: " + customerName);
        }
    }

    public void addTransaction(String customerName, double amount){
        Customer customer = getCustomer(customerName);
        if(customer!=null){
           customer.getTransactions().add(amount);
        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer==null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer name: "+ customer.getName());
        System.out.println("Transaction:");
        for (double d:customer.getTransactions()) {
            System.out.printf("$%10.2f (%s)%n",d,d<0?"debit":"credit");
        }
    }

    private Customer getCustomer(String customerName){

        for (var customer : customers){
            if(customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) was not found %n", customerName);
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
