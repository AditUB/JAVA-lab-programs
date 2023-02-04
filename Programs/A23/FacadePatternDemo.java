package facade_design_pattern;

/*
 * this is the main class where you access the Facade
 * From the facade, you can access functions that does the complicated steps for you 
 */

public class FacadePatternDemo {

	public static void main(String[] args) {
		Extension_cord E=new Extension_cord();
		//there are3 devices connected to extension cord:bulb, tv, laptop
		
		E.switchON();// Switched ON all three devices
		
		E.useTV(); // used only the tv
		
		
		E.useLaptop();//used only the laptop
		
		
		E.switchOFF();//switched off all 3 devices

		

	}

}
