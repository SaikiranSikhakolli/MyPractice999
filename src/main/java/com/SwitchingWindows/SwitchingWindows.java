package com.SwitchingWindows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/"); // Parent Window
		// To get the Parent Window Id
		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);
		if (switchToRightWindow("OrangeHRM - World's Most Popular Opensource HRIS - Home | Facebook", hList)) {
			System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
			Thread.sleep(5000);
		}
	  
		 closeAllWindows(hList, parentWindowId);
		 
		 
		 switchToParentWindow(parentWindowId);
		 System.out.println("Return to home page" +" : "+ driver.getCurrentUrl() + " : " + driver.getTitle());
		  
	}
	
	public static void closeAllWindows(List<String> hList, String parentWindowId) throws InterruptedException {
		for(String e : hList) {
			if(!e.equals(parentWindowId)) {
				System.out.println("Window is Closed" +" : "+ driver.getCurrentUrl() + " : " + driver.getTitle());
				driver.switchTo().window(e).close();
			}
		}
	}

	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);
	}

	public static boolean switchToRightWindow(String windowTitle, List<String> hList) {
		for (String e : hList) {
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("You are in the right window......");
				return true;
			}
		}
		return false;

	}

}
