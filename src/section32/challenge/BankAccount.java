package section32.challenge;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this("123456789", 0, "default name", "default email", "default phone number");
        System.out.println("Empty constructor called");

    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("111111",0, customerEmail, customerEmail, customerPhoneNumber);
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println("Deposit of "+amount+" processed. New balance is "+balance);
        }
    }

    public void withdraw(double amount){
        if(amount>0){
            if(balance>=amount){
                this.balance-=amount;
                System.out.println("Withdraw of "+amount+" processed. Remaining balance is "+this.balance);
            }else {
                System.out.println("Only "+this.balance+" available. Withdraw not processed");
            }
        }
    }
}
