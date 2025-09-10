package com.selenium.practice;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsAndTabsHandling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//Window Handling
//		
//		String parentWindowID = driver.getWindowHandle(); //It will give you the current window id
//		System.out.println("ParentWindowID is : " + parentWindowID + "Window Title is :" + driver.getTitle());
//		
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String> getWindowsIds = driver.getWindowHandles(); //It will provide the all the id of windows which is opened
//		for (String getEachWindowID : getWindowsIds) {
//			System.out.println("Child Window ID is  : " + getEachWindowID);
//			if(!getEachWindowID.equals(parentWindowID)) {
//				driver.switchTo().window(getEachWindowID);
//				driver.manage().window().maximize();
//				System.out.println(driver.getTitle());
//				driver.close();
//			}
//							
//		}
//		driver.switchTo().window(parentWindowID);
//		driver.findElement(By.id("name")).sendKeys("Saikiran");
		
		// New tab handling
		String parentTabID = driver.getWindowHandle(); //It will give you the current window id
		System.out.println("ParentTabID is : " + parentTabID + "Window Title is :" + driver.getTitle());
		
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> getTabsIds = driver.getWindowHandles();
		for (String getEachTabID : getTabsIds) {
			System.out.println("Child Tab ID's : " + getEachTabID);
			if(!getEachTabID.equals(parentTabID)) {
				driver.switchTo().window(getEachTabID);
				driver.manage().window().maximize();
				System.out.println("Curent Tab Title is  : " + driver.getTitle());
				System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
				driver.findElement(By.id("alertBox")).click();
				Thread.sleep(3000);
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
				driver.close();
			}
			
		}
		driver.switchTo().window(parentTabID);
		driver.findElement(By.id("name")).sendKeys("Saikiran");
		driver.quit();
		
	}

}
