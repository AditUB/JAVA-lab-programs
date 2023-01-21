import java.util.Scanner;

class Employee {
    private String name;
    private int ID;
    private int xp;
    private double sal;

    public Employee() {
    }

    public Employee(String name, int ID, int xp, double sal) {
        this.name = name;
        this.ID = ID;
        this.xp = xp;
        this.sal = sal;
    }

    public void display() {
        System.out.println("\nName:" + name + "\nID:" + ID + "\nExperience:" + xp + "\nSalary:" + sal);
    }

    public static void sortXP(Employee obj[]) {
        Employee temp = new Employee();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (obj[j].xp > obj[j + 1].xp) {
                    temp = obj[j];
                    obj[j] = obj[j + 1];
                    obj[j + 1] = temp;
                }
            }
        }
    }

    public static void sortSAL(Employee obj[]) {
        Employee temp = new Employee();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (obj[j].sal > obj[j + 1].sal) {
                    temp = obj[j];
                    obj[j] = obj[j + 1];
                    obj[j + 1] = temp;
                }
            }
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee E[] = new Employee[5];
        String name;
        int ID, i, xp;
        double sal;
        for (i = 0; i < 5; i++) {

            System.out.println("\nEnter Name,ID,Experience,Salary");
            name = sc.next();
            ID = sc.nextInt();
            xp = sc.nextInt();
            sal = sc.nextDouble();
            E[i] = new Employee(name, ID, xp, sal);
        }
        for (i = 0; i < 5; i++) {
            E[i].display();
        }
        System.out.println("Enter 1. To sort by XP 2. To sort by Salary");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Employee.sortXP(E);
                break;
            case 2:
                Employee.sortSAL(E);
                break;
            default:
                System.out.println("Invalid choice");
        }
        for (i = 0; i < 5; i++) {
            E[i].display();
        }
    }

}