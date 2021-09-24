package adv.JavaFundamentals.HomeWork15_09_2021.Task_2;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
//        String pinCode = keyboard.nextLine();

        Client client = new Client("Ivancho");
        client.withdraw(400);
        client.withdraw(100);
        client.withdraw(120);
        client.withdraw(15);
        System.out.println();
        client.showBalance("0432");
        client.showBalance("0432");
        client.showBalance("0432");
        client.showBalance("0432");
        client.showBalance("0432");

        client.helpFromIndianGuy();

        client.showBalance("0101");


    }
}
