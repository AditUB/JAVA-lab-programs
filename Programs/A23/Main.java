package Laptop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LapArr obj = new LapArr();
        ArrayList<Laptop> al = obj.getlist();
        obj.append(al);

        // Printing arraylist elements 2 ways
        System.out.println(al);
        for (Laptop i : al) {
            System.out.println(i);
        }
        // Sorting using comparable
        Collections.sort(al);
        System.out.println("\n After sorting:");
        for (Laptop i : al) {
            System.out.println(i);
        }
    }
}
