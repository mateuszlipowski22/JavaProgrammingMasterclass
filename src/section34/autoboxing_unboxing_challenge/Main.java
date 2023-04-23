package section34.autoboxing_unboxing_challenge;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        if(bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.05);
        bank.addCustomer("Adelaide", "Percy", 220.05);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.05);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.22);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.22);

        bank.listCustomer("Adelaide", false);
        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 15.88)){
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 51.55)){
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 51.55)){
            System.out.println("Customer already exists");
        }
    }
}
