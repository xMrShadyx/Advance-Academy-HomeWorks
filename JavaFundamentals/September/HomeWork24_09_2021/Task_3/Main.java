package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_3;


public class Main {
    public static void main(String[] args) {
        String comment = "Hello, can you translate this message?";
        System.out.println(comment.replaceAll("[aeiouwyYAEIOUW]",""));
    }
}
