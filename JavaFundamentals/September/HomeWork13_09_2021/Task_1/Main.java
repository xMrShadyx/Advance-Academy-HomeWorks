package adv.JavaFundamentals.September.HomeWork13_09_2021.Task_1;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Enter range between 100 ~ 200: ");
        int range = keyboard.nextInt();
        System.out.println("Enter firstDelimiter: ");
        int firstDelimiter = keyboard.nextInt();
        System.out.println("Enter secondDelimiter: ");
        int secondDelimiter = keyboard.nextInt();

        numberReader(range, firstDelimiter, secondDelimiter);


    }

    public static void numberReader(int range, int firstDelimiter, int secondDelimiter) {
        while (!(range > 100 && range < 200)) {
            System.out.println("Enter new range between 100 ~ 200!!");
            range = keyboard.nextInt();
        }

        for (int i = 0; i < range; i++) {
            if (i % firstDelimiter == 0 && i % secondDelimiter == 0) {
                System.out.println(i);
            }

        }
    }


}
