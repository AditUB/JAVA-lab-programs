import java.util.*;

// implementation concern is taken care here
class Employee
{
    int Eid;
    String Ename;
    double Esal;
    int Exp;
    
    Scanner sc=new Scanner(System.in);
    public void getData()
    {
        System.out.println("Enter id,name,sal,exp");
        Eid=sc.nextInt();
        Ename=sc.next();
        Esal=sc.nextDouble();
        Exp=sc.nextInt();
    }
    
}

class ArrayListDemo
{
    public ArrayList<Employee> getList()
    {
//object creation concern is taken care here
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employees");
        n=sc.nextInt();
        Employee e1[]=new Employee[n];
        for(i=0;i<n;i++)
        {
            e1[i]=new Employee();
            e1[i].getData();
        }

//creating an arraylist and adding employee objects into it      
        ArrayList<Employee> al=new ArrayList<Employee>();
        for(i=0;i<n;i++)
        al.add(e1[i]);
        
        return al;
    }
//displaying all the details    
    public void display(ArrayList <Employee> al)
    {
        for(Employee i: al)
        System.out.println("Exp: "+i.Exp+" "+"Eid: "+i.Eid+" "+"Ename: "+i.Ename+" "+"Esal: "+i.Esal);
    }
    
}

class ExpComp implements Comparator<Employee> {
  
    public int compare(Employee e1, Employee e2)
    {
        if (e1.Exp == e2.Exp)
            return 0;
        else if (e1.Exp > e2.Exp)
            return 1;
        else
            return -1;
    }
}
  
class Trial {
    public static void main(String[] args) {
//usage concern is taken care here
        ArrayListDemo data=new ArrayListDemo();
        ArrayList<Employee> al=data.getList();
        
        Collections.sort(al, new ExpComp());
        
        data.display(al);
    }
}
