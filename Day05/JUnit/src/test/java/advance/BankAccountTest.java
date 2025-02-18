package advance;

import static org.junit.jupiter.api.Assertions.*;

import com.advance.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0); // Initial balance of 100
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Balance should be 150 after depositing 50.");
    }

    @Test
    void testWithdraw() {
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance(), "Balance should be 60 after withdrawing 40.");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200.0);
        });
        assertEquals("Insufficient funds.", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10.0);
        });
        assertEquals("Deposit amount must be positive.", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-10.0);
        });
        assertEquals("Withdrawal amount must be positive.", exception.getMessage());
    }

    @Test
    void testInitialBalanceNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-50.0);
        });
        assertEquals("Initial balance cannot be negative.", exception.getMessage());
    }
}
