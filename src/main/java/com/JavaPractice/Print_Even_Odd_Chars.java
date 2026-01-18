package com.JavaPractice;

public class Print_Even_Odd_Chars {

	public static void main(String[] args) {
		
		String input = "helloworld";
		int i=0;
		String even="";
		String odd="";
		// Approach1 print even digits
		/*
		 * System.out.println("Original Strinng is:" + input);
		 * System.out.print("Even digit chars : "); for(i=0; i<input.length(); i+=2) {
		 * System.out.print(input.charAt(i) + "-" + i + " "); } System.out.println();
		 * 
		 * System.out.print("Odd digit chars : "); for(i=1; i<input.length(); i+=2) {
		 * System.out.print(input.charAt(i) + "-" + i + " ");
		 * 
		 * }
		 */
		
		//Approach2
		for (i=0; i<input.length(); i++) {
			if(i%2==0) {
				even += input.charAt(i);
			}else {
				odd += input.charAt(i);
			}
		}
		System.out.println(odd);
		System.out.println("Even : " + even);
	}

}
