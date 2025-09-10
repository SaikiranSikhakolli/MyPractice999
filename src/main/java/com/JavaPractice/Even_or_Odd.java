package com.JavaPractice;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		
		//Import Scanner library always from java.util
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number to evaluate");
		int num = scanner.nextInt();
		if(num%2==0) {
			System.out.println("Given number : " + num + " :is even number");
		}else {
			System.out.println("Given number : " + num + " :is odd number");
		}

	}

}
