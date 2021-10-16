package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_2;

public class Main {
    public static void main(String[] args) {
        tipCalculator(245,15);
    }

    public static void tipCalculator(double moneyAmount, double tipPercent) {
        double tipAmount = moneyAmount * (tipPercent / 100);
        System.out.printf("За сметка от %.2f лева трябва да оставите %.2f лева", moneyAmount, tipAmount);
    }
}
