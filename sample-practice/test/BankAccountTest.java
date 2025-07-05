import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
     BankAccount account;

    @BeforeEach
    void setUp() {
         account = new BankAccount("Avani", 35000);
    }

    @Test
    void testWithdraw() {
        account.withdraw(500);
        assertEquals(34500,account.getBalance());
    }

    @Test
    void testGetBalance() {
        assertEquals(35000, account.getBalance());
    }

    @Test
    void testDeposit() {
        account.deposit(10000);
        assertEquals(45000, account.getBalance());
    }
}
