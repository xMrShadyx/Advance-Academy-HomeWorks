package adv.JavaFundamentals.September.HomeWork29_09_2021.Task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Calculator extends JFrame implements ActionListener {
    public JButton addButton;
    public JButton subtractButton;
    public JButton multiplyButton;
    public JButton divideButton;

    public JTextField firstNumberField;
    public JTextField secondNumberField;

    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,120);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);


        addButton = new JButton("Add");
        addButton.addActionListener(this);
        addButton.setBounds(10,10,80,20);
        add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(this);
        subtractButton.setBounds(10,40,80,20);
        add(subtractButton);

        firstNumberField = new JTextField("First Num:");
        firstNumberField.setBounds(100, 10, 90, 20);
        firstNumberField.setForeground(new Color(169, 169, 169));
        firstNumberField.setHorizontalAlignment(JTextField.CENTER);
        firstNumberField.addFocusListener(f);
        add(firstNumberField);

        secondNumberField = new JTextField("Second Num:");
        secondNumberField.setBounds(100, 40, 90, 20);
        secondNumberField.setForeground(new Color(169, 169, 169));
        secondNumberField.setHorizontalAlignment(JTextField.CENTER);
        secondNumberField.addFocusListener(f1);
        add(secondNumberField);

        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(this);
        multiplyButton.setBounds(200,10,80,20);
        add(multiplyButton);

        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        divideButton.setBounds(200,40,80,20);
        add(divideButton);
    }

    FocusListener f = new FocusListener() {

        public void focusGained(FocusEvent e) {
            if (firstNumberField.getText().equals("First Num:")) {
                firstNumberField.setText("");
                firstNumberField.setForeground(new Color(153, 153, 153));
            }
        }

        public void focusLost(FocusEvent e) {
            if (firstNumberField.getText().equals("")) {
                firstNumberField.setText("First Num:");
                firstNumberField.setForeground(new Color(169, 169, 169));
            }
        }
    };

    FocusListener f1 = new FocusListener() {

        public void focusGained(FocusEvent e) {
            if (secondNumberField.getText().equals("Second Num:")) {
                secondNumberField.setText("");
                secondNumberField.setForeground(new Color(153, 153, 153));
            }
        }

        public void focusLost(FocusEvent e) {
            if (secondNumberField.getText().equals("")) {
                secondNumberField.setText("Second Num:");
                secondNumberField.setForeground(new Color(169, 169, 169));
            }
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        double a = 0.0;
        double b = 0.0;
        try {
            a = Double.parseDouble(firstNumberField.getText());
            b = Double.parseDouble(secondNumberField.getText());
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Mismatch Input please enter \n " +
                    "Integer or Double number.","Wrong Input!!",JOptionPane.WARNING_MESSAGE);
            return;
        }

        double result = 0;
        if (e.getSource() == addButton) {
            result = a + b;
            JOptionPane.showMessageDialog(null, "Add Result is: " + result);
        } else if (e.getSource() == multiplyButton) {
            result = a * b;
            JOptionPane.showMessageDialog(null, "Multiply Result is: " + result);
        } else if (e.getSource() == subtractButton) {
            result = a - b;
            JOptionPane.showMessageDialog(null, "Subtract Result is: " + result);
        } else if (e.getSource() == divideButton) {
            if (a == 0 || b == 0) {
                JOptionPane.showMessageDialog(null, "You cannot divide by 0","Wrong Input!!",JOptionPane.WARNING_MESSAGE);
            } else {
                result = a / b;
                JOptionPane.showMessageDialog(null, "Divide Result is: " + result);
            }

        }

    }
}
