package adv.JavaFundamentals.September.HomeWork15_09_2021.Task_1;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("My name is: " + this.name + ", and i'm " + this.age + " year's old.");
    }
}
