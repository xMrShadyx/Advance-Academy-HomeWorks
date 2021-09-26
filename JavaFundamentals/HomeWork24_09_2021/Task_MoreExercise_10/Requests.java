package adv.JavaFundamentals.HomeWork24_09_2021.Task_MoreExercise_10;

import java.util.ArrayList;
import java.util.Locale;

public class Requests {
    public static Database db = new Database();
    public static Joke joke;

    public static void addJokes(String username, String email, String fName, String lName, String phoneNumber, int id, String joke) {
        Joke newUser = new Joke(username, email, fName, lName, phoneNumber, id, joke);
        db.setJokeDatabase(newUser);
        System.out.println("Successfully added new jokes.");
    }

    public static void addJokes(String username, String email, String fName, String lName, String phoneNumber, int id) {
        Joke newUser = new Joke(username, email, fName, lName, phoneNumber, id);
        db.setJokeDatabase(newUser);
        System.out.println("Successfully added new jokes.");
    }



    public static void returnJokes(ArrayList<Joke> array) {
        System.out.println("Gets all jokes from database and returns them to the console: ");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).JokeString());

        }
    }

    public static void returnJokesFromUser(String name) {
        System.out.println("Gets all jokes from a single user, based on their Username: ");
        for (int i = 0; i < db.returnSize(); i++) {
            if (db.returnDb().get(i).getUsername().contains(name)) {
                System.out.println(db.returnDb().get(i).JokeString());
            }
        }
    }

    public static void returnAllUsers() {
        System.out.println("Gets all Usernames: ");
        for (int i = 0; i < db.returnSize(); i++) {
            System.out.println(db.returnDb().get(i).returnUsername());
        }
    }

    public static void getAllJokesByID() {
        System.out.println("Shows all jokes by ID: ");
        for (int i = 0; i < db.returnSize(); i++) {
            System.out.println("ID: " + db.returnDb().get(i).getJokeID() + " - Joke: " + (db.returnDb().get(i).JokeString()));
        }
    }

    public static void removeByJokeID(int id) {
        System.out.println("Remove element from Array by jokeID: ");
        for (int i = 0; i < db.returnSize(); i++) {
            if (db.returnDb().get(i).getJokeID() == id) {
                System.out.println(db.returnDb().get(i).JokeString() + "User with JokeID :" + id + " was removed from database.");
                db.removeJokeByID(i);
            }
        }
    }

    public static void searchText(String text) {
        for (int i = 0; i < db.returnSize(); i++) {
            String tempVar = db.returnDb().get(i).JokeString().replaceAll(" ", "").toLowerCase(Locale.ROOT);
            if (tempVar.contains(text.toLowerCase(Locale.ROOT))) {
                System.out.println(db.returnDb().get(i).JokeString());
            }
        }
    }
}
