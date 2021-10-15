package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_MoreExercise_9;

public class Main {
    public static void main(String[] args) {
        printEven();
    }

    public static void printEven() {
        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
