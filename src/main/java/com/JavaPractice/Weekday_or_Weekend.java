package com.JavaPractice;

import java.util.Scanner;

public class Weekday_or_Weekend {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter week name");
		String weekName = input.nextLine();
		System.out.println(weekName);
		if(weekName.trim().equalsIgnoreCase("monday")){
			System.out.println("UFF, Its a Weekday");
		}else{
			System.out.println("Hurry, its a weekend");
		}
		

	}

}
