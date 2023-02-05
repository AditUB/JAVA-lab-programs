package facade_design_pattern;

/*
 * This is the Facade class
 * It is the one that implements the uses of the devices
 * here, the exact way the functions of each object work is hidden
 */


public class Extension_cord {
	private Device laptop;
	private Device tv;
	private Device bulb;
	//constructor
	public Extension_cord()
	{
		laptop=new Laptop();
		tv=new TV();
		bulb=new Bulb();
	}
	
	//to use only laptop
	public void useLaptop()
	{
		laptop.use();
	}
	
	//to use only tv
	public void useTV()
	{
		tv.use();
	}
	
	//to switch on all devices
	public void switchON()
	{
		laptop.switchON();
		bulb.switchON();
		tv.switchON();
		
	}
	
	
	//to switch off all devices
	public void switchOFF()
	{
		laptop.switchOFF();
		bulb.switchOFF();
		tv.switchOFF();
	}
	
}
