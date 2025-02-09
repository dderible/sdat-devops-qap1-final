package org;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    // Deposit Test
    @Test
    public void testDeposit() {
        User appTest = new User("John", "Doe");
        appTest.deposit(709);
        Assertions.assertEquals(709, appTest.accBalance);
    }

    // Withdrawal Test
    @Test
    public void testWithdraw() {
        User appTest = new User("John", "Doe");
        appTest.deposit(900);
        appTest.withdraw(420);
        Assertions.assertEquals(480, appTest.accBalance);
    }
}