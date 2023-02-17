package Exceptions;

public class Finally {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        try {
            System.out.println("Running try block");
            a = 10 / 0;
            System.out.println("Exiting try block");
        } catch (ArithmeticException e) {
            System.out.println("Running ArithmeticException catch block");

        } catch (ClassCastException e) {
            System.out.println("Running ClassCastException catch block");
        } finally {
            System.out.println("The value of a " + (a + b));
            System.out.println("The value of b " + b);
        }
    }
}
