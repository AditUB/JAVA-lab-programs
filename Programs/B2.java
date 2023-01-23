
import java.util.*;

//Student class
public class Student {
	
	// Data in Student Class
	private String name;
	private String USN;
	private String branch;
	private long phone;
	
	//Default constructor
	public Student() {}
	
	/* Data to be accepted by user
	 * This has to be a function since private members 
	 * 		can only be accessed inside the same class
	 * 
	 * 
	 */
	public void getData()
	{
		//Scanner object to accept User input
		Scanner input=new Scanner(System.in); // this will give a warning
		System.out.println("\n\nEnter the following details:");
		
		System.out.print("Name : ");
		name=input.nextLine();  //this accepts a full Line of text with spaces
		
		System.out.print("\nUSN : ");
		USN=input.next();  //this accepts text until spacebar,tab or enter key is pressed
		
		System.out.print("\nBranch : ");
		branch=input.next();
		
		System.out.print("\nPhone Number : ");
		phone=input.nextLong();  // this acceps a number of datatype 'long'
		
	}
	
	
	/*
	 * This method is to display the data in object
	 * 		since private can only be accessed in the class
	 */
	public void display()
	{
		System.out.println("\n\nStudent details:\nName : "+name+"\nUSN : "+USN+"\nBranch : "+branch+"\nPhone Number : "+phone);
	}
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner input=new Scanner(System.in);

		System.out.print("Enter no of Students : ");
		n = input.nextInt();  //Accepting no of Students
		
		
		Student S[] = new Student[n];
		/*
		 * Declaring n objects of Student class
		 */
		
		for(i=0;i<n;i++)
		{
			S[i]= new Student();
			S[i].getData();
		}
		/*
		 * initializing and Accepting data for each object
		 */
		
		for(i=0;i<n;i++)
		{
			S[i].display();
		}
		/*
		 * Displaying Data Stored in Each object
		 */
		
	}

}

