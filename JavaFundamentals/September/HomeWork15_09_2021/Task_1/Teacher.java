package adv.JavaFundamentals.September.HomeWork15_09_2021.Task_1;

public class Teacher extends User{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void getInfo() {
        System.out.println("My name is: " + getName() + ", and i'm " + getAge() + " year's old." + " And my salary is " + this.salary);
    }
}
