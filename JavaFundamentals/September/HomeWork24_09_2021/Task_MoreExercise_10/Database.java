package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_MoreExercise_10;

import java.util.ArrayList;

public class Database {
    private static final ArrayList<Joke> jokeDatabase = new ArrayList<>();

    public int returnSize() {
        return jokeDatabase.size();
    }

    public void setJokeDatabase(Joke user) {
        jokeDatabase.add(user);
    }

    public ArrayList<Joke> returnDb() {
        return new ArrayList<>(jokeDatabase);
    }

    public void removeJokeByID(int id) {
        jokeDatabase.remove(id);
    }
}
