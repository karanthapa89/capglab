package com.cg.corejava.lab2;
import java.util.*;
public class Exercise1 {
	public static void getSecondSmallest(ArrayList<Integer> al)
	{
		Collections.sort(al);
		System.out.println("2nd Smallest Element is : "+al.get(1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, num;
		char rep='y';
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (rep=='y')
		{
			System.out.println("Enter the number of elements : ");
			n = sc.nextInt();
			System.out.println("Enter the "+n+" elements : ");
			for (int i=0; i<n; i++)
			{
				num = sc.nextInt();
				al.add(num);
			}
			getSecondSmallest(al);
			System.out.println("Do you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			al.clear();
			rep = sc.next().charAt(0);
		}
	sc.close();
	}	
}
