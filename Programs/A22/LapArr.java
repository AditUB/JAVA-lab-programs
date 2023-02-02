package Laptop;

import java.util.*;

// import javax.sound.midi.SysexMessage;

public class LapArr {
    public ArrayList<Laptop> getlist() {
        // creating an arraylist
        ArrayList<Laptop> al = new ArrayList<Laptop>();
        return al;
    }

    public ArrayList<Laptop> append(ArrayList<Laptop> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of laptop objects to be created");
        int n = sc.nextInt();
        Laptop L[] = new Laptop[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter RAM, display");
            int ram = sc.nextInt();
            int display = sc.nextInt();
            L[i] = new Laptop(ram, display);
            // Adding Laptop objects to arraylist
            al.add(L[i]);
        }
        return al;
    }
}
