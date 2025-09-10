package com.JavaPractice;

public class Operators {

	public static void main(String[] args) {
		
		int i =10;
		int j = 10;
		
		//Arithmetic Operations
		//ctrl+/ same for comment and uncomment
		
//		System.out.println(i+j);
//		System.out.println(i-j);
//		System.out.println(i*j);
//		//Division it will provide the quotient output
//		System.out.println(i/j);
//		//Modulus it will provide the reminder output
//		System.out.println(i%j);
		
		
//Unary Operators has 2 types ++(increment) --(Decrement)
		
//		System.out.println(i); //20
//		//Pre-increment
//		System.out.println(++i); //21
//		//Post-increment
//		System.out.println(i++); //21
//		System.out.println(i);//22
		
//		System.out.println(i); //20
//		//Pre-increment
//		System.out.println(--i); //19
//		//Post-increment
//		System.out.println(i--); //19
//		System.out.println(i);//18
		
		

// Relational Operators always provide boolean as output
//		== (equal to)
//		!= (Not Equal to)
//		> (Greater than)
//		< (Less than)
//		>= (Greater than or equal to)
//		<= (Less than or equal to)
		
//		System.out.println(i == j); //false
//		System.out.println(i != j); // true
//		System.out.println(i > j); //true
//		System.out.println(i < j); //false
//		System.out.println(i >= j); //true
//		System.out.println(i <= j); //false
		
// Conditional Operators
		// && (Conditional AND)
		// || (Conditional OR)
		
		// ture-true, true-false, false-true, false-false
		
//		System.out.println(i > j && i != j); //true If any one condition is false output is false
//		System.out.println(i > j && i==j); //false
//		System.out.println(j > i && i==j); //false
//		System.out.println(j>i && i < j); //false
		
//		System.out.println(i > j || i != j); //true If any one condition is true output is true, if both false output is false
//		System.out.println(i > j || i==j); //true
//		System.out.println(j > i || i==j); //false
//		System.out.println(j>i || i < j); //false
		
// Assignment Operators
		// =, +=, -=, *=, /=, %=
		
//		i = i+5;
//		System.out.println(i); //25 Here we are adding 5 to i and again storing the value in i
//		
//		i += 5; //30 This is the shortcut of i=i+5
//		System.out.println(i);
//		
//		i -=5; //25
//		System.out.println(i);
//		
//		i *=5; //125
//		System.out.println(i);
//		
//		i /=5; //25
//		System.out.println(i);
//		
//		i %=5; //0
//		System.out.println(i);

//Assignment 
		int n = i++ + ++i + i-- - --i;
		// Ask ChatGPT for explanation with below question ---> 
		//what is the value of n if i=20 for below expression int n = i++ + ++i + i-- - --i;
		//20 + 22 + 22 -20
		System.out.println(n);
			
		}

}
