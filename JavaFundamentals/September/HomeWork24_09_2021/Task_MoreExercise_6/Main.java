package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_MoreExercise_6;

public class Main {
    public static void main(String[] args) {
//        backwardForPrinting();
        backwardWhilePrinting();
    }

    public static void backwardForPrinting() {
        for (int i = 1000; i > 1; i--) {
            System.out.println(i);
        }
    }

    public static void backwardWhilePrinting() {
        int i = 1000;
        while (i > 1) {
            System.out.println(i);
            i--;
        }
    }
}
