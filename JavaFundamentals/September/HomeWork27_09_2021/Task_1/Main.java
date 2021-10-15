package adv.JavaFundamentals.September.HomeWork27_09_2021.Task_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> itemsList = new ArrayList<>();
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        addItem("Dog");
        addItem("Cat");
        addItem("Cow");
        addItem("Mouse");
        addItem("Roaster");


        String currentItem = getItem();
        System.out.println(currentItem);
        System.out.print("Start guessing: ");
        String strToGuess = keyboard.nextLine();

        while (true) {
            if (gameOver()) {
                System.out.println("Game is over, out of items");
                return;
            }

            if (strToGuess.equals(currentItem)) {
                System.out.println("You guessed correct word was: " + currentItem);
                removeItem(currentItem);
                if (!gameOver()) {
                    currentItem = getItem();
                    System.out.println(currentItem);
                    System.out.print("Start guessing: ");
                } else {
                    System.out.println("Game is over, out of items");
                    return;
                }
            } else {
                System.out.print("Try Again: ");
            }
            strToGuess = keyboard.nextLine();
        }
    }

    public static boolean gameOver() {
        return getListSize() == 0;
    }

    public static void addItem(String str) {
        itemsList.add(str);
        System.out.println("Item have been added to list.");
    }

    public static String getItem() {
        Random rand = new Random();
        int new_random = rand.nextInt(getListSize());
        return itemsList.get(new_random);

    }

    public static int getListSize() {
        return itemsList.size();
    }

    public static void removeItem(String str) {
        itemsList.remove(str);
        System.out.println(str + " have been removed from game.");
    }


}
