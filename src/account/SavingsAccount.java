package account;

import javax.swing.JOptionPane;

public class SavingsAccount extends Account {

    public static final double DEFAULT_ANNUAL_RATE = 2.5;

    public SavingsAccount(double annualRate) {
        super(annualRate);
    }

    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;
        else
            JOptionPane.showMessageDialog(null, "Cannot deposit 0 or less");
    }

    public void withdraw(double amount) {
        if (this.balance - amount >= 0 && amount > 0)
            this.balance -= amount;
        else
            JOptionPane.showMessageDialog(null, "Error! Not enough available funds");
    }

    public String getType() {
        return "Savings";
    }
}
