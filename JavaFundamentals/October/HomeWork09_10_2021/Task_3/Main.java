package adv.JavaFundamentals.October.HomeWork09_10_2021.Task_3;

public class Main {
    public static void main(String[] args) {
        System.out.println(seatsInTheater(16, 11, 5, 3));
    }

    public static int seatsInTheater(int nCols, int nRows, int cols, int rows) {
        return (nCols - (cols - 1)) * (nRows - rows);
    }
}
