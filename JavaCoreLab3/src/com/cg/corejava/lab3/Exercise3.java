package com.cg.corejava.lab3;
import java.util.*;
public class Exercise3 {

	static String alterString(String s)
	{
		int n = s.length();
		char ch[] = s.toCharArray();
		for(int i=0; i<n; i++)
		{
			if(!(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||
					ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'))
				ch[i] = (++ch[i]); 	
		}
		s = new String(ch);
		return s;
	}
	
	public static void main(String[] args) {
		char rep;
		do
		{
			
			
			Scanner sc = new Scanner(System.in);
			String s;
			System.out.println("Enter a word : ");
			s = sc.nextLine();
			s = alterString(s);
			System.out.println("\"After replacing all consonands with its next character :\"");
			System.out.println(s);
			System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);	
			sc.close();
		}while (rep == 'y');	
	}
}