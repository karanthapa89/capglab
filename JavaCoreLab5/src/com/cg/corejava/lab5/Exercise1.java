package com.cg.corejava.lab5;
import java.util.Scanner;

@SuppressWarnings("serial")
class AgeNotSupportException extends Exception
{
	AgeNotSupportException(String message)
	{
		System.err.println(message);
	}
}

public class Exercise1 
{
	public static void check(int age) 
	{	  
		try 
		{ 
		  if(age<=15)
			  throw  new AgeNotSupportException("Entered age is under 15, not accepted." );
		  else
			  System.out.println("Age is accepted."); 
		}
		catch(AgeNotSupportException e1)
	    {	
			System.err.println(""+e1);
	    } 
	}

		public static void main(String[] args) 	
		{ 	
			Scanner sc=new Scanner(System.in);
			char rep = 'y';
			do {
				System.out.println("Enter your age: ");
				int age=sc.nextInt();
				check(age);
				System.out.println("\nDo you want to continue?");
				System.out.println("Press 'y' to continue, any other key to exit....");
				rep = sc.next().charAt(0);
			} while (rep == 'y');
		    sc.close();
		}		
}