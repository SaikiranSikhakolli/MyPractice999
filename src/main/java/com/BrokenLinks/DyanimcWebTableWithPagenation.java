package com.BrokenLinks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DyanimcWebTableWithPagenation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
				
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		//Sales--order
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//Getting the noof pages count
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);
		
		//From the text we are taking particular text and convert in to integer 
		int total_pages =  Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("Total no of pages:" + total_pages);
		int x=0;
		int y=0;
		for(int p=1;p<=5;p++) {
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active Page:"+active_page.getText());
			Thread.sleep(5000);
			active_page.click();
			
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Number of rows : " + rows);
			
			
			//Reading all the rows from the page
			for(int r=1;r<=rows;r++) {
				
				String orderId=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
				
				if(status.equals("Pending")) {
					x++;
					y++;
					
				System.out.println(orderId + "            " + customerName + "          " + status);
				
				}
				
			}
	
			String pageno = Integer.toString(p+1);
			//if(Integer.valueOf(pageno)<=total_pages) {
			//System.out.println("Current page no" + pageno);
			System.out.println("Total pending's in page-" + p + " is :" + y);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
			y=0;
			Thread.sleep(5000);
			//System.out.println("Total pending's is :" + x);
			//}
		}
		System.out.println("Total pending's is :" + x);
	}

}
