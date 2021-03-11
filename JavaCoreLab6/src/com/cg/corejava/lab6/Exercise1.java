package com.cg.corejava.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise1 {

	public static List<Integer> getValues(HashMap<Integer, Integer> map)
	{
		List<Integer> list = new ArrayList<Integer>();
		Iterator<Entry<Integer, Integer>> hmIterator = map.entrySet().iterator();
		while (hmIterator.hasNext())
			{
				Map.Entry<Integer, Integer> mapElement = (Map.Entry<Integer, Integer>)hmIterator.next();
				list.add((int)mapElement.getValue());
			}
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) {
		char rep = 'y';
		do
		{
			
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Enter the number of elements :");
			n = sc.nextInt();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			System.out.println("Enter your "+n+" elements :");
			for(int i=0; i<n; i++)
			{
				System.out.println("Enter the value "+(i+1));
				map.put(i, sc.nextInt());
			}
			System.out.println(getValues(map));
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
			sc.close();
		} while (rep =='y');
	}
}