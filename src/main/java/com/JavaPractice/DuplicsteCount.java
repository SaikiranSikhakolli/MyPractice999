package com.JavaPractice;

public class DuplicsteCount {

	public static void main(String[] args) {
		
		String input = "manasa";
		input = input.toLowerCase();
		int[] abc = new int[26];
		
		for(char ch : input.toCharArray()) {
			if(ch>='a' && ch<='z') {
				abc[ch - 'a']++;
			}
		}
		
		for(int i=0; i<26; i++) {
			if(abc[i] > 0) {
				System.out.println((char)(i + 'a') + ":" + abc[i]);
			}
		}

	}

}
