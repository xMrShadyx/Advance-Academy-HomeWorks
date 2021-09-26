package adv.JavaFundamentals.HomeWork24_09_2021.Task_MoreExercise_10;

public class Main {
    
    public static void main(String[] args) {

        Requests.addJokes("Shegadjiqta", "jokera@123.sa", "Dragan", "Petkan", "+359895478523",1,"Dve ptichki leteli ednata na lqvo, a drugata na dqsno");
        Requests.addJokes("GoshkoMaitapa", "gosheto@123.so", "Gosho", "Tutmanikov", "+359893269854", 2,  "pile shareno rometo mnogo e zdravo");
        Requests.addJokes("GoshkoMaitapa", "gosheto@123.so", "Gosho", "Tutmanikov", "+359893269854", 3,  "pile pileshareno sumkriqta e losha");
        Requests.addJokes("Ivanka", "Veneto@123.so", "Tapata", "Trakata", "+359893269854", 4,  "ribata e gadna pile");

//        returnJokes(db.returnDb());
//        System.out.println();
//        System.out.println();
//        returnJokesFromUser("GoshkoMaitapa");
//        getAllJokesByID();
//        removeByJokeID(2);
//        System.out.println();
//        returnJokes(db.returnDb());
//        System.out.println();
        Requests.searchText("pileshareno");
    }

}
