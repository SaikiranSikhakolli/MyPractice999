package com.JavaPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String input="manasa";
		input = input.toLowerCase();
		char[] ch = input.toCharArray();
		
		for(int i=ch.length-1;i>=0; i--) {
			System.out.print(ch[i]);
		}

	}

}
