
//Interface that shows methods available to user
public interface Email {
	public void delete();
	public void send();
	public void compose();
	public void show_unsent();

}



// Hidden class that implements the functions in interface
import java.util.Scanner;

public class Google implements Email {
	
	private String draft;
	public Scanner input=new Scanner(System.in);
	private boolean unsent=false;
	public Google()
	{
		draft="";
	}
	@Override
	public void delete() {
		if(unsent==false)
		{

			System.out.println("No draft email to delete");
		}
		else
		{
			System.out.println("draft deleted");
			draft="";
			unsent=false;
		}
		
		// TODO Auto-generated method stub

	}

	@Override
	public void send() {
		if(unsent)
		{
			System.out.println("Email Sent");
			unsent=false;
			return;
		}
		System.out.println("No Email to send");

	}

	@Override
	public void compose() {
		System.out.println("Enter no of lines of text");
		String temp;
		draft="";
		int i,n;
		n=input.nextInt();

		System.out.println("Enter text");
		temp=input.nextLine();
		for(i=0;i<n;i++)
		{
			temp=input.nextLine();
			draft=draft+temp+"\n";
		}
		unsent =true;

	}

	@Override
	public void show_unsent() {
		if(unsent)
		{

			System.out.print("Draft Email:\n");
			System.out.print(draft);
			
		}
		else
		{

			System.out.println("No draft present");
		}

	}

}



// class that has one visible method that returns an interface typecasted object of hidden class 
//    i.e. , Factory Design pattern
public class Client {
	public static Email getAcc()
	{
		return new Google();
	}

}




import java.util.Scanner;
//Main method
public class Main {

	public static void main(String[] args) {
		Email A = Client.getAcc();
		int ch;
		Scanner input=new Scanner(System.in);
		while(true)// infinite loop for menu based program
		{
			System.out.println("\n\nEnter 1 to compose Email\n2 to send email\n3 to delete email\n4 to show draft email");
			ch=input.nextInt();
			switch(ch)
			{
				case 1:A.compose();
					break;
				case 2:A.send();
					break;
				case 3:A.delete();
					break;
				case 4:A.show_unsent();
					break;
				default:
					return;
				
			}
		}
		
	}

}
