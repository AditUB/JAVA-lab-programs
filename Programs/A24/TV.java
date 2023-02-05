package facade_design_pattern;
/*
 * this is a class that is hidden under the facade class
 * 
 * it is a implements the common interface Device
 */

public class TV implements Device {
	@Override
	public void switchON() {
		System.out.println("TV is powered");

	}

	@Override
	public void switchOFF() {
		System.out.println("TV is not powered");

	}

	@Override
	public void use() {
		System.out.println("TV is being used");

	}

}
