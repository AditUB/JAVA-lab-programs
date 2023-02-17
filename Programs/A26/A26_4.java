package Exceptions;

public class Throwss {
    static void test1() throws ClassNotFoundException {
        Class.forName("Exceptions.Mainn");
    }

    static void test2() throws ClassNotFoundException {
        test1();
    }

    public static void main(String[] args) {
        try {
            test2();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
    }
}
