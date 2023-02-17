package Exceptions.BankExcep;

public class NameExcep extends Throwable {
    String name;

    NameExcep(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name must have more than 3 letters " + name;
    }
}
