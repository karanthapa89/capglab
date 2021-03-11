package com.cg.corejava.lab1;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int num, rem, sum, val, rep=1;
		Scanner sc = new Scanner(System.in);
		while(rep==1)
		{
			System.out.print("Enter the number : ");
			num = sc.nextInt();
			val = num;
			sum = 0;
			while(num!=0)
		{
			rem=num%10;
			sum+=(rem*rem*rem);
			num/=10;	
		}
		System.out.println("Sum of cubes of the digits of "+val+" is : "+sum);
		System.out.println("Do you want to continue?");
		System.out.println("Press 1 to continue, any other key to exit....");
		rep = sc.nextInt();
		}
		sc.close();
	}	
}