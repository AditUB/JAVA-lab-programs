/*
 * 
 * 
 * there are 3 Threads, 2 are not main thread and start() has to be called on object of subthread class
 * Random Number is generated using Random class(java.util.Random)
 * Thread.sleep( number of milliseconds ) is used to create a delay 
 * 
 * 		Code working:
 * 		main thread generates a number and passes it to subthread using setval()
 * 		All threads have an infinite loop running at all times
 * 		in main function there is a delay of 1 second for each iterations
 * 		in subthreads tho, it has to print only after main thread so we cant put 1 seconf delay
 * 			therefore when we pass the value to subthread, make a flag=1
 * 			print in subthread if flag==1 and then set it to 0 else do nothing
 * 		put a small delay in the subthread in each iteration to prevent race condition( like the flip flops ) and to reduce burden on processor
 * 
 * 
 * 
 * 
 */



import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random r=new Random();
			//Random number genetor class(inbuilt) 
		int val=(-1);
		
		Square t1 = new Square();
		Cube t2=new Cube();
		//create objects of Subthread's class
		
		t1.start();
		t2.start();
		// start running subthreads
		
		while(true)
		{
			val=r.nextInt(100);
			//Creating random number between 1 and 100
			
			t1.setval(val);
			t2.setval(val);
			//passing the generated value to Square and Cube Thread for calculation of square and Cube
			
			System.out.println("\nNumber: "+val);//Print thr random number
			
		
			try 
			{
				Thread.sleep(1000);//Required Delay between each Number Generation, in milliseconds 
			} 
			catch (InterruptedException e) {}
		}
	}

}


//*******************************************************************


public class Square extends Thread{
	public int val;
	public int flag;
	public void setval(int i)// to get randomised value from Number generating Thread
	{
		this.val=i;
		this.flag=1;
	}
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(300);// Small Delay to prevent Race condition 
			} catch (InterruptedException e) {}
			
			
			if(flag==1) //can print once when flag==1 
			{
				System.out.println("Square: "+val*val);// Prints Square value
				flag=0;
			}
		}
	}
}


//**********************************************************************************8

public class Cube extends Thread{
	public int val;
	public int flag;
	public void setval(int i)// to get randomised value from Number generating Thread
	{
		this.val=i;
		this.flag=1;
	}
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(300);// Small Delay to prevent Race condition 
			} catch (InterruptedException e) {}
			
			
			if(flag==1) //can print once when flag==1 
			{
				System.out.println("Cube: "+val*val*val);// prints Cube value
				flag=0;
			}
		}
	}
}

