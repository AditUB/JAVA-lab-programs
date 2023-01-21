//for constructer overloading and method overloading
class Room {
    private double length;
    private double breadth;
    private double area;

    public Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Room(double length) {
        this.length = length;
        this.breadth = length;
    }

    public void calculateArea() {
        area = length * breadth;
        System.out.println("area: " + area);
    }

    public void calculateArea(double x) {
        area = area + x;
        System.out.println("Added area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("area of square ");
        Room r1 = new Room(3);
        r1.calculateArea();
        r1.calculateArea(4);
        System.out.println("area of rectangle ");
        Room r2 = new Room(4, 8);
        r2.calculateArea();
        r2.calculateArea(1);

    }
}