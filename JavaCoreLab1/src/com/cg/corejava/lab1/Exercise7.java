package com.cg.corejava.lab1;
import java.util.Scanner;
public class Exercise7 {
	boolean checkNumber(int number)
	{
		String s = Integer.toString(number);
		char ch;
		int f=0;
		for (int i=0; i<s.length()-1; i++)
		{
			ch = s.charAt(i);
			if(ch > s.charAt(i+1))
			{
				f=1;
				break;
			}
		}
		if (f==1)
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		Exercise7 e7 = new Exercise7();
		int n, rep=1;
		Scanner sc = new Scanner(System.in);
		while(rep==1)
		{
			System.out.print("Enter the number : ");
			n = sc.nextInt();
			boolean res = e7.checkNumber(n);
			System.out.println(n+" is an Increasing Number : "+res);
			System.out.println("Do you want to continue?");
			System.out.println("Press 1 to continue, any other key to exit....");
			rep = sc.nextInt();
		}
		sc.close();
	}
}