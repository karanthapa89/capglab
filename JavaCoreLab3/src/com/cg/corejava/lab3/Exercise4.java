package com.cg.corejava.lab3;
import java.util.*;
import java.lang.Math;
public class Exercise4 {

	static int modifyNumber(int n)
	{
		int temp1, temp2, diff, newnum=0;
		String s = String.valueOf(n);
		StringBuffer sb = new StringBuffer();
		char c[] = s.toCharArray();
		for(int i=0; i<s.length()-1; i++)
		{
			
			temp1 = c[i]; temp2 = c[i+1];
			diff = Math.abs(temp1 - temp2);
			sb.append(diff);
		}
		sb.append(n%10);
		String newS = sb.toString();
		newnum = Integer.parseInt(newS);
		return newnum;
	}
	
	public static void main(String[] args) {
		char rep;
		do
		{
			
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Enter a number : ");
			n = sc.nextInt();
			n = modifyNumber(n);
			System.out.println("\"New Number : \"");
			System.out.println(n);
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);	
			
			sc.close();
		}while (rep == 'y');	
	}
}