package com.cg.corejava.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	
	public static Map<Integer, Integer> getSquares(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sq;
		for (int i=0; i<arr.length; i++)
		{
			sq = arr[i]*arr[i];
			map.put(arr[i], sq);
		}
		return map;
	}
	
	public static void main(String[] arg) {
		char rep = 'y';
		do
		{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Enter the number of elements :");
			n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter your "+n+" elements :");
			for(int i=0; i<n; i++)
				arr[i] = sc.nextInt();
			System.out.println(getSquares(arr));
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
		} while (rep =='y');
	}
}