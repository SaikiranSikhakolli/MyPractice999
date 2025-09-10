package com.BrokenLinks;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of Links are : " + links.size());
		
		/*Getting the href attribute from the links*/
		
		List<String> urlList = new ArrayList<String>();
		
		for(WebElement e : links) {
			String url = e.getAttribute("href");
			urlList.add(url);
			// brokenLinks(url);
		}
		
		/*
		 * long startTime = System.currentTimeMillis();
		 * urlList.parallelStream().forEach(e -> brokenLinks(e)); long endTime =
		 * System.currentTimeMillis(); System.out.println("Total time taken" + (endTime
		 * - startTime)); driver.quit();
		 */
		
		long startTime = System.currentTimeMillis();
		urlList.stream().forEach(e -> brokenLinks(e));
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken" + (endTime - startTime));
		driver.quit();
	}
	
	public static void brokenLinks(String linkUrl) {
		try {
			
			URL url = new URL(linkUrl);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setConnectTimeout(5000);
			connection.connect();
			
			if(connection.getResponseCode()>=400) {
				System.out.println(linkUrl + "------> " + connection.getResponseCode() + " --------> " +connection.getResponseMessage() + " is a broken link");
			}else {
				System.out.println(linkUrl + "------> " + connection.getResponseMessage() + "is a working link");
			}
			
		}
		catch (Exception e) {
			
		}
	}

}
