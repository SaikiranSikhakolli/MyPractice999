package com.JavaPractice;

public class First_And_Last_Letter_Reverse {

	public static void main(String[] args) {
		String input = "manasa";
		input = input.toLowerCase();
		char first = input.charAt(0);
		char last = input.charAt(input.length()-1);
		String middle = input.substring(1, input.length()-1);
		String result = last + middle + first;
		System.out.println(result);

	}

}
