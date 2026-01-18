package com.TestNG.Practice.ClassA;

import org.testng.annotations.Test;

public class PracticeClassA {

	
	@Test(priority=3, groups= {"smoke"})
	public void method1() {
		System.out.println("This is class A method1");
	}
	
	@Test(priority=2, groups= {"regression"})
	public void method2() {
		System.out.println("This is class A method2");
	}
	
	@Test(priority=1, groups= {"smoke"})
	public void method3() {
		System.out.println("This is class A method3");
	}
}
