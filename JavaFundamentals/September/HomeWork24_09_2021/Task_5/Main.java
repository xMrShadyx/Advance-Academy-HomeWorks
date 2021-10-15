package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_5;

public class Main {
    public static StringBuilder newString;
    public static void main(String[] args) {
        newString = new StringBuilder();

        int number = 245;
        numberToPowerOf2ToString(number);
    }

    public static void numberToPowerOf2ToString(int number) {
        String numberToString = String.valueOf(number);
        for (int i = 0; i < numberToString.length(); i++) {
            int newValue = (int) Math.pow(numberToString.charAt(i)-48,2);
            newString.append(newValue);
        }

        System.out.println(newString);
    }

}
