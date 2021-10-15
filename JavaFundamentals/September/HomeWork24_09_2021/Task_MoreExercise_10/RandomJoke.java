package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_MoreExercise_10;

import java.util.ArrayList;
import java.util.Random;

public class RandomJoke {
    public static ArrayList<String> randomJokes = new ArrayList<>();
    Random randNumber = new Random();

    public void addRandomJoke(String jokeText) {
        randomJokes.add(jokeText);
        System.out.println("Joke has been added: " + jokeText);
    }

    public void showRandomJokes() {
        if (!isEmpty()) {
            for (int i = 0; i < randomJokes.size(); i++) {
                System.out.println(randomJokes.get(i));
            }
        } else {
            System.out.println("Random jokes array is empty.");
        }
    }

    public String generateRandomJoke() {
        if (!isEmpty()) {
            int randomIndex = randNumber.nextInt(randomJokes.size() -1);
            return randomJokes.get(randomIndex);
        } else {
            return "Random jokes array is empty.";
        }

    }

    public boolean isEmpty() {
        return randomJokes.size() == 0;
    }
}
