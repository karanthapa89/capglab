package com.cg.corejava.lab3;
import java.util.*;
public class Exercise2 {

	static String getImage(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		sb.append(" | ");
		sb.reverse();
		s+=sb;
		return s;
	}
	
	public static void main(String[] args) {
		char rep;
		do
		{
			
			Scanner sc = new Scanner(System.in);
			String s;
			System.out.println("Enter a word : ");
			s = sc.nextLine();
			s = getImage(s);
			System.out.println("\"Mirror Image\"");
			System.out.println(s);
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);	
			sc.close();
		}while (rep == 'y');		
	}
}