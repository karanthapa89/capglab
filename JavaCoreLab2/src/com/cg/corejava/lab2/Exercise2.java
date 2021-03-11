package com.cg.corejava.lab2;
import java.util.*;
public class Exercise2 {
	
	public static void sortStrings(String str[])
	{
		int i, mid;
		Arrays.sort(str);
		if((str.length) %2 ==0)
			mid = (str.length)/2;
		else
			mid = ((str.length)/2)+1;
		for (i=0; i<mid; i++)
			System.out.println(str[i].toUpperCase());
		for (i=mid; i<str.length; i++)
			System.out.println(str[i].toLowerCase());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		char rep='y';
		while (rep=='y')
		{
			System.out.println("Enter the number of elements : ");
			n = sc.nextInt();
			String str[] = new String[n+1];
			System.out.println("Enter the "+n+" elements : ");
			for (int i=0; i<str.length; i++)
				str[i] = sc.nextLine();
			sortStrings(str);
			System.out.println("Do you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
		}
		sc.close();
	}
}