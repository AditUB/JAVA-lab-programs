
/*
 * singleton classes are classes that can not have more than one object in instance
 * 			any object that is attempted to be made only points/references the existing one
 */
public class Singleton {
	/* these are the four static/Singleton objects
	 * 		'null' here means that object is not allocated any memory or data  
	 */
	
	static Singleton sref1 =null;
	static Singleton sref2 =null;
	static Singleton sref3 =null;
	static Singleton sref4 =null;
	
	/*this is a variable to count number of attempts to create an object
	 * 		this follows zero index ,a.k.a., 1 object means count=0
	 * 			2 object means count=1
	 */
	private static int count=-1;
	
	
	//this is the data to be stored in the object
	private int i;
	
	
	//Private constructor ensures that new objects cannot be made from outside the class
	private Singleton(int i)
	{
		this.i=i;
		System.out.println("Running constructor");
	}
	
	/*This method is a public method that acts like a constructor
	 * Here, based on the number of objects, the method chooses if to create new objects 
	 * 			or return existing object references
	 * if count is 3 or less, it means that objects can still be created
	 * if count is 4 or more, it means that object reference is to be returned 
	 * 			as for which object to reference is purely your choice, 
	 * 			it could be the 1st object or 4th object or some formula like (object number%4)th object 
	 */
	public static Singleton myMethod(int i)
	{
		count++;
		count=count%4;
		if(count==0)
		{

			if(sref1==null)
				sref1=new Singleton(i);
			else
				System.out.println("2nd time onwards");
			return sref1;
		}
		else if(count==1)
		{

			if(sref2==null)
				sref2=new Singleton(i);
			else
				System.out.println("2nd time onwards");
			return sref2;
		}
		else if(count==2)
		{

			if(sref3==null)
				sref3=new Singleton(i);
			else
				System.out.println("2nd time onwards");
			return sref3;
		}
		else
		{

			if(sref4==null)
				sref4=new Singleton(i);
			else
				System.out.println("2nd time onwards");
			return sref4;
		}
	}
	
	/*this just shows the value stored in the object
	 * if you want more data, add them at the beginning as private data
	 * 		and add their initialization to the constructor,method acting
	 * 		constructor, and this display function 
	 */
	
	public void display()
	{

		System.out.println("I="+i);
	}

}




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating 4 singleton (Quadrupleton??) objects 
		Singleton sref1=Singleton.myMethod(1);
		sref1.display();
		Singleton sref2=Singleton.myMethod(2);
		sref2.display();
		Singleton sref3=Singleton.myMethod(3);
		sref3.display();
		Singleton sref4=Singleton.myMethod(4);
		sref4.display();
		
		/*
		 *  Trying to create more than 4 different objects 
		 *  this results in the objects to reference(like a pointer) the already 
		 *  	created 4 objects instead of creating new ones
		 */
		Singleton sref5=Singleton.myMethod(5);
		sref5.display();
		
		Singleton sref6=Singleton.myMethod(6);
		sref6.display();
		
		Singleton sref7=Singleton.myMethod(7);
		sref7.display();
		
		Singleton sref8=Singleton.myMethod(8);
		sref8.display();
		
		Singleton sref9=Singleton.myMethod(9);
		sref9.display();
		
		Singleton sref10=Singleton.myMethod(10);
		sref10.display();
		
		Singleton sref11=Singleton.myMethod(11);
		sref11.display();
	}

}
