import java.util.*;


// this class does the operations of Array List
public class A_List {

	Scanner sc;
	String str;
	
	/*
	 * Append function
	 */
	public void append(ArrayList al)	
	{
		char ans;
		do
		{
			System.out.println("Enter String");
			sc=new Scanner(System.in);
			str=sc.next();
			al.add(str);
			System.out.println("Do you want to Append more?");
			ans=sc.next().charAt(0);
		}while((ans=='Y')||(ans=='y'));	
		// usually we append more than 1 at a time, hence the loop
		
	}
	
	//insert at position function
	
	public void insert (ArrayList al)
	{
		System.out.println("Enter the String:");
		sc=new Scanner(System.in);
		str=sc.next();
		try
		{
			System.out.println("Enter the index to insert");
			int index=sc.nextInt();
			al.add(index,str);
			System.out.println("The Array elements are:"+al);
		}
		catch(Exception e)  // this is to prevent program from crashing if index is out of declared values
		{
			System.out.println("invalid index");
		}
	}
	
	
	
	// Searches for  a string that fully match the input
	public void search(ArrayList al)
	{
		String searchstring;
		System.out.println("Enter the String to search");
		sc=new Scanner(System.in);
		searchstring=sc.next();
		boolean found=false;
		Iterator <String>it= al.iterator();
		String cur="";
		int pos=0;;
		while(it.hasNext())
		{
			pos++;
			cur=it.next();
			if(cur.equals(searchstring))
			{
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("String found at "+pos);
		else
			System.out.println("String not present");


	}
	
	
	// prints all String that starts with the character user inputs
	public void findParticular(ArrayList<String> al)
	{
		sc=new Scanner(System.in);
		System.out.println("Enter the starting letter");
		char srch=sc.next().charAt(0);
		int pos=0; // put -1 for 0th index positoin
		boolean found=false;
		for(String i:al)
		{
			pos++;
			if(srch==i.charAt(0))
			{
				System.out.println("At position "+pos+":"+i);
				found=true;
			}
		}
		if(found==false)
		{

			System.out.println("No Match");
		}
	}

}


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
		// creating an Array list that only stores String type, usually it can store any object
		ArrayList <String> al=new ArrayList<String>();
		A_List obj=new A_List();
		int ch;
		Scanner input = new Scanner(System.in);
		while(true) 	// infinite loop for menu based program
		{

			System.out.println("Enter 1.Append, 2.Insert, 3.Search String, 4.Find strings with a certain starting letter");
			ch=input.nextInt();
			switch(ch)
			{
				case 1:
					obj.append(al);
					break;
				case 2:
					obj.insert(al);
					break;
				case 3:
					obj.search(al);
					break;
				case 4:
					obj.findParticular(al);
					break;
				default:return;
			}
		}
	}

}
