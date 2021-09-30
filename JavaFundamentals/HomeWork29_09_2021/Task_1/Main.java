package adv.JavaFundamentals.HomeWork29_09_2021.Task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Main extends JFrame implements ActionListener{
    public JButton addButton;
    public JButton subtractButton;
    public JButton multiplyButton;
    public JButton divideButton;
    public JLabel resultLabel;

    public JTextField firstNumberField;
    public JTextField secondNumberField;

    public Main() {
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setResizable(false);
        setLayout(null);


        addButton = new JButton("Add");
        addButton.addActionListener(this);
        addButton.setBounds(10,10,80,20);
        add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.setBounds(10,40,80,20);
        add(subtractButton);

        firstNumberField = new JTextField("Enter first number");
        firstNumberField.setBounds(100, 10, 70, 20);
        firstNumberField.setForeground(new Color(169, 169, 169));
        firstNumberField.addFocusListener(f);
        add(firstNumberField);

        secondNumberField = new JTextField("Enter second number");
        secondNumberField.setBounds(100, 40, 70, 20);
        secondNumberField.setForeground(new Color(169, 169, 169));
        secondNumberField.addFocusListener(f);
        add(secondNumberField);

        multiplyButton = new JButton("Multiply");
        multiplyButton.setBounds(180,10,80,20);
        add(multiplyButton);

        divideButton = new JButton("Divide");
        divideButton.setBounds(180,40,80,20);
        add(divideButton);

        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(110,70,80,20);
        add(resultLabel);
    }

    FocusListener f = new FocusListener() {

        public void focusGained(FocusEvent e) {
            if (firstNumberField.getText().equals("Enter first number")) {
                firstNumberField.setText("");
                firstNumberField.setForeground(new Color(153, 153, 153));
            }

            if (secondNumberField.getText().equals("Enter second number")) {
                secondNumberField.setText("");
                secondNumberField.setForeground(new Color(153, 153, 153));
            }
        }

        public void focusLost(FocusEvent e) {
            if (firstNumberField.getText().equals("")) {
                firstNumberField.setText("Enter first number");
                firstNumberField.setForeground(new Color(169, 169, 169));
            }

            if (secondNumberField.getText().equals("")) {
                secondNumberField.setText("Enter second number");
                secondNumberField.setForeground(new Color(169, 169, 169));
            }
        }
    };

        public static void main(String[] args) {
            Main main = new Main();
            main.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = 0;
            int b = 0;
            int result = 0;
            if (e.getSource() == addButton) {
                a = Integer.parseInt(firstNumberField.getText());
                b = Integer.parseInt(secondNumberField.getText());
                result = a + b;
                JOptionPane.showMessageDialog(null, "Add Result is: " + result);

            }

        }
    }
