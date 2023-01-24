package simpleArrayList;import java.util.*;

public class ArraylistDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Hello");
		al.add(new Integer (10));
		al.add(20);
		al.add(21.5);
		System.out.println("Size of List:"+al.size());

		System.out.println(al.get(0));
		
		//al.get(i) returns object at i-th position
		for(int i=0;i<al.size();i++)
		{

			System.out.println(al.get(i));
		}
		
		/*
		 * using for each loop
		 */
		for(Object l : al)
		{

			System.out.println(l);
		}

	}

}
