package com.cg.corejava.lab1;
import java.util.Scanner;
public class Exercise4 {
	public static int prime (int num) {
		for(int i=2; i<=num/2; i++)
		{
			if(num%i == 0)
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		int n, rep=1, flag = 0;
		Scanner sc = new Scanner(System.in);
		while(rep==1) {
			System.out.print("Enter the number : ");
			n = sc.nextInt();
			for (int i=2; i<=n; i++)
			{
				flag = prime(i);
				if (flag == 1)
					System.out.print(i+" ");
			}
			System.out.println("\n\nDo you want to continue?");
			System.out.println("Press 1 to continue, any other key to exit....");
			rep = sc.nextInt();
		}
		sc.close();
	}
}