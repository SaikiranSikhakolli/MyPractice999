package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeBrowserWindows {

	public static void main(String[] args) {
		
		//Chrome Browser
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		//First it will open the browser in default size after that it will maximize
//		driver.manage().window().maximize();
		
		//Open Chrome browser in maximized mode for that we have to use ChromeOptions
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
//		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://www.hyrtutorials.com/");
		
		//To work with edge browser we have to add the dependency because if we are using less than selenium 4 version
		/* https://mvnrepository.com/artifact/com.microsoft.edge/msedge-selenium-tools-java
		 * <!--
		 * https://mvnrepository.com/artifact/com.microsoft.edge/msedge-selenium-tools-
		 * java --> <dependency> <groupId>com.microsoft.edge</groupId>
		 * <artifactId>msedge-selenium-tools-java</artifactId>
		 * <version>3.141.1</version> </dependency>
		 */

		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.hyrtutorials.com/");
		
		
		
		
		
		
		
		driver.quit();

	}

}
