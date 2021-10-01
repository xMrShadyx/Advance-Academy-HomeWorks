package adv.JavaFundamentals.HomeWork29_09_2021.Task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class MainPage extends JFrame implements ActionListener {
    public JButton value10Button;
    public JButton value20Button;
    public JButton value50Button;
    public JButton value100Button;
    public JButton addBalanceButton;
    public JButton withdrawButton;
    public JButton customAmountButton;

    public static double currentBalance;
    public static double amountToWithdraw;

    public JLabel currentBalanceLabel;
    public JLabel amountToWithdrawLabel;
    public JLabel showAmountLabel;


    public MainPage() {
        super("Advance ATM");
        setSize(300,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);
        withdrawButton.setBounds(90,180,100,20);
        withdrawButton.setHorizontalAlignment(JButton.CENTER);
        add(withdrawButton);

        showAmountLabel = new JLabel("$" + amountToWithdraw, SwingConstants.CENTER);
        showAmountLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        showAmountLabel.setBounds(70,90, 150,40);

        add(showAmountLabel);

        amountToWithdrawLabel = new JLabel("Amount to withdraw: ");
        amountToWithdrawLabel.setBounds(85,70, 150,10);
        add(amountToWithdrawLabel);

        addBalanceButton = new JButton("Add Balance");
        addBalanceButton.setBounds(0,0,110,15);
        addBalanceButton.addActionListener(this);
        add(addBalanceButton);

        currentBalanceLabel = new JLabel("Balance: $" + currentBalance);
        currentBalanceLabel.setBounds(120,0,110,15);
        add(currentBalanceLabel);


        value10Button = new JButton("+10$");
        value10Button.addActionListener(this);
        value10Button.setBounds(5,100,80,20);
        value10Button.setHorizontalAlignment(JButton.CENTER);
        add(value10Button);

        value20Button = new JButton("+20$");
        value20Button.addActionListener(this);
        value20Button.setBounds(5,125,80,20);
        value20Button.setHorizontalAlignment(JButton.CENTER);
        add(value20Button);

        customAmountButton = new JButton("Other");
        customAmountButton.addActionListener(this);
        customAmountButton.setBounds(5,150,80,20);
        customAmountButton.setHorizontalAlignment(JButton.CENTER);
        add(customAmountButton);

        value50Button = new JButton("+50$");
        value50Button.addActionListener(this);
        value50Button.setBounds(200,100,80,20);
        value50Button.setHorizontalAlignment(JButton.CENTER);
        add(value50Button);

        value100Button = new JButton("+100$");
        value100Button.addActionListener(this);
        value100Button.setBounds(200,125,80,20);
        value100Button.setHorizontalAlignment(JButton.CENTER);
        add(value100Button);
    }

    public boolean isCurrentBalance() {
        return currentBalance <= 0;
    }

    public void processTransaction(double x) {
        if (currentBalance < x) {
            JOptionPane.showMessageDialog(null,"You cannot withdraw this amount of money", "!Money" , JOptionPane.WARNING_MESSAGE);
        } else {
            currentBalance -= x;
            amountToWithdraw += x;
            currentBalanceLabel.setText("Balance: $" + currentBalance);
            showAmountLabel.setText("$" + amountToWithdraw);
        }
    }

    public void outOfMoney() {
        JOptionPane.showMessageDialog(null,"Out of money", "Out of Money" , JOptionPane.WARNING_MESSAGE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBalanceButton) {
            try {
                String newBalance = JOptionPane.showInputDialog("Enter new balance.");
                currentBalance = Double.parseDouble(newBalance);
                currentBalanceLabel.setText("Balance: $" + currentBalance);
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null,"Wrong input format \nPlease enter numbers.", "Wrong format." , JOptionPane.WARNING_MESSAGE);
            }

        } else if (e.getSource() == value10Button) {
            if (!isCurrentBalance()) {
                processTransaction(10);
            } else {
                outOfMoney();
            }
        } else if (e.getSource() == value20Button) {
            if (!isCurrentBalance()) {
                processTransaction(20);
            } else {
                outOfMoney();
            }
        } else if (e.getSource() == value50Button) {
            if (!isCurrentBalance()) {
                processTransaction(50);
            } else {
                outOfMoney();
            }
        } else if (e.getSource() == value100Button) {
            if (!isCurrentBalance()) {
                processTransaction(100);
            } else {
                outOfMoney();
            }
        } else if (e.getSource() == customAmountButton){
            String amount = JOptionPane.showInputDialog("Custom amount to withdraw");
            if (!isCurrentBalance()) {
                try {
                    processTransaction(Double.parseDouble(amount));
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null,"Wrong input format \nPlease enter numbers.", "Wrong format." , JOptionPane.WARNING_MESSAGE);
                }
            } else {
                outOfMoney();
            }

        } else if (e.getSource() == withdrawButton) {
            int result = JOptionPane.showConfirmDialog(null,"You withdraw: $" + amountToWithdraw + "\nWould you like to continue?");
            if (result == 0) {
                amountToWithdraw = 0;
                showAmountLabel.setText("$" + amountToWithdraw);
            } else if (result == 1) {
                setVisible(false);
                dispose();
            }
        }
    }
}
