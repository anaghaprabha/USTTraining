package com.learning.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByNameEg {

	public static void main(String[] args) throws Exception {

		// chrome driver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// create instance of driver
		WebDriver driver = new ChromeDriver();

		// load webpage under test
		driver.get(
				"C:\\Users\\Administrator\\eclipse-workspace\\com.learning.selenium.30oct\\src\\main\\resources\\LocateByNameEg.html");
	
		//locate the text fields
		WebElement userNameField = driver.findElement(By.name("username"));
		
		userNameField.sendKeys("usernametest");
		Thread.sleep(2000);
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("passwordFieldtest");
		Thread.sleep(5000);
		WebElement loginBtn = driver.findElement(By.name("loginBtn"));
		Thread.sleep(1000);
        //click buttontest
		loginBtn.click();
		
		Thread.sleep(2000);
		//locate the message element
		
	
		driver.quit();
		
	}

}
