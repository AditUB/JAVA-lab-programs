package Exceptions.BankExcep;

public class NameAgeExcep extends Throwable {
    int age;
    String name;

    NameAgeExcep(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Age below 18 ie " + age + "\nName must have more than  3 letters " + name;
    }
}
