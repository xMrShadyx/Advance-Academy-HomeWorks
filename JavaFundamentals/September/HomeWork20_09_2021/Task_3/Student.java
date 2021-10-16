package adv.JavaFundamentals.September.HomeWork20_09_2021.Task_3;

public class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void getInfo() {
        System.out.printf("Здравейте, Аз съм %s, на %d години и със оценка %s%n", this.name, this.age, this.grade);
    }
}
