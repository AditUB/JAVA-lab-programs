// Inheritance usage
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Teacher extends Person {
    String domain;
    int exp;

    Teacher(String name, int age, String domain, int exp) {
        super(name, age);
        this.domain = domain;
        this.exp = exp;
    }

    void display() {
        super.display();
        System.out.println("Domain: " + domain + "\nExperience: " + exp);

    }
}

class Student extends Person {
    String dept;
    String usn;

    Student(String name, int age, String dept, String usn) {
        super(name, age);
        this.dept = dept;
        this.usn = usn;
    }

    void display() {
        super.display();
        System.out.println("Department: " + dept + " \nUsn: " + usn);

    }
}

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ram", 30, "webdev", 10);
        t1.display();
        Student s1 = new Student("Aditya", 19, "cse", "1rn21cs015");
        s1.display();
    }
}
