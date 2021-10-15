package adv.JavaFundamentals.September.HomeWork20_09_2021.Task_3;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Student> arrayList;
    public static void main(String[] args) {
        arrayList = new ArrayList<>();

        Student student1 = new Student("Toshko", 15, "A+");
        Student student2 = new Student("Ivancho", 15, "A");
        Student student3 = new Student("Pesho", 12, "F");
        Student student4 = new Student("Gosho", 11, "F");
        Student student5 = new Student("Ivo", 8, "B");

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);

        System.out.println();
        int enumerate = 0;
        for (Student text : arrayList) {
            System.out.print(enumerate + ": ");
            text.getInfo();
            enumerate++;
        }
        System.out.println();


        arrayList.remove(student1);
        arrayList.remove(1);

        System.out.println();
        enumerate = 0;
        for (Student text : arrayList) {
            System.out.print(enumerate + ": ");
            text.getInfo();
            enumerate++;
        }
        System.out.println();

    }
}
