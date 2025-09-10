package com.selenium.practice;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendars_HYRTutorials {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addExtensions(new File("./resources/AdBlocker.crx"));
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		Actions actions = new Actions(driver);
		WebElement seleniumPractice = driver.findElement(By.xpath("//a[normalize-space()='Selenium Practice']"));
		actions.moveToElement(seleniumPractice).build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Calendars Practice']"))).click()
				.build().perform();
		// driver.findElement(By.id("first_date_picker")).click();
		int day = 1;
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()= "+day+"]")).click();
//		int day1 = 25;
//		driver.findElement(By.id("second_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()= "+day1+"]")).click();
		driver.findElement(By.id("second_date_picker")).click();

		// We are eliminating the previous month and next month dates and selecting the
		// date from the current month
//		driver.findElement(By.xpath(
//				"//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()="
//						+ day + "]"))
//				.click();

		// Now we are passing the date
		String targetDate = "20/Feb/2025";

		// Converting the date to java readable format
		try {
			// Java doesn't understand the given date format for that we have to tell the
			// date format to java
			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
			
			//When we given worng date as input java will not throw the error and it 
			//will carry forward the extra days to next month to avoid this we are writting the below code
			targetDateFormat.setLenient(false);
			
			Date formattedTargetDate = targetDateFormat.parse(targetDate);
			System.out.println(formattedTargetDate);
		} catch (ParseException e) {
			throw new Exception("User Provided invalid Input Date");
		}
		driver.quit();

	}

}
