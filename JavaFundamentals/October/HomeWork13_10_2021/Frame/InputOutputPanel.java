package adv.JavaFundamentals.October.HomeWork13_10_2021.Frame;


import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InputOutputPanel extends JFrame{
    public JPanel topPanelMenu;

    public JLabel billsNameLabel;
    public JLabel finalDateLabel;
    public JLabel endingDateLabel;
    public JLabel paymentLabel;

    public JTextField billsNameField;
    public JTextField finalDateField;
    public JTextField endingDateField;
    public JTextField paymentField;

    public JButton closesToEndButton;
    public JButton importDataButton;

    public JDateChooser dateChooser;


    InputOutputPanel() {
        topPanelMenu = new JPanel();
        topPanelMenu.setBounds(70,20,530,100);
        topPanelMenu.setBackground(Color.LIGHT_GRAY);
        topPanelMenu.setLayout(null);
        topPanelMenu.setBorder(BorderFactory.createLineBorder(Color.black));

        dateChooser = new JDateChooser();


        billsNameLabel = new JLabel("Сметка");
        billsNameLabel.setBounds(80,10,100,20);
        topPanelMenu.add(billsNameLabel);

        billsNameField = new JTextField("");
        billsNameField.setBounds(50,30,100,20);
        billsNameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        topPanelMenu.add(billsNameField);

        finalDateLabel = new JLabel("Краен Срок");
        finalDateLabel.setBounds(175,10,100,20);
        topPanelMenu.add(finalDateLabel);

        finalDateField = new JTextField("");
        finalDateField.setBounds(160,30,100,20);
        finalDateField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        topPanelMenu.add(finalDateField);

        finalDateLabel = new JLabel("Крайна Дата");
        finalDateLabel.setBounds(280,10,100,20);
        topPanelMenu.add(finalDateLabel);

        dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd-MM-yyyy");
        dateChooser.setBounds(270,30,100,20);
        dateChooser.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        topPanelMenu.add(dateChooser);


        endingDateField = new JTextField("");
        endingDateField.setBounds(270,30,100,20);
        endingDateField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        topPanelMenu.add(endingDateField);

        paymentLabel = new JLabel("Вноска (Лева)");
        paymentLabel.setBounds(390,10,100,20);
        topPanelMenu.add(paymentLabel);

        paymentField = new JTextField("");
        paymentField.setBounds(380,30,100,20);
        paymentField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        topPanelMenu.add(paymentField);

        importDataButton = new JButton("Зареди");
        importDataButton.setBounds(120,60,140,20);
        importDataButton.setBorder(null);
        importDataButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                importDataButton.setBackground(Color.DARK_GRAY);
                importDataButton.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                importDataButton.setBackground(UIManager.getColor("control"));
                importDataButton.setForeground(Color.BLACK);

            }
        });
        topPanelMenu.add(importDataButton);

        closesToEndButton = new JButton("Наближаващ край");
        closesToEndButton.setBounds(270,60,140,20);
        closesToEndButton.setBorder(null);
        closesToEndButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closesToEndButton.setBackground(Color.DARK_GRAY);
                closesToEndButton.setForeground(Color.WHITE);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                closesToEndButton.setBackground(UIManager.getColor("control"));
                closesToEndButton.setForeground(Color.BLACK);

            }
        });
        topPanelMenu.add(closesToEndButton);
    }

}
