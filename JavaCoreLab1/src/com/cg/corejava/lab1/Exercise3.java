package com.cg.corejava.lab1;
import java.util.Scanner;

public class Exercise3 {

	public static int fibRecur(int n) {
		if(n==0)
			return 0;
		else if(n==1 || n==2)
			return 1;
		else
			return (fibRecur(n-1) + fibRecur(n-2));
	}
	
	public static void fibNonRecur(int n) {
		int i, n1=1, n2=1, n3=0, fib=1;
		for (i=1; i<=n; i++){
			fib=n1;
			n3=n2+n1;
			n1=n2;
			n2=n3;
		}
		
		System.out.println(n+"th element is : "+fib);
	}
	
	public static void main(String[] args) {
		int n, ch, rep=1, fib=1;
		Scanner sc = new Scanner(System.in);
		while(rep==1)
		{
			System.out.print("Enter the number : ");
			n = sc.nextInt();
			System.out.println("Choose the method :");
			System.out.println("1. Recursion method\n2. Non-Recursion method");
			ch = sc.nextInt();
			if (ch==1)
				{
					for (int i=1; i<=n; i++)
						fib=fibRecur(i);
					System.out.println(n+"th element is : "+fib);
				}
			else if (ch==2)
				fibNonRecur(n);
			else {
				System.out.println("Wrong Choice");
			}
			System.out.println("\n\nDo you want to continue?");
			System.out.println("Press 1 to continue, any other key to exit....");
			rep = sc.nextInt();
		}
		sc.close();
	}
}