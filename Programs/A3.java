// object object interaction
class Teacher {
    Student s1 = new Student();

    void givesPen(Pen p1) {
        System.out.println("Teacher gives pen");
        s1.recievesPen(p1);
    }

}

class Student {
    void recievesPen(Pen p1) {
        System.out.println("Student accepts pen");
        p1.opensCap();
        p1.writing();
        p1.closeCap();
    }
}

class Pen {
    void opensCap() {
        System.out.println("Pen cap open");
    }

    void writing() {
        System.out.println("Writing");
    }

    void closeCap() {
        System.out.println("Pen cap closed");
    }
}

class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Pen p1 = new Pen();
        t1.givesPen(p1);
    }
}