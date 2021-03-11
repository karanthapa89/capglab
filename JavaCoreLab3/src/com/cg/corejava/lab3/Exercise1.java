package com.cg.corejava.lab3;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		char rep='y';
		while(rep=='y')
		{
			System.out.println("Enter your numbers : ");
			s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens())
			{
				System.out.println(st.nextToken());
			}
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
		}
	sc.close();		
	}
}