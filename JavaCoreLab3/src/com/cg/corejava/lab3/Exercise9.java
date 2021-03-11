package com.cg.corejava.lab3;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;  

public class Exercise9 {

	public static void main(String[] args) throws ParseException 
	{
		 Scanner sc = new Scanner(System.in);
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		 LocalDateTime now = LocalDateTime.now();
		 String end_date;
			 
		
		 System.out.println("Enter your date : ");
		 end_date = sc.nextLine();
		 String start_date= dtf.format(now);
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		 Date d1 = sdf.parse(start_date); 
         Date d2 = sdf.parse(end_date);
         
         {
        	 System.out.println("System Date : "+d1);
         }
         {
        	 System.out.println("Your Date : "+d2);
         }
         long difference_In_Time =Math.abs(d1.getTime() - d2.getTime()); 
         long difference_In_Days = (difference_In_Time   / (1000 * 60 * 60 * 24)) % 365;
         System.out.println(difference_In_Days);
         
         sc.close();
	}
}