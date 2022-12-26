package section7.classesChallenge;

public class BankAccount {

    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accountNumber, double accountBalance, String customerName, String email, int phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void depositFound(double deposit){
        if(deposit<0) return;
        this.accountBalance=accountBalance+deposit;
    }

    public void withdrawFound(double withdraw){
        if(accountBalance-withdraw>=0){
            accountBalance=accountBalance-withdraw;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
