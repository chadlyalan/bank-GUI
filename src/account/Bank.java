package account;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    // ArrayList replaces the number of accounts.

    public Bank() {
        this.accounts = new ArrayList<Account>();
    }

    public void addAccount(Account a) {
        this.accounts.add(a);
    }

    public void addMonthlyInterest() {
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).addMonthlyInterest();
        }
    }

    public Account findAccount(int id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id)
                return accounts.get(i);
        }
        return null;
    }

    public void removeAccount(Account a) {
        accounts.remove(a);
    }

}
