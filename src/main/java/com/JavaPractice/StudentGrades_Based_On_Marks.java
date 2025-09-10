package com.JavaPractice;

import java.util.Scanner;

public class StudentGrades_Based_On_Marks {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the marks to provide the grade");
		int marks = input.nextInt();
		if (marks>0 && marks<35) {
			System.out.println("Failed");
		}else {
			if(marks == 35) {
				System.out.println("Just Passed");
			}else {
				if(marks>35 && marks<=70) {
					System.out.println("Third Grade");
				}else {
					if(marks>70 && marks<=85) {
						System.out.println("Second Grade");
					}else {
						if(marks>85 && marks<=100) {
						System.out.println("First Grade");
					}
				}
			}
		}
		
		

	}
	}
}