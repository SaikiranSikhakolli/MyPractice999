package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		//Now Driver is focusing into the main html 
		driver.findElement(By.id("name")).sendKeys("Text1");
//		
//		//Now Jumping in to Frame1
//		driver.switchTo().frame("frm1");
//		Select courseName = new Select(driver.findElement(By.id("course")));
//		courseName.selectByVisibleText("Java");
//		Thread.sleep(1000);
//		
//		//Coming back to Main Html
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("name")).sendKeys("Text2");
//		Thread.sleep(1000);
//		
//		//Now Jumping in to Frame2
//		driver.switchTo().frame("frm2");
//		driver.findElement(By.id("email")).sendKeys("saikiran");
//		Thread.sleep(1000);
//		
//		//Jumping back to Main Html
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("name")).sendKeys("Text3");
//		Thread.sleep(1000);
//		
//		//Jumping to Frame1
//		driver.switchTo().frame("frm1");
//		courseName.selectByVisibleText("Dot Net");
//		Thread.sleep(1000);
//		
//		//Jumping back to Main Html
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("name")).sendKeys("Text4");
//		Thread.sleep(1000);
//		driver.quit();
		
		//Jumping to Frame3
		driver.switchTo().frame("frm3");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Switched to Frame3");
		//Switching to Nested Frame ----> Frame 3 has 3 child frames frame1, frame2, frame3
		//Now switching to Parent Frame3 ---> Child Frame1
		driver.switchTo().frame("frm1");
		Select courseName = new Select(driver.findElement(By.id("course")));
		courseName.selectByVisibleText("Java");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Switched to Frame3");
		
		
	}

}
