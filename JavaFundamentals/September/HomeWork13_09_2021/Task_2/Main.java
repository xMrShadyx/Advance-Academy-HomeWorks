package adv.JavaFundamentals.September.HomeWork13_09_2021.Task_2;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNumber = keyboard.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = keyboard.nextInt();

        sum(firstNumber, secondNumber);
        subtract(firstNumber, secondNumber);
        multiplication(firstNumber, secondNumber);
        division(firstNumber, secondNumber);


    }

    public static boolean numberInRange(int firstNumber, int secondNumber) {
        return firstNumber >= 1 && firstNumber <= 10 && secondNumber >= 1 && secondNumber <= 10;
    }

    public static void rangeMessage() {
        System.out.println("One of your numbers doesn't met condition of range between 1 ~ 10");
    }


    public static void sum(int firstNum, int secondNum) {
        if (numberInRange(firstNum, secondNum)) {
            System.out.println("Sum of firstNumber and secondNumber is: " + (firstNum + secondNum));
        } else {
            rangeMessage();
        }
    }

    public static void subtract(int firstNum, int secondNum) {
        if (numberInRange(firstNum, secondNum)) {
            System.out.println("Subtract of firstNumber and secondNumber is: " + (firstNum - secondNum));
        } else {
            rangeMessage();
        }
    }

    public static void multiplication(int firstNum, int secondNum) {
        if (numberInRange(firstNum, secondNum)) {
            System.out.println("Multiplication of firstNumber and secondNumber is: " + (firstNum * secondNum));
        } else {
            rangeMessage();
        }
    }

    public static void division(int firstNum, int secondNum) {
        if (numberInRange(firstNum, secondNum)) {
            System.out.println("Division of firstNumber and secondNumber is: " + ((double) firstNum / secondNum));
        } else {
            rangeMessage();
        }
    }
}
