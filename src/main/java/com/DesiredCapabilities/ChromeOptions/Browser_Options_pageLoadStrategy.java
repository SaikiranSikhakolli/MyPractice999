package com.DesiredCapabilities.ChromeOptions;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Options_pageLoadStrategy {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		//chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		//To get the browserName
		System.out.println(chromeOptions.getBrowserName());
		//To get the PlatformName
		System.out.println(chromeOptions.getPlatformName());

		WebDriver driver = new ChromeDriver(chromeOptions);
		// Navigate to Url
		driver.get("https://google.com");

	}
}
