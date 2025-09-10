package com.TestNG.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	@Test
	public void LaunchApp() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//To avoid the connection establishment error
		//Reference Link: https://stackoverflow.com/questions/75680149/unable-to-establish-websocket-connection
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void EnterLoginDetails() {
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	
	@Test
	public void VerifyMyInfo() {
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
		driver.quit();
	}
	
	@Test
	public void VerifyLogin() {
		//WebElement element = driver.findElement(By.id("welcome"));
		WebElement element = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}
}
