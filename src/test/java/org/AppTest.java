package org;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testDeposit() {
        User appTest = new User("John", "Doe");
        appTest.deposit(709);
        Assertions.assertEquals(709, appTest.accBalance);
    }

    @Test
    public void testWithdraw() {
        User appTest = new User("John", "Doe");
        appTest.deposit(840);
        appTest.withdraw(420);
        Assertions.assertEquals(420, appTest.accBalance);
    }
}