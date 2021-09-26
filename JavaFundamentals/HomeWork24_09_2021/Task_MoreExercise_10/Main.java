package adv.JavaFundamentals.HomeWork24_09_2021.Task_MoreExercise_10;

public class Main {

    public static void main(String[] args) {
        /*
        * Add new Object to Array(DB).
        * Requests.addJokes(String username, String email, String fName, String lName, String phoneNumber, int id, String joke)
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

        Requests.addJokes("Shegadjiqta", "jokera@123.sa", "Dragan", "Petkan", "+359895478523",1,"Dve ptichki leteli ednata na lqvo, a drugata na dqsno");
        Requests.addJokes("GoshkoMaitapa", "gosheto@123.so", "Gosho", "Tutmanikov", "+359893269854", 2,  "pile shareno rometo mnogo e zdravo");
        Requests.addJokes("GoshkoMaitapa", "gosheto@123.so", "Gosho", "Tutmanikov", "+359893269854", 3,  "pile pileshareno sumkriqta e losha");
        Requests.addJokes("Ivanka", "Veneto@123.so", "Tapata", "Trakata", "+359893269854", 4,  "ribata e gadna pile");

        Requests.returnAllUsers();
    }

}
