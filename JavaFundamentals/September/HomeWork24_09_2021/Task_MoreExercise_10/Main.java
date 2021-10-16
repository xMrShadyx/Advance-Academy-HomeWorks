package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_MoreExercise_10;

public class Main {

    public static void main(String[] args) {
        DBFiller dbFiller = new DBFiller();

        /*
        * Add new Object to Array(DB).
        * to add More to DB -> DBFiller.java
        * Requests.addJokes(String username, String email, String fName, String lName, String phoneNumber, int id, String joke)
        *
        * In case you decide to leave empty String joke Field, so it will be fulfilled with random joke "to add RandomJoke -> DBFiller.java"
        * Requests.addJokes(String username, String email, String fName, String lName, String phoneNumber, int id)
        *
        * Returns all jokes from database:
        * Requests.returnJokes(ArrayList<Joke> array)
        *
        * Returns all usernames from DB:
        * Requests.returnAllUsers();
        *
        * Returns all jokes from specific user:
        * Requests.returnJokesFromUser(String name);
        *
        * Returns all jokes by ID:
        * Requests.getAllJokesByID();
        *
        * Removes joke object by JokeID
        * Requests.removeByJokeID(int id)
        *
        * Checking all objects jokeText to certain text, its IGNORCASE and IGNORSPACE.
        * Requests.searchText(String text);
        * */
        // This command Initialize the Database.
        dbFiller.Initialize();



    }

}
