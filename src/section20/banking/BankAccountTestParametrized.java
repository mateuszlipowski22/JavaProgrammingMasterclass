package section20.banking;

import org.junit.jupiter.api.BeforeAll;


public class BankAccountTestParametrized {

    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @BeforeAll
    public void setup(){
        account = new BankAccount("Tim", "John", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

//    @ParameterizedTest
//    @ValueSource({100.00,true,1100})
//    void deposit() {
//       account.deposit(amount, branch);
//       assertEquals(expected, account.getBalance(),0);
//    }
}
