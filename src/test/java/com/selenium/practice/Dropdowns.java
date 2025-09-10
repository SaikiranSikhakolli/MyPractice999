package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement courseElement = driver.findElement(By.id("course"));

		Select courseNameDropdown = new Select(courseElement);
		courseNameDropdown.selectByIndex(4);
		Thread.sleep(3000);
		courseNameDropdown.selectByValue("java");
		Thread.sleep(3000);
		courseNameDropdown.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
		for (WebElement options : courseNameDropdownOptions) {
			System.out.println(options.getText());
			courseNameDropdown.selectByVisibleText(options.getText());
			Thread.sleep(3000);

		}

// Select Multiple Values from the Dropdown
		WebElement ideName = driver.findElement(By.id("ide"));
		// Converting WebElement in to a dropdown using Select Class
		Select ideNameValues = new Select(ideName);
		ideNameValues.selectByIndex(3);
		Thread.sleep(1000);
		ideNameValues.deselectByValue("ij");
		Thread.sleep(1000);
		ideNameValues.selectByVisibleText("Eclipse");
		Thread.sleep(1000);
		ideNameValues.deselectAll();

		// Get all the options from the ideName
		List<WebElement> ideNameOptions = ideNameValues.getOptions();
		for (WebElement ele : ideNameOptions) {
			System.out.println(ele.getText());
			ideNameValues.selectByVisibleText(ele.getText());
			Thread.sleep(1000);
		}

		ideNameValues.deselectByVisibleText("Eclipse");

		List<WebElement> allSelectedOptions = ideNameValues.getAllSelectedOptions();
		for (WebElement selectedOptions : allSelectedOptions) {
			System.out.println(selectedOptions.getText());
			Thread.sleep(1000);
		}

		driver.close();
	}

}
