package com.cg.corejava.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise6 {

	public static List<Integer> getValues(HashMap<Integer, Integer> map)
	{
		List<Integer> list = new ArrayList<Integer>();
		Iterator<Entry<Integer, Integer>> hmIterator = map.entrySet().iterator();
		while (hmIterator.hasNext())
			{
				Map.Entry<Integer, Integer> mapElement = (Map.Entry<Integer, Integer>)hmIterator.next();
				if (mapElement.getValue() >= 18)
					list.add((int)mapElement.getKey());
			}
		return list;
	}
	
	public static void main(String[] args) {
		char rep = 'y';
		do
		{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Enter the number of elements :");
			n = sc.nextInt();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			System.out.println("Enter your "+n+" elements :");
			for(int i=0; i<n; i++)
			{
				System.out.println("Enter the id and age : "+(i+1));
				map.put(sc.nextInt(), sc.nextInt());
			}
			System.out.println(getValues(map));
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
		} while (rep =='y');
	}
}