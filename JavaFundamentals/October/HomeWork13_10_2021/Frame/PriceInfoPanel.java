package adv.JavaFundamentals.October.HomeWork13_10_2021.Frame;

import javax.swing.*;
import java.awt.*;

public class PriceInfoPanel {
    public JPanel priceInfo;

    public JLabel monthlyPayLeva;
    public JLabel yearlyPayLeva;

    public JLabel monthlyPayEuro;
    public JLabel yearlyPayEuro;

    PriceInfoPanel() {
        priceInfo = new JPanel();
        priceInfo.setBounds(70,490,530,65);
        priceInfo.setBackground(Color.GRAY);
        priceInfo.setLayout(null);
        priceInfo.setBorder(BorderFactory.createLineBorder(Color.black));

        monthlyPayLeva = new JLabel("Общо за един месец (лева): " + " лв.");
        monthlyPayLeva.setBounds(10,15,200,15);
        monthlyPayLeva.setForeground(Color.WHITE);
        priceInfo.add(monthlyPayLeva);

        yearlyPayLeva = new JLabel("Общо за едина година (лева): " + " лв.");
        yearlyPayLeva.setBounds(10,35,200,12);
        yearlyPayLeva.setForeground(Color.WHITE);
        priceInfo.add(yearlyPayLeva);

        monthlyPayEuro = new JLabel("Общо за един месец (euro): " + " eu.");
        monthlyPayEuro.setBounds(280,15,200,15);
        monthlyPayEuro.setForeground(Color.WHITE);
        priceInfo.add(monthlyPayEuro);

        yearlyPayEuro = new JLabel("Общо за едина година (euro): " + " eu.");
        yearlyPayEuro.setBounds(280,35,200,12);
        yearlyPayEuro.setForeground(Color.WHITE);
        priceInfo.add(yearlyPayEuro);
    }
}
