package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int c = 0;
        try {
            a = Integer.parseInt("123a");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("ClassCastException block");
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("Throwable block");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println(a + " " + b);

    }
}