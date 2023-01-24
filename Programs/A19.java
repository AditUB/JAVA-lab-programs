
//Employee class(hidden)
public class Employee {

	private String name;
	private float sal;
	private int id;
	public Employee(String a, float b, int c)
	{
		name=a;
		sal=b;
		id=c;
	}
	
	// this overload to string so that System.out.println() of any objet of employee class prints the below string instead of hashcode
	public String toString()
	{
		return ("Name="+name+"\nSalary:"+sal+"\nID:"+id);
	}
}



import java.util.*;
public class EmployeeArrayList {

	
	//return an array list that only stores objects of employee class
	public ArrayList<Employee> getlist()
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		return al;
	}
	public ArrayList<Employee> append(ArrayList<Employee> al )
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee name, Salary and ID");
		String name=sc.nextLine();
		float sal=sc.nextFloat();
		int id=sc.nextInt();
		Employee E=new Employee(name,sal,id);
		al.add(E);
		return al;
	}

}




public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeArrayList obj= new EmployeeArrayList();
		ArrayList al= obj.getlist();
		obj.append(al);// this adds an Object of Employee class
		//put an infinite while loop for a menu driven version 
		System.out.println(al.get(0));
	}

}
