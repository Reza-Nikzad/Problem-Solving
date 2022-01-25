package com.reza.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<List<Integer>> set = new HashSet<>();
		
		for (List<Integer> list : set) {
			for (int i: list ) {
				System.out.print(i+",");
			}
			System.out.println();
		}
	}

}
