package com.TestNG.Practice.ClassA;

import org.testng.annotations.Test;

public class PracticeClassC {

	@Test(groups= {"regression"})
	public void method1() {
		System.out.println("This is class C method1");
	}
	
	@Test(groups= {"regression"})
	public void method2() {
		System.out.println("This is class C method2");
	}
	
	@Test(groups= {"smoke"})
	public void method3() {
		System.out.println("This is class C method3");
	}
}
