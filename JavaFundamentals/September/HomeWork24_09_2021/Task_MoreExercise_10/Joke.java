package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_MoreExercise_10;


public class Joke {
    private String Username;
    private String Email;
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private int JokeID;
    private String JokeText;
    RandomJoke randJoke = new RandomJoke();


    public Joke(String username, String email, String firstName, String lastName, String phoneNumber, int jokeID, String jokeText) {
        Username = username;
        Email = email;
        FirstName = firstName;
        LastName = lastName;
        PhoneNumber = phoneNumber;
        JokeID = jokeID;
        JokeText = jokeText;
    }

    public Joke(String username, String email, String firstName, String lastName, String phoneNumber, int jokeID) {
        Username = username;
        Email = email;
        FirstName = firstName;
        LastName = lastName;
        PhoneNumber = phoneNumber;
        JokeID = jokeID;
        JokeText = randJoke.generateRandomJoke();

    }

    public String getUsername() {
        return Username;
    }

    public String returnUsername() {
        return this.Username;
    }

    public String getLastName() {
        return LastName;
    }

    public int getJokeID() {
        return JokeID;
    }

    @Override
    public String toString() {
        return  "Author: " + this.FirstName +
                " " + this.getLastName() +
                " posted a joke " + this.JokeText;
    }

    public String JokeString() {
        return this.JokeText;
    }
}
