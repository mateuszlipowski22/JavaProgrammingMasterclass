package section10.autoboxing_challenge;

import java.util.ArrayList;

public class Customer {

    private String name;

    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name) {
        this.name = name.toUpperCase();
    }

    public Customer(String name, double initialDeposit) {
        this(name);
        transactions.add(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
