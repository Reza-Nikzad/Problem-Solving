package com.reza.inClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Lab2_A {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();  
		
		for(int i = 1; i <= Integer.parseInt(input); i++) {
			if (isOldEnough(scanner.nextLine())) {
				System.out.println("old enough");
			}else {
				System.out.println("too young");
			}
		}
		 
	}

	public static boolean isOldEnough(String inputString) {		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
		Date pivot_date = null; 
		Date date = null; 
		try {
			pivot_date = dateFormat.parse("18 04 2009"); 
			date = dateFormat.parse(inputString);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
		if( pivot_date.compareTo(date) >= 0) {
			return true;
		}
		return false;
	}
	

}
