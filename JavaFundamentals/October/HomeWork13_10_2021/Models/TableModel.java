package adv.JavaFundamentals.October.HomeWork13_10_2021.Models;

import java.util.Date;

public class TableModel {
    public String billingName;
    public String endingDate;
    public Date dateChooser;
    public String moneyAmount;

    public TableModel(String billingName, String endingDate, Date dateChooser, String moneyAmount) {
        this.billingName = billingName;
        this.endingDate = endingDate;
        this.dateChooser = dateChooser;
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "TableModel{" +
                "billingName='" + billingName + '\'' +
                ", endingDate='" + endingDate + '\'' +
                ", dateChooser='" + dateChooser + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }
}
