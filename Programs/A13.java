//Program to demo use of toString function
public class Student1 {
    public int age;
    public String name;
    public int id;

    public Student1(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return id + "  " + name + "  " + age;
    }
}

public class Student {
    public int age;
    public String name;
    public int id;

    public Student(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

}

public class Main {
    public static void main(String[] args) {
        Student S1 = new Student(1, "Ram", 20);
        Student S2 = new Student(2, "raj", 21);
        System.out.println(S1);
        System.out.println(S2);
        Student1 S3 = new Student1(1, "Ram", 20);
        Student1 S4 = new Student1(2, "raj", 21);
        System.out.println(S3);
        System.out.println(S4);
    }

}