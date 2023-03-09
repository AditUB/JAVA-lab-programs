package applet_swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calci implements ActionListener{
	private static JTextField inputbox;
	
	Calci(){}
	
	public void actionPerformed(ActionEvent e)
	{
		String command =e.getActionCommand();
		if(command.charAt(0)=='C')
		{
			inputbox.setText("");
		}
		else if(command.charAt(0)=='=')
		{
			inputbox.setText(evaluate(inputbox.getText()));
		}
		else
		{
			inputbox.setText(inputbox.getText()+ command);
		}
	}
	
	
	public static String evaluate(String expression)
	{
		char[]arr=expression.toCharArray();
		String operand1 ="";
		String operand2 ="";
		String operator="";
		double result =0;
		int flagIncompete=0,operators=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='0'&&arr[i]<='9'||arr[i]=='E'||arr[i]=='.')
			{
				if(operator.isEmpty())
				{
					operand1 +=arr[i];
					
				}
				else
				{
					operand2 +=arr[i];
					flagIncompete=2;
				}
			}
			if(arr[i]=='+'||arr[i]=='-'||arr[i]=='/'||arr[i]=='*')
			{
				operator+=arr[i];
				operators++;
				if(flagIncompete<1)
					flagIncompete=1;
				if(operators==2)
				{
					return "Only one operation";
				}
			}
		}
		try
		{
			if(flagIncompete!=2)
				return expression;
			if(operator.equals("+"))
				result =(Double.parseDouble(operand1)+Double.parseDouble(operand2));
			else if(operator.equals("-"))
				result =(Double.parseDouble(operand1)-Double.parseDouble(operand2));
			else if(operator.equals("/"))
				result =(Double.parseDouble(operand1)/Double.parseDouble(operand2));
			else
				result =(Double.parseDouble(operand1)*Double.parseDouble(operand2));
		}
		catch(NumberFormatException e)
		{
			return "Wrong format";
		}
		return ""+result;
	}
	
	
	public static void main(String[] args) {
		createWindow();
	}
	
	
	private static void createWindow() {
		JFrame frame= new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// This makes a new window
		
		
		createUI(frame);
		// this puts buttons on the window
		
		
		frame.setSize(300,300);
		//this is setting size of window
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		//These are like default settings, do not change
		
	}
	
	private static void createUI(JFrame frame)
	{
		JPanel panel=new JPanel();
		Calci calc=new Calci();
		GridBagConstraints gbc= new GridBagConstraints();
		GridBagLayout layout =new GridBagLayout();
		panel.setLayout(layout);
		// this is the declarations used for formatting/styling the window 
		
		
		inputbox=new JTextField(10);
		inputbox.setEditable(false);
		//setting up the textbox to see values or expression that we type
		
		JButton[] b=new JButton[10];
		int i,j;
		for(i=0;i<10;i++)
		{
			b[i]=new JButton(""+i);
			b[i].addActionListener(calc);
		}
		//Creating buttons with number
		//addActionListener(..) is used to put the button into calculator window
		
		
		JButton plus=new JButton("+");
		plus.addActionListener(calc);
		JButton minus=new JButton("-");
		minus.addActionListener(calc);
		JButton mul=new JButton("*");
		mul.addActionListener(calc);
		JButton div=new JButton("/");
		div.addActionListener(calc);
		JButton clr=new JButton("C");
		clr.addActionListener(calc);
		JButton dot=new JButton(".");
		dot.addActionListener(calc);
		JButton equal=new JButton("=");
		equal.addActionListener(calc);
		//creating buttons with symbols
		
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		for(i=0;i<3;i++)
		{
			gbc.gridy=i+1;
			for(j=0;j<3;j++)
			{
				gbc.gridx=j;
				panel.add(b[i*3+j+1],gbc);
				/*
				 * adding buttons in order
				 * 
				 * 1	2	3
				 * 4	5	6
				 * 7	8	9
				 * 		0
				 */
			}
		}
		
		gbc.gridx=3;
		gbc.gridy=1;
		panel.add(plus,gbc);
		
		gbc.gridx=3;
		gbc.gridy=2;
		panel.add(minus,gbc);
		
		gbc.gridx=3;
		gbc.gridy=3;
		panel.add(mul,gbc);

		gbc.gridx=0;
		gbc.gridy=4;
		panel.add(dot,gbc);

		gbc.gridx=1;
		gbc.gridy=4;
		panel.add(b[0],gbc);

		gbc.gridx=2;
		gbc.gridy=4;
		panel.add(clr,gbc);

		gbc.gridx=3;
		gbc.gridy=4;
		panel.add(div,gbc);
		
		gbc.gridwidth=4;
		
		gbc.gridx=0;
		gbc.gridy=5;
		panel.add(equal,gbc);
		

		gbc.gridx=0;
		gbc.gridy=0;
		panel.add(inputbox,gbc);
		
		/*
		 * the above lines mean the follows
		 * 
		 * gridx,gridy are xy coordinates on the window like (gridx,gridyy)
		 * 
		 * gridy\gridx->	0		1		2		3
		 *	 |
		 *	 V
		 *	 
		 *	 0				(0,0)	(0,1)	(0,2)	(0,3)				
		 *	 1	 			(1,0)	(1,1)	(1,2)	(1,3)							
		 *   2				(2,0)	(2,1)	(2,2)	(2,3)							
		 *   3				(3,0)	(3,1)	(3,2)	(3,3)							
		 * 
		 * panel.add puts the button at whatever location value you put for gridx and gridy
		 * 
		 * 
		 * 
		 * 
		 *  we want the button to  look like this:
		 *  
		 *  		textBox to see expression
		 *  		1	2	3	+
		 *  		4	5	6	-
		 *  		7	8	9	*
		 *  		.	0  Clr	/
		 *  		Equal To sign(=)
		 *  
		 *  
		 *  
		 *  Do note, this calculator is pretty simple,soooooo
		 *  1.It can only operate simple operations
		 *  2.Only one operation at a time
		 *  3.Negative numbers not supported
		 */	 
		 
		
		
		frame.getContentPane().add(panel,BorderLayout.CENTER);
	}
	

}
