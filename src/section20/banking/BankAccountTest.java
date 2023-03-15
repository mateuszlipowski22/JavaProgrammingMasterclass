package section20.banking;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount bankAccount;
    private static int count;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = "+count++);
    }

    @BeforeEach
    public void setup(){
        bankAccount = new BankAccount("Tim", "John", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = bankAccount.deposit(200, true);
        assertEquals(1200, balance,0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() throws Exception{
        double balance =bankAccount.withdraw(600, true);
        assertEquals(400, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_notBranch() throws Exception {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> bankAccount.withdraw(600, false));
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposite() {
        double balance = bankAccount.deposit(200, true);
        assertEquals(1200, bankAccount.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        double balance = bankAccount.withdraw(200, true);
        assertEquals(800, bankAccount.getBalance(),0);
    }

    @Test
    public void isChecking_true(){
        BankAccount bankAccount = new BankAccount("Tim", "John", 1000.00, BankAccount.CHECKING);
        assertTrue(bankAccount.isChecking(), "The account is NOT a checking account");
    }

    @AfterEach
    public void teardown(){
        System.out.println("Count = "+count++);
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("This executes after all test cases.Count = "+count++);
    }
}

