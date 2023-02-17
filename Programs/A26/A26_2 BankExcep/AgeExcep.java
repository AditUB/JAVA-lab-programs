package Exceptions.BankExcep;

public class AgeExcep extends Throwable {
    int age;

    AgeExcep(int age) {
        this.age = age;
    }

    public String toString() {
        return "Age below 18 ie " + age;
    }
}
