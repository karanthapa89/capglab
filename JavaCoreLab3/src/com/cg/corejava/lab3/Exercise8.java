package com.cg.corejava.lab3;

import java.util.Scanner;

public class Exercise8 {

	static boolean positiveString(String s)
	{
		char ch[] = s.toCharArray();
		for (int i=0; i<s.length()-1; i++){	
			if(ch[i] > ch[i+1])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		char rep;
		do
		{
			
			Scanner sc = new Scanner(System.in);
			String s;
			System.out.println("Enter a word : ");
			s = sc.nextLine();
			boolean b = positiveString(s);
			System.out.println("\"Positive String ?\"");
			System.out.println(b);
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);	
			
			sc.close();
		}while (rep == 'y');	
	}
}