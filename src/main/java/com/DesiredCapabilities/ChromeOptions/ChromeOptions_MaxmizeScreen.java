package com.DesiredCapabilities.ChromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptions_MaxmizeScreen {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//To avoid the connection establishment error
		//Reference Link: https://stackoverflow.com/questions/75680149/unable-to-establish-websocket-connection
		options.addArguments("--remote-allow-origins=*");
		
		// To open browser in incognito mode
		//options.addArguments("incognito");
		
		//To open browser in maximized mode
		options.addArguments("start-maximized");
		
		//Browse open in headless mode
		//options.addArguments("headless");
		
		//Disable Extensions
		//options.addArguments("disable-extensions");
		
		//Disable Pop-Up-Blocking
		options.addArguments("disable-popup-blocking");
		
		//Make chrome as default browser
		//options.addArguments("make-default-browser");
		
		//to get version
		options.addArguments("version");
		
		//Disable Info-Bars
		options.addArguments("disable-infobars");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.opencart.com/admin/index.php");
		System.out.println("Execution Completed");
		}

}
