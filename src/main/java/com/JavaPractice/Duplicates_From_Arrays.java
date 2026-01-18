package com.JavaPractice;

public class Duplicates_From_Arrays {

	public static void main(String[] args) {
		String[] arr = {"banana","apple","grapes","banana","mango","grapes"};
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);				
					break;
				}
			}
		}

	}

}
