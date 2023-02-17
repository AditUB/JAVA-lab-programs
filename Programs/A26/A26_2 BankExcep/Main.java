package Exceptions.BankExcep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age, name");
        int age = sc.nextInt();
        String name = sc.next();
        try {
            Bank.CreateAcc(age, name);
        } catch (AgeExcep | NameExcep | NameAgeExcep e) {
            e.printStackTrace();
        }

    }

}
