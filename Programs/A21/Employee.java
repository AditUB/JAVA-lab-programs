package sorting_ArrayList;

import java.util.*;
/*
 * Scanner is stored in java.util.Scanner
 * 
 * Comparable interface is stored in java.util
 * 
 * to reduce code, we import the whole java.util package by typing [java.util.*], here * means all packages in java.util 
 */

public class Employee implements Comparable<Employee> {
	String name;
	int xp;
	float sal;
	public Employee(String name,int xp, float sal)
	{
		this.name=name;
		this.xp=xp;
		this.sal=sal;
	}
	
	/* When Collection sorts an ArrayList
	 * it calls the compare function for the syntax
	 * 		Collections.sort(arraylist) 
	 * 		here, while sorting, it calls compareTo function to see which object is greater
	 * 		for obj1.compareTo(obj2)
	 * 		if obj1 > obj2 then return positive value,ie, if we are sorting on age, if obj1.age > obj2.age the return any positive number  
	 * 		if obj1 < obj2 the return a negative value,ie, if we are sorting on age, if obj1.age < obj2.age the return any negative number
	 * 		if both objects have same sorting value then return 0,ie, if we are sorting on age, if obj1.age = obj2.age the return 0  
	 */
	public int compareTo(Employee ob)
	{
		return (this.xp)-(ob.xp);
		// if this.xp>ob.xp then it gives +ve value, if it is less than ob.xp, it gives -ve value .
		// if both objects have same xp value, it returns 0
	}
	

	//Here we are overloading toString function so that when we try to print the object, it will print the below string instead of some hashCode
	public String toString()
	{
		return "Name:"+name+",Exp:"+xp+",Sal:"+sal;
	}
}
