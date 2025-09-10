package com.JavaPractice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Adding_Two_Nunbers_Using_SwitchStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your first number");
		double num1 = scanner.nextInt();
		System.out.println("please enter your second number");
		double num2 = scanner.nextInt();
		System.out.println("Please enter your operator");
		char op = scanner.next().charAt(0);
		double result;
		switch(op) {
		case '+' :
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-' :
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*' :
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/' :
			result = num1 / num2;
			System.out.println(result);
			break;
		case '%' :
			result = num1 % num2;
			System.out.println(result);
			break;
		default:
			System.out.println("Entered numbers are invalid");
		}

	}

}
