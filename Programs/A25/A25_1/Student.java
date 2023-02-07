package Priority;

//implementation concern - Student class implemented
public class Student implements Comparable<Student> {
    private int usn;
    private String name;

    Student(int usn, String name) {
        this.usn = usn;
        this.name = name;
    }

    public int compareTo(Student S) {
        return ((int) (this.usn - S.usn));
    }

    public String toString() {
        return "|" + name + "\t" + usn + "|\t";
    }
}
