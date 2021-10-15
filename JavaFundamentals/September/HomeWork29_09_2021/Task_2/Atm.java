package adv.JavaFundamentals.September.HomeWork29_09_2021.Task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Atm extends JFrame implements ActionListener {
public JTextField passwordField;
public JButton enterPasswordButton;
public JLabel titleLabel;
public JLabel titleLabel1;
public int wrongPinCounter;

    MainPage nextPage = new MainPage();

    public Atm() {
        super("Advance ATM");
        setSize(300,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);


        titleLabel = new JLabel("Welcome to AA ATM");
        titleLabel.setBounds(90,0,250,100);
        titleLabel.setForeground(Color.GRAY);
        add(titleLabel);

        titleLabel1 = new JLabel("Enter your pincode.");
        titleLabel1.setBounds(90,20,250,100);
        titleLabel1.setForeground(Color.GRAY);
        add(titleLabel1);

        passwordField = new JTextField("Your PIN 0101");
        passwordField.setBounds(100,90,100,20);
        passwordField.setForeground(Color.decode("#bbbbbb"));
        passwordField.setHorizontalAlignment(JTextField.CENTER);
        passwordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                passwordField.setText("");
            }
        });
        add(passwordField);

        enterPasswordButton = new JButton("Enter");
        enterPasswordButton.setBounds(100,120,100,20);
        enterPasswordButton.addActionListener(this);
        add(enterPasswordButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterPasswordButton) {
            if (!passwordField.getText().equals("0101")) {
                wrongPinCounter++;
                JOptionPane.showMessageDialog(null,"Wrong PIN" + wrongPinCounter, "Wrong PIN", JOptionPane.WARNING_MESSAGE);
                if (wrongPinCounter == 3) {
                    JOptionPane.showMessageDialog(null,"YOUR ACCOUNT WHERE BLOCKED!!", "BLOCKED", JOptionPane.WARNING_MESSAGE);
                    remove(enterPasswordButton);
                    remove(passwordField);
                }
            } else {
                JOptionPane.showMessageDialog(null,"Welcome to AA ATM", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                nextPage.setVisible(true);
                setVisible(false);
                dispose();
            }

        }

    }
}
