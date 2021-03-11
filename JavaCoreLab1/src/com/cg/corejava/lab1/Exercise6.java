package com.cg.corejava.lab1;
import java.util.Scanner;
public class Exercise6 {
	
	public int calculateDifference(int n)
	{
		int s1, s2, sum;
		s1=s2=0;
		s1 = (n * (n+1) * (2*n+1)) / 6;
		s2 = (n * (n+1)) / 2;
		s2 = s2*s2;
		sum = Math.abs(s1 - s2);
		return sum;
	}
	
	public static void main(String[] args) {
		Exercise6 e6 = new Exercise6();
		int n, sum, rep=1;
		Scanner sc = new Scanner(System.in);
		while(rep==1)
		{
			System.out.print("Enter the number : ");
			n = sc.nextInt();
			sum = e6.calculateDifference(n);
			System.out.println("Difference between sum of squares and square of sum is : "+sum);
			System.out.println("Do you want to continue?");
			System.out.println("Press 1 to continue, any other key to exit....");
			rep = sc.nextInt();
		}
		sc.close();
	}
}