package adv.JavaFundamentals.September.HomeWork20_09_2021.Task_4;

import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static ArrayList<Student> arrayList;

    public static void main(String[] args) {
        arrayList = new ArrayList<>();

        Student student1 =  new Student("Nikolai Ivanov", 18, 11, "I wanna become programmer.");
        Student student2 =  new Student("Pesho Ivanov", 15, 8, "Programming is awesome.");
        Student student3 =  new Student("Toshko Letecov", 8, 2, "I wanna be pilot.");
        Student student4 =  new Student("Misho Pileto", 14, 7, "I wanna be MasterChef.");
        Student student5 = new Student("Chicho Mitko", 65,0, "I wanna become java developer.");

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);


        String searchEngine = "prog".toLowerCase(Locale.ROOT);
        int enumerate = 0;
        for (Student stud : arrayList) {
            if (stud.getBio().contains(searchEngine)) {
                System.out.print(enumerate + ": ");
                stud.getInfo();
                enumerate++;
            }
        }
    }
}
