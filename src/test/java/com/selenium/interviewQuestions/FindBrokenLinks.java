package com.selenium.interviewQuestions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Set<String> brokenLinkUrls = new HashSet<String>();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//Here will get the total count of anchor tags in the xml file
		System.out.println(links.size());
		
		//Here we are iterating links and saving it as String
		for (WebElement link : links) {
			String linkUrls = link.getDomAttribute("href");
			System.out.println(linkUrls);
			
		//Converting String links to URL's
			URL urlLinks = new URL(linkUrls);
			URLConnection con = urlLinks.openConnection();
			HttpsURLConnection httpUrlConnection = (HttpsURLConnection) con;
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			if(httpUrlConnection.getResponseCode()!= 200) {
				brokenLinkUrls.add(linkUrls);
			}
			httpUrlConnection.disconnect();
		}
			driver.quit();
			
			for (String brokenLinkUrl : brokenLinkUrls) {
				System.err.println(brokenLinkUrl);
				
			}
	}

}
