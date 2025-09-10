package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GETURL_GETTitle_GETPagesource {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");

		//Get URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is : " + currentURL);
		
		//Get Title
		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		
		//Get Page-Source
		String pageSource = driver.getPageSource();
		System.out.println("PageSource is : " + pageSource);
		
		
		driver.quit();
		
	}

}
