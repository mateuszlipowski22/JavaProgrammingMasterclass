package section20.banking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        BankAccount bankAccount = new BankAccount("Tim", "John", 1000.00, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200, true);
        assertEquals(1200, balance,0);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposite() {
        BankAccount bankAccount = new BankAccount("Tim", "John", 1000.00, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200, true);
        assertEquals(1200, bankAccount.getBalance(),0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        BankAccount bankAccount = new BankAccount("Tim", "John", 1000.00, BankAccount.CHECKING);
        double balance = bankAccount.withdraw(200, true);
        assertEquals(800, bankAccount.getBalance(),0);
    }

    @Test
    public void isChecking_true(){
        BankAccount bankAccount = new BankAccount("Tim", "John", 1000.00, BankAccount.SAVINGS);
        assertTrue(bankAccount.isChecking(), "The account is NOT a checking account");
    }
}

