package com.cg.corejava.lab1;
import java.util.Scanner;
public class Exercise5 {
	
	static public int calculateSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%3 == 0 || i%5 == 0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n, sum, rep=1;
		Scanner sc = new Scanner(System.in);
		while(rep==1)
		{
			System.out.print("Enter the number : ");
			n = sc.nextInt();
			sum = calculateSum(n);
			System.out.println("Sum of first "+n+" number divisible by 3 or 5 is : "+sum);
			System.out.println("Do you want to continue?");
			System.out.println("Press 1 to continue, any other key to exit....");
			rep = sc.nextInt();
		}
		sc.close();
	}
}