package com.arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		// How to Defining an array
		//int j[];
		
		// Defining an array with a size
		//For that we need to create an object and we have to specify the size of the array
		int j[] = new int[5];
		
		// Two other ways to define an array
		//1. If you the know the values we can initialize the array without creatig a object
		
		//Initializing an array
		//Here 0 is index most of the progrming languages array starts with the index 0
		// when you create a object with the size java will take the default values of the data type
		// Default value of int is 0
		// Default value of string is null
		// Default value of boolean is false
		
		j[0] = 1;
		j[1] = 2;
		j[2] = 3;
		j[3] = 4;
		j[4] = 5;
		
		// Printing a single data 
		//System.out.println(j[0]);
		
//		//Print all the data using for loop
//		for (int i=0; i<j.length; i++) {
//			System.out.println(j[i]);
//		}
		
		//Print all the data using 
		int i=0;
		while(i<j.length) {
			System.out.println(j[i]);
			i++;
			
		}

	}

}
