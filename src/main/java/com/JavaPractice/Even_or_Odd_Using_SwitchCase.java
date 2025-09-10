package com.JavaPractice;

import java.util.Scanner;

public class Even_or_Odd_Using_SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter you number");
		int num = scanner.nextInt();
		switch(num%2) {
		case 0 :
			System.out.println("Given number " + num + " is even number");
			break;
			
		case 1:
			
			System.out.println("Given number " + num + " is odd number");
			break;
		}

	}

}