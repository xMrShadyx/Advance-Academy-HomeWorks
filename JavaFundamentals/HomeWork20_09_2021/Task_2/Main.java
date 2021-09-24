package adv.HomeWork20_09_2021.Task_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayWords = new ArrayList<String>();
        arrayWords.add("Word 0");
        arrayWords.add("Word 1");
        arrayWords.add("Word 2");
        arrayWords.add("Word 3");
        arrayWords.add("Word 4");
        arrayWords.add("Word 5");
        arrayWords.add("Word 6");
        arrayWords.add("Word 7");
        arrayWords.add("Word 8");
        arrayWords.add("Word 9");

        for (String word : arrayWords) {
            System.out.print(word + " ");
        }
    }
}