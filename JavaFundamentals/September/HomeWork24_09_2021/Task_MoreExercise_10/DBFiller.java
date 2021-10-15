package adv.JavaFundamentals.September.HomeWork24_09_2021.Task_MoreExercise_10;

public class DBFiller {
    RandomJoke rand = new RandomJoke();

    public void Initialize() {
        rand.addRandomJoke("I'm afraid for the calendar. Its days are numbered.");
        rand.addRandomJoke("My wife said I should do lunges to stay in shape. That would be a big step forward.");
        rand.addRandomJoke("Why do fathers take an extra pair of socks when they go golfing? In case they get a hole in one!");
        rand.addRandomJoke("Singing in the shower is fun until you get soap in your mouth. Then it's a soap opera.");
        rand.addRandomJoke("What do a tick and the Eiffel Tower have in common? They're both Paris sites.");
        rand.addRandomJoke("What do you call a fish wearing a bowtie? Sophisticated.");
        rand.addRandomJoke("How do you follow Will Smith in the snow? You follow the fresh prints.");
        rand.addRandomJoke("If April showers bring May flowers, what do May flowers bring? Pilgrims.");
        rand.addRandomJoke("I thought the dryer was shrinking my clothes. Turns out it was the refrigerator all along.");

        Requests.addJokes("Shegadjiqta", "jokera@123.sa", "Dragan", "Petkan", "+359895478523",1,"Dve ptichki leteli ednata na lqvo, a drugata na dqsno");
        Requests.addJokes("GoshkoMaitapa", "gosheto@123.so", "Gosho", "Tutmanikov", "+359893269854", 2,  "pile shareno rometo mnogo e zdravo");
        Requests.addJokes("GoshkoMaitapa", "gosheto@123.so", "Gosho", "Tutmanikov", "+359893269854", 3,  "pile pileshareno sumkriqta e losha");
        Requests.addJokes("Ivanka", "Veneto@123.so", "Tapata", "Trakata", "+359893269854", 4);
    }

}
