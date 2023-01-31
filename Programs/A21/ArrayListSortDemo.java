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
public class ArrayListSortDemo {
	public static void main(String[] args)
	{
		
		/*
		 * This is to demonstrate use of Comparable interface
		 * E_list and Employee class use Comparable interface
		 */
		E_list obj=new E_list();
		//making an Array list
		ArrayList <Employee> al=obj.getList();
		
		//Adding Objects with user input data into Array List
		obj.append(al);
		//Prints the order of array list elements before sorting based on Experience(Exp)
		System.out.println(al);
		
		// this sorts the ArrayList using the CompareTo function on employee class
		Collections.sort(al);
		//Prints the elements in array list after sorting based on Exp
		System.out.println(al);
		
		
		/*
		 * This is to demonstrate use of Comparator interface
		 * E_list2 and Employee2 class use Comparator interface
		 */
		E_list2 obj2=new E_list2();
	
		//making an Array list	
		ArrayList <Employee2> al2=obj2.getList();
		
		//Adding Objects with user input data into Array List
		obj2.append(al2);

		//Prints the order of array list elements before sorting based on Experience(Exp)
		System.out.println(al2);
		
		// this sorts the ArrayList using the Compare function in helper class CompareExp based on Exp
		Collections.sort(al2,new CompareExp());
		
		//Prints the elements in array list after sorting based on Exp
		System.out.println(al2);
		
		
		// this sorts the ArrayList using the Compare function in helper class CompareSal based on Sal
		Collections.sort(al2,new CompareSal());

		//Prints the elements in array list after sorting based on Sal
		System.out.println(al2);
	}
}
