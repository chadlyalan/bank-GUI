package account;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class testAccount {

    @Test // each test method has to have its own annotation of this
    public void testSavings() {
        final double epsilon = 0.0000001;
        SavingsAccount sa = new SavingsAccount(0.015);    // still have to create an object to test it out.

        Date now = new Date();
        assertEquals(now.getTime(), sa.getDateOpened().getTime(), 5000);

        assertEquals(0.015, sa.getAnnualRate(), epsilon);
        assertEquals(0.0, sa.getBalance(), epsilon);
        assertTrue(sa instanceof SavingsAccount);
        assertEquals(1, sa.getId());

        sa.deposit(100);
        assertEquals(100, sa.getBalance(), epsilon);

        sa.withdraw(75);
        assertEquals(25, sa.getBalance(), epsilon);

        sa.deposit(-10);
        assertEquals(15, sa.getBalance(), epsilon);

        sa.withdraw(-10);
        assertEquals(25, sa.getBalance(), epsilon);

    }

    @Test
    public void testChecking() {

    }


}
