package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertConfirmPromptBoxes {

	public static void main(String[] args) throws Exception {
		//Bascially Alert Popup, Prompt popup, Confirm Popups comming from the java script not from the html code
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//Alert Box or Popup handling
		
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
//		driver.findElement(By.id("alertBox")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		
		
		//Confirmation Alert Box or Popup
//		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
//		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
//		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		
		
		//Prompt Alert Box or popup
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("HYR Tutorials");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("HYR Tutorials");
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		
		driver.quit();

	}

}
