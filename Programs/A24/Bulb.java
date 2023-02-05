package facade_design_pattern;
/*
 * this is a class that is hidden under the facade class
 * 
 * it is a implements the common interface Device
 */
public class Bulb implements Device {
	@Override
	public void switchON() {
		// TODO Auto-generated method stub
		System.out.println("Bulb is powered");
		this.use();
	}

	@Override
	public void switchOFF() {
		// TODO Auto-generated method stub
		System.out.println("Bulb is turned off");

	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Bulb glows");

	}

}
