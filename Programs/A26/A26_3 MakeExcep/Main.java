package Exceptions.MakeExcep;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        try {
            MyClass.Sub(a, b);
        } catch (CreateExcep e) {
            e.printStackTrace();
        }
    }

}
