package gui;

import account.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class InterestPanel extends javax.swing.JPanel {

    public InterestPanel() {

        JButton btnAddInterest = new JButton("Add Interest");
        btnAddInterest.addActionListener(new ExitHandler());

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ExitHandler());

        this.add(btnAddInterest);
        this.add(btnExit);
    }

    private class AddInterestHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            BankGUI.BankOfChad.addMonthlyInterest();

        }
    }

    private class ExitHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}