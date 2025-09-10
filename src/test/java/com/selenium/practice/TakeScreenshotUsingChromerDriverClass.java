package com.selenium.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotUsingChromerDriverClass {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
		
		//Taking Screenshot as File type
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		File filedestFile = new File("./Screenshots/FileImage.png");
		FileUtils.copyFile(sourceFile, filedestFile);
		System.out.println("Screenshot taken successfully");
		
		//Taking Screenshot as type Array
		byte[] arraySourceFile = driver.getScreenshotAs(OutputType.BYTES);
		File arrayDestFile = new File("./Screenshots/ArryaImage.png");
		//FileOutputStream has method to read the data from the byte[]
		FileOutputStream fos1 = new FileOutputStream(arrayDestFile);
		fos1.write(arraySourceFile); 
		fos1.close();
		System.out.println("Screenshot taken successfully");
		
		//Base64
		String base64 = driver.getScreenshotAs(OutputType.BASE64);
		//We can't use directly base64 we have to convert it to byte[] then only we can use it
		byte[] bytearray = Base64.getDecoder().decode(base64);
		File destFile = new File("./Screenshots/base64Image64.png");
		FileOutputStream fos2 = new FileOutputStream(destFile);
		fos2.write(bytearray);
		fos2.close();
		System.out.println("Screenshot taken successfully");
		
		driver.quit();
		
	}

}
