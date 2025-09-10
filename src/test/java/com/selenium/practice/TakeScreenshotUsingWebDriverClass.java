package com.selenium.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotUsingWebDriverClass {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
		
		//File
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File fileSourceFile = screenshot.getScreenshotAs(OutputType.FILE);
//		File fileDestFile = new File("./Screenshots/FileImage.png");
//		FileUtils.copyFile(fileSourceFile, fileDestFile);
//		System.out.println("Sceenshot taken successfully");
		
		
		//byte[]
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		byte[] byteArraySourceFile = screenshot.getScreenshotAs(OutputType.BYTES);
//		File byteArrayDestFile = new File("./Screenshots/byteArray.png");
//		FileOutputStream fos = new FileOutputStream(byteArrayDestFile);
//		fos.write(byteArraySourceFile);
//		fos.close();
//		System.out.println("Sceenshot taken successfully");

		//Base64
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String base64SourceFile = screenshot.getScreenshotAs(OutputType.BASE64);
		byte[] bytearray = Base64.getDecoder().decode(base64SourceFile);
		File base64DestFile = new File("./Screenshots/base64.png");
		FileOutputStream fos = new FileOutputStream(base64DestFile);
		fos.write(bytearray);
		fos.close();
		System.out.println("Sceenshot taken successfully");
		
		
		
		
		
		driver.quit();
		
		

	}

}
