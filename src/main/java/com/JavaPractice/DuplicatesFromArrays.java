package com.JavaPractice;

public class DuplicatesFromArrays {

	public static void main(String[] args) {
		String[] arr = {"banana","apple","grapes","banana","mango","grapes"};
		for(int i=0; i<arr.length; i+=2) {
			System.out.println(arr[i]);
		}

	}

}
