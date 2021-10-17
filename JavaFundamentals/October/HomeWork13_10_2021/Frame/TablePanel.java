package adv.JavaFundamentals.October.HomeWork13_10_2021.Frame;

import adv.JavaFundamentals.October.HomeWork13_10_2021.Models.TableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class TablePanel extends JFrame {
    public JPanel tablePanel;
    public JTable table;
    public static DefaultTableModel defaultTable;
    public JScrollPane pane;

    public static InputOutputPanel ip;
    public static TableModel tb;
    public static ArrayList<TableModel> tbArray;
    public static PriceInfoPanel pi;


    TablePanel() {
        tablePanel = new JPanel();
        tablePanel.setBounds(70, 150, 530, 330);
        tablePanel.setLayout(null);
        tablePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        tbArray = new ArrayList<>();
        pi = new PriceInfoPanel();


        String[] columns = {"Сметка", "Краен Срок", "Крайна Дата", "Вноска (Лева)"};
        defaultTable = new DefaultTableModel();
        defaultTable.setColumnIdentifiers(columns);

        table = new JTable(defaultTable);

        pane = new JScrollPane(table);
        pane.setBounds(0, 0, 530, 330);
        tablePanel.add(pane);


    }

    public static void addToTable() {
        String nameField = InputOutputPanel.billsNameField.getText();
        String endDate = InputOutputPanel.finalDateField.getText();
        Date date = InputOutputPanel.dateChooser.getDate();
        String amount = InputOutputPanel.paymentField.getText();

        tb = new TableModel(nameField, endDate, date, amount);
        tbArray.add(tb);
        Object[] row = new Object[4];
        for (TableModel tb : tbArray) {
            row[0] = nameField;
            row[1] = endDate;
            row[2] = date;
            row[3] = amount;
        }
        defaultTable.addRow(row);


    }

    public static void getMonthlyBill() {
        double result = 0.0;
        for (TableModel tb : tbArray) {
            result += Double.parseDouble(tb.getMoneyAmount());
        }
        PriceInfoPanel.monthlyPayLeva.setText(String.format("Общо за един месец (лева): %.2f лв.", result));
        PriceInfoPanel.yearlyPayLeva.setText(String.format("Общо за едина година (лева): %.2f лв.", (result * 12)));

        PriceInfoPanel.monthlyPayEuro.setText(String.format("Общо за един месец (euro): %.2f eu.", result / 1.95583));
        PriceInfoPanel.yearlyPayEuro.setText(String.format("Общо за едина година (euro): %.2f eu.", (result * 12) / 1.95583));

    }

}
