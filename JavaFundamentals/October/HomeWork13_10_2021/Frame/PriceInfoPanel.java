package adv.JavaFundamentals.October.HomeWork13_10_2021.Frame;

import javax.swing.*;
import java.awt.*;

public class PriceInfoPanel {
    public JPanel priceInfo;

    public static JLabel monthlyPayLeva;
    public static JLabel yearlyPayLeva;

    public static JLabel monthlyPayEuro;
    public static JLabel yearlyPayEuro;


    PriceInfoPanel() {
        priceInfo = new JPanel();
        priceInfo.setBounds(70, 490, 530, 65);
        priceInfo.setBackground(Color.GRAY);
        priceInfo.setLayout(null);
        priceInfo.setBorder(BorderFactory.createLineBorder(Color.black));


        monthlyPayLeva = new JLabel("Общо за един месец (лева): 0.0 лв.");
        monthlyPayLeva.setBounds(10, 15, 250, 15);
        monthlyPayLeva.setForeground(Color.WHITE);
        priceInfo.add(monthlyPayLeva);

        yearlyPayLeva = new JLabel("Общо за едина година (лева): 0.0 лв.");
        yearlyPayLeva.setBounds(10, 35, 250, 12);
        yearlyPayLeva.setForeground(Color.WHITE);
        priceInfo.add(yearlyPayLeva);

        monthlyPayEuro = new JLabel("Общо за един месец (euro): 0.0 eu.");
        monthlyPayEuro.setBounds(280, 15, 250, 15);
        monthlyPayEuro.setForeground(Color.WHITE);
        priceInfo.add(monthlyPayEuro);

        yearlyPayEuro = new JLabel("Общо за едина година (euro): 0.0 eu.");
        yearlyPayEuro.setBounds(280, 35, 250, 12);
        yearlyPayEuro.setForeground(Color.WHITE);
        priceInfo.add(yearlyPayEuro);
    }
}
