package com.cg.corejava.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
	
	public static Map<Character, Integer> countChars(char[] arr)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int count;
		for (int i=0; i<arr.length; i++)
		{
			count = 0;
			for (int j=0; j<arr.length; j++)
				if(arr[i] == arr[j])
					count++;
			map.put(arr[i], count);
		}
		return map;
	}
	
	public static void main(String[] arg) {
		char rep = 'y';
		do
		{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			char[] arr;
			System.out.println("Enter your characters :");
			arr = sc.next().toCharArray();
			System.out.println(countChars(arr));
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
		} while (rep =='y');
	}
}