package com.cg.corejava.lab1;

import java.util.Scanner;

public class Exercise8 {
	boolean checkNumber(int n)
	{
		if (n%2 != 0)
			return false;
		else
		{
			for (int i=1; i<=n; i++)
				if(Math.pow(2, i) == n)
					return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Exercise8 e8 = new Exercise8();
		int n, rep=1;
		Scanner sc = new Scanner(System.in);
		while(rep==1)
		{
			System.out.print("Enter the number : ");
			n = sc.nextInt();
			boolean res = e8.checkNumber(n);
			System.out.println(n+" is Power of Two : "+res);
			System.out.println("Do you want to continue?");
			System.out.println("Press 1 to continue, any other key to exit....");
			rep = sc.nextInt();
		}
		sc.close();

	}
}