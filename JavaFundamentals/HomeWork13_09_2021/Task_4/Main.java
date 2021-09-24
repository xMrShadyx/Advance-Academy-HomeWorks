package adv.JavaFundamentals.HomeWork13_09_2021.Task_4;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard;
    private static double balance;

    public static void main(String[] args) {
        balance = 10000;
        keyboard = new Scanner(System.in);
        System.out.println("Въведете, желаната сума за дърпане.");
        atm(keyboard.nextDouble());

    }

    public static void atm(double moneyToWithdraw) {
        if (moneyToWithdraw == 10 || moneyToWithdraw == 20 || moneyToWithdraw == 50 || moneyToWithdraw == 100) {
            balance -= moneyToWithdraw;
            System.out.printf("Вие изтеглихте %.2f лева и вашият баланс е %.2f лева.", moneyToWithdraw, balance);

        } else {
            System.out.println("Въведената сума е грешна.");
        }
    }
}
