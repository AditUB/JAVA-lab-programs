package file_oper;

import java.io.*;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) {
		String filename;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		filename=sc.next();
		File f=new File (filename);
		System.out.println("File exists: "+f.exists());
		System.out.println("File is readable: "+f.canRead());
		System.out.println("File is writeable: "+f.canWrite());
		System.out.println("Is a directory: "+f.isDirectory());
		System.out.println("Lenght of file is: "+f.length()+" bytes");
		try
		{
			char ch;
			FileInputStream fis = new FileInputStream(filename);
			System.out.println("\nContents of file are:\n");
			while(fis.available()!=0)
			{
				System.out.print((char)fis.read());
			}
			fis.close();
		
		} 
		catch (FileNotFoundException e)
		{
			// TODO: handle exception
			System.out.println("Cannot find the specific file");
		}
		catch (IOException e) 
		{
			System.out.println("Cannot read file");
			// TODO: handle exception
		}
		
		
	}
}
