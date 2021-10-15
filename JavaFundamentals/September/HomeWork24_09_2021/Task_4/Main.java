package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_4;

public class Main {
    public static void main(String[] args) {
        int number = 100;
        powerOf2Numbers(number);
    }

    public static void powerOf2Numbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println( (int) Math.pow(i,2));
        }
    }
}
