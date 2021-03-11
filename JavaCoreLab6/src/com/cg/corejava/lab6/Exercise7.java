package com.cg.corejava.lab6;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise7 {
	
	public static void getSorted(int a[], int n)
	{
		for(int i=0; i<n; i++)
		{
			StringBuffer sb = new StringBuffer(Integer.toString(a[i]));
			sb.reverse();
			a[i] = Integer.parseInt(sb.toString());
		}
		Arrays.sort(a);
		System.out.println("After reversal and sorting :");
		for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];
		char rep = 'y';
		while (rep=='y')
		{
			System.out.println("Enter the number of elements : ");
			n = sc.nextInt();
			a=new int[n];
			System.out.println("Enter the "+n+" elements : ");
			for (int i=0; i<n; i++)
				a[i]=sc.nextInt();
			getSorted(a, n);
			System.out.println("\n\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
		}
	sc.close();
	}
}