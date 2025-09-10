package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaits {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		/*
		 * Note: 
		 * 1.Webdriver will not wait even 1second if webelement is not available it immediately throws NoSuchElementException 
		 * 2.To avoid this sutiation we have to use implicitylyWait 
		 * 3.When we use implicitylyWait it will applicable for entire webdriver session 
		 * 4.For a good practice We have to give max of 30 seconds in implicityWait
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		//Instead of implicitylyWait(long, TimeUnit unit) we have to use (Duration duration)
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("HYR");
		driver.quit();

	}

}
