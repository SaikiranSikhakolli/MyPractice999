package com.TestNG.Practice.ClassA;

import org.testng.annotations.Test;

public class PracticeClassB {
	
	@Test(groups= {"smoke"})
	public void method1() {
		System.out.println("This is class B method1");
	}
	
	@Test(groups= {"smoke"})
	public void method2() {
		System.out.println("This is class B method2");
	}
	
	@Test(groups= {"regression"})
	public void method3() {
		System.out.println("This is class B method3");
	}

}
