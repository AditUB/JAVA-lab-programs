package Exceptions.MakeExcep;

public class MyClass {
    static void Sub(int a, int b) throws CreateExcep {
        if (a > b)
            System.out.println("The result is " + (a - b));
        else
            throw new CreateExcep(a, b);
    }
}
