package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_MoreExercise_7;

public class Main {
    public static void main(String[] args) {
        weirdPrinting();
    }

    public static void weirdPrinting() {
        int printCounter = 0;
        for (int i = 1; i < 1000; i++) {
            printCounter++;
            if (printCounter == 10) {
                System.out.println("X");
                printCounter = 0;
            } else {
                System.out.println(i);
            }
        }
    }
}
