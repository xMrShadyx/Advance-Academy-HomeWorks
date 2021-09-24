package adv.JavaFundamentals.HomeWork15_09_2021.Task_1;

public class Main {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher("Ivanka", 35, 650.75);
        Student myStudent = new Student("Inancho", 15, "A+");

        myStudent.getInfo();
        System.out.println();

        myTeacher.getInfo();
    }
}
