package sorting_ArrayList;


public class Employee2 
{
	String name;
	int xp;
	float sal;
	public Employee2(String name,int xp, float sal)
	{
		this.name=name;
		this.xp=xp;
		this.sal=sal;
	}
	
	//Here we are overloading toString function so that when we try to print the object, it will print the below string instead of some hashCode
	public String toString()
	{
		return "Name:"+name+",Exp:"+xp+",Sal:"+sal;
	}
}
