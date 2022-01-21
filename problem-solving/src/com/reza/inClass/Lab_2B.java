package com.reza.inClass;

import java.util.HashMap;
import java.util.Scanner;

public class Lab_2B {

	public static void main(String[] args) {
		/* Sample input
		 * 2
		 * 27 88
		 * 97 14
		 * 18
		 * 0 1 0 2 0 3 0 3 2 4 4 2 1 1 5 2 0 100
		 * output: B 100
		 */
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();  
		
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		for(int i = 0 ; i< Integer.parseInt(input); i++) {
			String[] lad = scanner.nextLine().split(" ");
			map.put(Integer.parseInt(lad[0]), Integer.parseInt(lad[1])); 
		}
		
		int[] dice = new int[Integer.parseInt(scanner.nextLine())];
		String[] temp = scanner.nextLine().split(" ");
		
		for(int i = 0 ; i< dice.length; i++) {
			dice[i] = Integer.parseInt(temp[i]); 
		}
		
		int a = 1;
		int b = 1; 
		
		for(int i = 0; i< dice.length; i+=2) {
			a += dice[i]; 
			if(a >= 100) {
				System.out.println("A "+ 100);
				return; 
			}
			
			b += dice[i+1]; 
			if(b >= 100) {
				System.out.println("B "+ 100);
				return;
			}
			
			while(map.containsKey(a)){
				a = map.get(a); 
			}
			while(map.containsKey(b)){
				b = map.get(b); 
			}
	
		}
		
		if(a > b) {
			System.out.println("A "+ a); 
			
		}else {
			System.out.println("B "+ b); 
		}
		
	}

}
