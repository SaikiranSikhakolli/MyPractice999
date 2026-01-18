package com.JavaPractice;

public class Phyramid {

	public static void main(String[] args) {
		int rows=5;
		for(int i=0; i<rows; i++) {
			for(int j=1; j<rows-i; j++) {
				System.out.print(" ");
			}
			for(int s=1;s<=i;s++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
