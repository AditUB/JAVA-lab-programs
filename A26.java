//wap to read 2 integers a and b, compute a/b and print when b is not zero. raise an exception when b=0
import java.util.*;
 class Main {
	public static void main(String[] args) 
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero error");
			e.printStackTrace();
		}
	}
}
