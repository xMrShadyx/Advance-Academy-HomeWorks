package adv.HomeWork15_09_2021.Task_1;

public class Student extends User{
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void getInfo() {
        System.out.println("My name is: " + getName() + ", and i'm " + getAge() + " year's old." + " And my grade is " + this.grade);
    }
}
