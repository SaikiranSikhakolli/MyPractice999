package com.TestNG.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {

	@Test(dataProvider = "createTestData")
	public void dataProviderTest(String userName, String password) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
		
	}
	
	// @DataProvider(name="logindata") // With name
	 @DataProvider // Without name then we have to use the method name 
	public Object[][] createTestData() {
		
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "Admin";
		obj[0][1] = "admin123";
		
		
		obj[1][0] = "Admin";
		obj[1][1] = "admin12334";
		
		return obj;
	}
}
