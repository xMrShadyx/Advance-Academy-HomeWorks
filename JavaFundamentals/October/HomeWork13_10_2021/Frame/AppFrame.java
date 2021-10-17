package adv.JavaFundamentals.October.HomeWork13_10_2021.Frame;

import javax.swing.*;

public class AppFrame extends JFrame {
    public InputOutputPanel topMenuPanel;
    public TablePanel tablePanel;
    public PriceInfoPanel priceInfo;


    public AppFrame() {
        super("My Bills App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(700, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        topMenuPanel = new InputOutputPanel();
        topMenuPanel.topPanelMenu.setVisible(true);
        add(topMenuPanel.topPanelMenu);

        tablePanel = new TablePanel();
        tablePanel.tablePanel.setVisible(true);
        add(tablePanel.tablePanel);

        priceInfo = new PriceInfoPanel();
        priceInfo.priceInfo.setVisible(true);
        add(priceInfo.priceInfo);


    }


}
