package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTextBoxes {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		WebElement userName = driver.findElement(By.xpath("//input[@id='login_field']"));
		if (userName.isDisplayed()) { // It will check userName text box is showing in the page or not
			if (userName.isEnabled()) { // It will check userName text box is able to enter the value or not
				userName.sendKeys("Tutorials"); // It will enter the text in the text box
				String userNameText = userName.getDomProperty("value"); // To get the entered text from the text box
				//userName.getAttribute(userNameText); //getAttribute is deprecated now we have to use getDomProperty()
				System.out.println(userNameText);
				Thread.sleep(3000);
				userName.clear();
				Thread.sleep(3000);
			}

		} else {
			System.out.println("userName text box is not displayed");
		}

		driver.close();
	}

}
