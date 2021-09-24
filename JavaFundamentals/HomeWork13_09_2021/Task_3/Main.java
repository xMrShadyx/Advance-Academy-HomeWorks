package adv.HomeWork13_09_2021.Task_3;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = keyboard.nextInt();
        singleNumIsPrime(number);


    }
    public static void singleNumIsPrime(int number) {
        while (!isPrime(number)) {
            System.out.println(number + " is not prime number, try another number.");
            System.out.println("Enter a number: ");
            number = keyboard.nextInt();
        }
        System.out.println(number + " is prime number.");
    }

    public static void forLoopIsPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is Prime number.");
            }
        }
    }

    public static boolean isPrime(int number) {
        int i = 2;
        boolean flag = false;
        while (i <= number / 2) {
            if (number % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        return !flag;
    }
}
