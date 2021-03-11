package com.cg.corejava.lab5;

import java.util.Scanner;

@SuppressWarnings("serial")
class EmployeeException extends Exception
{
	EmployeeException(String message)
	{
		System.err.println(message);
	}
}

public class Exercise3 
{
	public static void check(double salary) 
	{	  
		try 
		{ 
		  if(salary<=3000)
			  throw  new EmployeeException("Salary not accepted...." );
		  else
			  System.out.println("\"Salary accepted....\""); 
		}
		catch(EmployeeException e1)
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
			System.out.println("Enter your Salary: ");
			int salary=sc.nextInt();
			check(salary);
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
			} while (rep =='y');
		 }		
}
