package adv.JavaFundamentals.HomeWork24_09_2021.Task_MoreExercise_10;

import java.util.ArrayList;

public class Main {
    public static Database db = new Database();

    public static void main(String[] args) {

        Joke joke1 = new Joke("Shegadjiqta", "jokera@123.sa", "Dragan", "Petkan", "+359895478523",1,"Dve ptichki leteli ednata na lqvo, a drugata na dqsno");
        Joke joke2 = new Joke("GoshkoMaitapa", "gosheto@123.so", "Gosho", "Tutmanikov", "+359893269854", 2,  "alfa rometo mnogo e zdravo");
        Joke joke3 = new Joke("GoshkoMaitapa", "gosheto@123.so", "Gosho", "Tutmanikov", "+359893269854", 3,  "sumkriqta e losha");
        Joke joke4 = new Joke("Ivanka", "Veneto@123.so", "Tapata", "Trakata", "+359893269854", 4,  "ribata e gadna");

        db.setJokeDatabase(joke1);
        db.setJokeDatabase(joke2);
        db.setJokeDatabase(joke3);
        db.setJokeDatabase(joke4);


        returnJokes(db.returnDb());
        System.out.println();
        returnJokesFromUser("GoshkoMaitapa");
    }

    public static void returnJokes(ArrayList<Joke> array) {
        System.out.println("Gets all jokes from database and returns them to the console: ");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).JokeString());
        }
    }

    public static void returnJokesFromUser(String name) {
        System.out.println("Gets all jokes from a single user, based on their Username: ");
        for (int i = 0; i < db.returnDb().size(); i++) {
            if (db.returnDb().get(i).getUsername().contains(name)) {
                System.out.println(db.returnDb().get(i).JokeString());
            }
        }
    }
}
