package com.cg.corejava.lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exercise4 {

	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> map)
	{
		HashMap<Integer, String> result = new HashMap<Integer, String>();
		Iterator<Entry<Integer, Integer>> mapi = map.entrySet().iterator();
		Iterator<Entry<Integer, Integer>> resulti = map.entrySet().iterator();
		while (mapi.hasNext())
		{
			Map.Entry<Integer, Integer> mapElement = (Map.Entry<Integer, Integer>)mapi.next();
			Map.Entry<Integer, Integer> resultElement = (Map.Entry<Integer, Integer>)resulti.next();
			if (mapElement.getValue() >= 90)
				result.put(mapElement.getKey(), "GOLD");
			else if (mapElement.getValue() >= 80)
				result.put(mapElement.getKey(), "SILVER");
			else if (mapElement.getValue() >= 70)
				result.put(mapElement.getKey(), "BRONZE");
			else
				continue;
		}
		return result;
	}
	
	public static void main(String[] args) {
		char rep = 'y';
		do
		{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Enter the number of Students :");
			n = sc.nextInt();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			System.out.println("Enter "+n+" values :");
			for(int i=0; i<n; i++)
			{
				System.out.println("Enter the Register Number and Mark: "+(i+1));
				map.put(sc.nextInt(), sc.nextInt());
			}
			System.out.println(getStudents(map));
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
		} while (rep =='y');
	}
}