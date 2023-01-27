import java.util.Scanner;

//creating an interface with method bioData
public interface Resume
{
    public void bioData();
}

//creating a Teacher class which implements the interface
public class Teacher implements Resume
{
    String name;
    String qual;
    int exp;
    int ach;

//creating a scanner object for Teacher class
    Scanner sc= new Scanner (System.in);

//implementing the method biodata of interface in Teacher class
    public void bioData()
    {
        System.out.println("Enter name, qualification, experience, achievement: ");
        name =sc.next();
        qual=sc.next();
        exp=sc.nextInt();
        ach=sc.nextInt();
    }

//displaying the informations of Teacher's Resume
    public void display()
    {
       System.out.println("Name: "+name+"\n"+"Qualification: "+qual+"\n"+"Experience: "+exp+"\n"+"Achievement: "+ach+"\n"); 
    }
}

//creating a Student class which implements the interface
public class Student implements Resume
{
    String name;
    String dis;
    int res;
    
//creating a scanner object for Student class
    Scanner sc= new Scanner (System.in);
    
//implementing the method biodata of interface in Student class
    public void bioData()
    {
        System.out.println("Enter name, discipline, result: ");
        name =sc.next();
        dis=sc.next();
        res=sc.nextInt();
    }

//displaying the informations of Student's Resume
    public void display()
    {
       System.out.println("Name: "+name+"\n"+"Discipline: "+dis+"\n"+"Result: "+res+"\n"); 
    }
}


class Demo {
    public static void main(String[] args) {
//creating an object of Teacher class
        Teacher obj=new Teacher();
        obj.bioData();
        obj.display();

 //creating an object of Student class       
        Student obj1=new Student();
        obj1.bioData();
        obj1.display();
    }
}
