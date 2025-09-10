package com.JavaPractice;

import java.util.Scanner;

public class Input_From_Console {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hey user what is you name?");
		String name = scanner.nextLine();
		System.out.printf("Hey %s, How are you \n", name);
		String status = scanner.nextLine();
		System.out.printf("What is you age %s \n", name);
		int age = scanner.nextInt();
		System.out.printf("Thank you for the information %s", name);

	}

}
