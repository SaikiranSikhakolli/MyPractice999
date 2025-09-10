package com.selenium.practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionClass_RahulShetty {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement courseElement = driver.findElement(By.id("autocomplete"));
		courseElement.sendKeys("In");
		//List<WebElement> dropdownList = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		//List<WebElement> dropdownList = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		List<WebElement> dropdownList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for (WebElement webElement : dropdownList) {
		System.out.println(webElement.getText());
//			if(webElement.getText().equalsIgnoreCase("British Indian Ocean Territory")) {
//				webElement.click();
//			}
		}
		
	}

}
