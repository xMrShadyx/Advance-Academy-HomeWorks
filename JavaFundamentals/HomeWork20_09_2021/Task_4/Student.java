package adv.HomeWork20_09_2021.Task_4;

import java.util.Locale;

public class Student {
    private final String fullName;
    private final int age;
    private final int currentClass;
    private final String bio;

    public Student(String fullName, int age, int currentClass, String bio) {
        this.fullName = fullName;
        this.age = age;
        this.currentClass = currentClass;
        this.bio = bio.toLowerCase(Locale.ROOT);
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getAge() {
        return this.age;
    }

    public int getCurrentClass() {
        return this.currentClass;
    }

    public String getBio() {
        return this.bio;
    }

    public void getInfo() {
        if (this.currentClass == 0) {
            System.out.printf("My name is %s, i'm %d years old, and this is my bio: %s%n", this.fullName, this.age, this.bio);
        } else {
            System.out.printf("My name is %s, i'm %d years old, and my current year at school is %d, and this is my bio: %s%n", this.fullName, this.age, this.currentClass, this.bio);
        }
    }
}
