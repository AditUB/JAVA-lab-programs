package Laptop;

public class Laptop implements Comparable<Laptop> {
    private int ram;
    private int display;

    Laptop(int ram, int display) {
        this.ram = ram;
        this.display = display;
    }

    public int compareTo(Laptop L) {
        return ((int) (this.ram - L.ram));
    }

    public String toString() {
        return "Ram: " + ram + "\tDisplay: " + display;
    }
}
