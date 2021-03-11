package com.cg.corejava.lab3;
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args){           
        char rep;  
        do
        {
        	String s;
        	int nl=1,nw=0;
        	char ch;
        	
			Scanner sc=new Scanner(System.in);
        	System.out.print("\nEnter text: ");	
        	s=sc.nextLine();
        	int n=s.length();
        	for(int i=0;i<n;i++)
        	{
        		ch=(char)s.charAt(i);
                if(ch=='\n')
                    nl++;
                else if(ch==' ')
                    nw++;                                           
        	}
	        System.out.println("\nNumber of lines : "+nl);
	        System.out.println("\nNumber of words : "+(nl+nw));
	        System.out.println("\nNumber of characters : "+n);
	        System.out.println("\nDo you want to continue?");
			System.out.println("Press 'y' to continue, any other key to exit....");
			rep = sc.next().charAt(0);
			sc.close();
			
        }while (rep == 'y');	
	}
}