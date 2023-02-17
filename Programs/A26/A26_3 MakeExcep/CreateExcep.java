package Exceptions.MakeExcep;

public class CreateExcep extends Throwable {
    int a, b;

    CreateExcep(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "value of b = " + b + " is greatest";
    }
}
