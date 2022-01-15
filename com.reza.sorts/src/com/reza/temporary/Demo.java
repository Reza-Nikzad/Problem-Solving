package com.reza.temporary;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();  
		employees.add(new Employee("reza", 1)); 
		employees.add(new Employee("parisa", 2)); 
		employees.add(new Employee("arezo", 3)); 
		employees.add(new Employee("dad", 4)); 
		
		
		employees.remove(0); 
		
		System.out.println(employees.size());
		employees.add(2, new Employee("mom", 10));
		
		employees.set(0, new Employee("Safoora", 3)); 
		
		employees.forEach(employee -> System.out.println(employee)); // Like for loop, Lambda Expression
		System.out.println(employees.get(2));
		System.out.println(employees.isEmpty());
		
		System.out.println(employees.contains(new Employee("Safoora", 3)));
		
		
	}

}
