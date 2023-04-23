package section34.linked_list;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 54.06);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.08);
        System.out.println("Balance for customer "+customer.getName()+" is "+ customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(5);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": "+intList.get(i));
        }

        System.out.println("---------------");
        intList.add(1,2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": "+intList.get(i));
        }

    }
}
