package facade_design_pattern;

/*
 * this is the common interface that all the devices implement
 *  
 *  this is so that facade class can only implement the functions under these, and rest of the functions are hidden
 */		
		
public interface Device {
	public void switchON();
	public void switchOFF();
	public void use();

}
