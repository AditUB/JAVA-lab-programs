package sorting_ArrayList;

import java.util.*;

//comparator interface is stored in java.util

public class CompareSal implements Comparator<Employee2>{
	
	/* When Collection sorts an ArrayList
	 * it calls the compare function for the syntax
	 * 		Collections.sort(arraylist , helper class) 
	 * 		here, while sorting, it calls compare function to see which object is greater
	 * 		for compare(obj1,obj2)
	 * 		if obj1 > obj2 then return positive value,ie, if we are sorting on age, if obj1.age > obj2.age the return any positive number  
	 * 		if obj1 < obj2 the return a negative value,ie, if we are sorting on age, if obj1.age < obj2.age the return any negative number
	 * 		if both objects have same sorting value then return 0,ie, if we are sorting on age, if obj1.age = obj2.age the return 0  
	 */
	public int compare(Employee2 E1,Employee2 E2)
	{
		if(E1.sal>E2.sal)
			return 1;
		if(E1.sal<E2.sal)
			return -1;
		return 0;
	}

}
