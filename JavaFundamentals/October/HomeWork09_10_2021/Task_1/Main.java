package adv.JavaFundamentals.October.HomeWork09_10_2021.Task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(wave("hello"));
        System.out.println(wave("asperji"));
    }

        public static ArrayList<String> wave(String word) {
            ArrayList<String> currentWord = new ArrayList<>();

            for (int i = 0; i < word.length(); i++) {
                currentWord.add(word.replace(word.charAt(i), Character.toUpperCase(word.charAt(i))));
            }

            return currentWord;
        }
}
