package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByIDEg {

	public static void main(String[] args) throws Exception {

		// chrome driver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// create instance of driver
		WebDriver driver = new ChromeDriver();

		// load webpage under test
		driver.get(
				"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.30oct\\src\\main\\resources\\LocateByIdEg.html");
	
		WebElement usernameField = driver.findElement(By.id("username"));
		System.out.println(usernameField.toString());
		usernameField.sendKeys("testingusername");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
