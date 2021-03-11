package com.cg.corejava.lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void modifyArray(int a[], int n)
	{
		Arrays.sort(a);
		int j=0;
		int temp[] = new int[n];
		for (int i=0; i<n-1; i++)
		{
			if(a[i] != a[i+1])
				temp[j++] = a[i];
		}
		temp[j++] = a[n - 1];
		n=j;
		for (int i=0; i<j; i++)
			a[i] = temp[i];
		Arrays.sort(a);
		System.out.println("After removing Duplicates in Descending Order : ");
		for (int i=j-1; i>=0; i--)
		{
			System.out.print(+a[i]+" ");
		}
		
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
			modifyArray(a, n);
			System.out.println("\n\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
		}
	sc.close();
	}
}