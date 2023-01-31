package sorting_ArrayList;

import java.util.*;
/*
 * Array lists are stored in the package java.util.ArrayList
 * 
 * Java Collections Class are also stored in java.util.Collections
 * 
 * Scanner is stored in java.util.Scanner
 * 
 * to reduce code, we import the whole java.util package by typing [java.util.*], here * means all packages in java.util 
 */

public class E_list {
	
	//Applying loose coupling to create an array list 
	public ArrayList<Employee> getList()
	{
		ArrayList <Employee> al= new ArrayList<Employee>();
		return al;
	}
	

	//Applying loose coupling to add elements to array list
	public void append(ArrayList al)	
	{
		char ans;
		Scanner sc=new Scanner(System.in);
		do//this loop runs as long as you enter 'y' oy 'Y' when asked to continue
		{
			System.out.println("Enter Employee details");
			String name=sc.next();
			int xp=sc.nextInt();
			float sal=sc.nextFloat();
			Employee E=new Employee(name,xp,sal);
			al.add(E);
			System.out.println("Do you want to Append more?");
			ans=sc.next().charAt(0);
		}while((ans=='Y')||(ans=='y'));
		
	}

}
