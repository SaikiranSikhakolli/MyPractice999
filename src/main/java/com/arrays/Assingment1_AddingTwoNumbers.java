package com.arrays;

public class Assingment1_AddingTwoNumbers {
	static int sum =0;
	static double average;
	static int i;
	
	public static void main(String[] args) {
			
		int j[] = new int[5];
		
		j[0] = 2;
		j[1] = 5;
		j[2] = 1;
		j[3] = 9;
		j[4] = 6;
		
		for (i=0; i<j.length;i++) {
			
			sum += j[i];
			
		}
		System.out.println(sum);
		average  = (double) sum/j.length;
		System.out.println(average);
		
	}

}
