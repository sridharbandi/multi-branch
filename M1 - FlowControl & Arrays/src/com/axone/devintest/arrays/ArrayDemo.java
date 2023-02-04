package com.axone.devintest.arrays;

import java.io.File;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//initialse the values of an array at the time of creation
		String[] tools = {"Selenium", "Cucumber" , "JBehave"};
		String[] toolsNew = {"Selenium", "Cucumber" , "JBehave"};
		System.out.println(tools[2]);
		
		//primitive data types are also allowed
		int[] numbers = new int[5];
		numbers[0] = 93470973;
		
		int[] someNumbers ={3490, 34990, 907430};
		
		System.out.println(numbers.length);
		
		//initally creating a container which can hold 10 strings
		String[] names = new String[10];
		names[0] = "Ram";
		names[9] = "Jack";
		
		System.out.println(names.length);
		System.out.println(names.length);
		System.out.println(names.length);
		
		for(int i=0; i <names.length; i++){
			System.out.println(names[i]);
			System.out.println(names[i]);
		}

		File[] fileArray = new File[5];
			//comment
		/*
		I'm adding a block comment
		 */
	}

}
