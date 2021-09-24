package adv.HomeWork08_09_2021.Task_3;

public class Main {
    public static void main(String[] args) {
        System.out.println(monthlyContribution(5000.0, 24, 7));

    }

    public static String monthlyContribution(double amount, int period, int annualInterestRate) {
        double interestRate = (double) annualInterestRate / 100;
        double currentRate = amount * interestRate;


        return String.format("Monthly Contribution of: %.2f lv. %n" +
                "for %d month period of time, with %.2f%% Interest rate, %n" +
                "total returning amount is: %.2f lv.", currentRate, period, interestRate,currentRate + amount);
    }
}
