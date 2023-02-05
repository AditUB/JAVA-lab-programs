package facade_design_pattern;
/*
 * this is a class that is hidden under the facade class
 * 
 * it is a implements the common interface Device
 */
public class Laptop implements Device {
	@Override
	public void switchON() 
	{
		System.out.println("Laptop is charging");
	}

	@Override
	public void switchOFF() 
	{
		System.out.println("laptop is discharging");
	}

	@Override
	public void use() {
		System.out.println("You used the Laptop");
	
	}

}