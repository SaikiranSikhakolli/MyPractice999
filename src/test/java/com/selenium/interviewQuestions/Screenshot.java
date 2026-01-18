package com.selenium.interviewQuestions;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zelis.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.cssSelector(".navbar-brand"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./MyPractice/logo.png");
		FileUtils.copyFile(src, dest);

	}

}
