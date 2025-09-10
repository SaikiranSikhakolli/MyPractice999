package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Actions {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		actions.moveToElement(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/descendant::li[@class='oxd-main-menu-item-wrapper']"))).click().perform();
		actions.moveToElement(driver.findElement(By.xpath("//span[normalize-space(text())='Organization']"))).click().perform();
		actions.moveToElement(driver.findElement(By.xpath("//ul[@role='menu']/child::li/a[contains(text(),'Locations')]"))).click().perform();
		driver.close();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		actions.moveToElement(driver.findElement(By.xpath("//span[.='right click me']"))).contextClick().perform();
		driver.findElement(By.xpath("//span[.='Edit']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();
	}
}
