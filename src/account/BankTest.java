package account;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

    public BankTest() {

    }

    @Test
    public void BankTest() {

        Bank bankChad = new Bank();

        SavingsAccount sa = new SavingsAccount(.015);
        bankChad.addAccount(sa);

        // when searching for a bank.
        Account f = bankChad.findAccount(sa.getId());
        assertSame(f, sa);

    }


}
