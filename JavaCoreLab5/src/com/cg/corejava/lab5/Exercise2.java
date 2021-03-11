package com.cg.corejava.lab5;
import java.util.Scanner;

@SuppressWarnings("serial")
class NameException extends Exception
{
	NameException(String message)
	{
		System.err.println(message);
	}
}

public class Exercise2 
{
	public static void check(String firstName, String lastName) 
	{	  
		try 
		{ 
			if(firstName.isEmpty())
				throw  new NameException("First Name field cannot be empty" );
			else if (lastName.isEmpty())
				throw  new NameException("Last Name field cannot be empty" );
			else
			  System.out.println("\"Your Name is Accepted....\""); 
		}
		catch(NameException e1)
	    {	
			System.err.println(""+e1);
	    } 
	}

		public static void main(String[] args) 	
		{ 	
			char rep = 'y';
			do {
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter your First Name: ");
				String firstName=sc.nextLine();
				System.out.println("Enter your Last Name: ");
				String lastName=sc.nextLine();
				check(firstName, lastName);
				System.out.println("\nDo you want to continue?");
				System.out.println("Press 'y' to continue, any other key to exit....");
				rep = sc.next().charAt(0);
			} while (rep == 'y');
		 }		
}
