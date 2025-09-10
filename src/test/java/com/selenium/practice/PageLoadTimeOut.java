package com.selenium.practice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Here what we are doing is to know the time of a pageload when we launch
		//To get the time we have to use one Java API called time (package : java.time)
		
		/*
		 * Note: 
		 * 1. As per the W3C the default time of a PageLoadTime is 300000 milli-seconds that is 300secs or 5mins 
		 * 2.Once the default time is exceeded it will throw TimeoutException 
		 * 3.If you use negative values like -5 in the pageLoadTimeout it will not throw any compile time error but in the runtime it will throw
		 * InvalidArgumentException 
		 * 4.Now pageLoadTimeout(longtime, TimeUnit unit) is
		 * deprecated instead of this we have to use pageLoadTimeout(Duration duration)
		 */
		
		Instant startTime = Instant.now();
		System.out.println("StartTime is : " + startTime.toString());
		
		driver.get("https://www.hyrtutorials.com/");
		
		Instant endTime = Instant.now();
		System.out.println("EndTime is : " + startTime.toString());
		
		//To know the difference between stratTime and endTime we have to use Duration class
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("PageLoadTimeout differnce : " + duration.toMillis() + " in Milli Seconds");
		
		
		driver.quit();
		

	}

}
