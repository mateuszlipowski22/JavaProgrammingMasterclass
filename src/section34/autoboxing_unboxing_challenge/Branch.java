package section34.autoboxing_unboxing_challenge;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransactions(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (Customer checkedCustomer : this.customers) {
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
