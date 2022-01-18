package gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import account.Bank;


public class BankGUI extends JFrame {


    public static void main(String[] args) {
        new BankGUI();
    }

    static Bank BankOfChad = new Bank();

    public BankGUI() {
        JTabbedPane contentPane = new JTabbedPane();

        contentPane.addTab("Open New", new OpenPanel());
        contentPane.addTab("Update", new UpdatePanel());
        contentPane.addTab("Interest", new InterestPanel());
        contentPane.addTab("Close", new ClosePanel());

        this.setContentPane(contentPane);
        this.setTitle("Bank Accounts");
        this.pack();
        this.setSize(300, 300);
        this.setLocationRelativeTo(null); // relative to the desktop, o sea, the center of the screen.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
