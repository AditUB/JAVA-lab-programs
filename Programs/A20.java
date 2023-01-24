
// Student class implementation using ArrayList and generics
/*Loose coupling is achieved in this program 
 * implementation concern
 * object concern
 * usage concern
*/
// implementation concern
import java.util.*;

class Student {
    int usn;
    int age;

    Student(int usn, int age) {
        this.usn = usn;
        this.age = age;
    }
}

// object concern
class ArrayListDemo {
    public ArrayList<Student> getList() {
        Student s1 = new Student(123, 20);
        Student s2 = new Student(1255, 21);
        Student s3 = new Student(1235, 22);
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        return al;
    }
}

// usage concern
class Main {
    public static void main(String args[]) {
        ArrayListDemo d1 = new ArrayListDemo();
        ArrayList<Student> list = d1.getList();
        for (Student s : list) {
            System.out.println(s.usn);
            System.out.println(s.age);
        }
    }
}