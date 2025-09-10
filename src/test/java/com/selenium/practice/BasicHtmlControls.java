package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicHtmlControls {

	public static void main(String[] args) throws Exception {
		//Text-box, Radio-button, Check-box, Link, Button, Label
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Lavanya");	
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindiChkBox = driver.findElement(By.id("hindichbx"));
		hindiChkBox.click();
		Thread.sleep(3000);
		if(hindiChkBox.isSelected()) 
			hindiChkBox.click(); //Uncheck if hindi check box already selected
			Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
		

	}

}
