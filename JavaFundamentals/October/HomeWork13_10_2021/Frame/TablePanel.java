package adv.JavaFundamentals.October.HomeWork13_10_2021.Frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablePanel extends JFrame {
    public JPanel tablePanel;
    public JTable table;
    public DefaultTableModel defaultTable;
    public JScrollPane pane;

    TablePanel() {
        tablePanel = new JPanel();
        tablePanel.setBounds(70,150,530,330);
        tablePanel.setLayout(null);
        tablePanel.setBorder(BorderFactory.createLineBorder(Color.black));

        String[] columns = {"Сметка", "Краен Срок", "Крайна Дата", "Вноска (Лева)"};
        defaultTable = new DefaultTableModel();
        defaultTable.setColumnIdentifiers(columns);

        table = new JTable(defaultTable);

        pane = new JScrollPane(table);
        pane.setBounds(0,0,530,330);
        tablePanel.add(pane);
    }
}
